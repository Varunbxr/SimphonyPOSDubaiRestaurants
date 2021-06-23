package com.simphony.pos.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is intended for security purpose, this allows the request from
 * specific servers
 */
@Component
public class CorsFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(CorsFilter.class);

    @Value("${allowed_origins:*}")
    String allowed_origins;
    List<String> allowedDomainArray = new ArrayList<>();

    @PostConstruct
    public void onInit() {
        if ( !"*".equalsIgnoreCase(allowed_origins) ) {
            allowedDomainArray = Arrays.asList(allowed_origins.split(","));
        }
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;


        // if request comes for diffent origin then browser will set the Origin header in request header otherwise null
        String requestedOrigin = request.getHeader("Origin");
        if ( !"*".equalsIgnoreCase(allowed_origins) ) {
            if ( requestedOrigin != null && allowedDomainArray.contains(requestedOrigin) ) {
                // if request origin mathces with allowed origin we are allowing
                // fix for response splitting attack
                requestedOrigin = requestedOrigin.replaceAll("%0d%0a", "");
                response.addHeader("Access-Control-Allow-Origin", requestedOrigin);
            } else {
                // otherwise set anyone of the allowed origin
                response.addHeader("Access-Control-Allow-Origin", allowedDomainArray.get(0));
            }
        } else {
            response.addHeader("Access-Control-Allow-Origin", allowed_origins);
        }
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
/*        response.setHeader("Access-Control-Allow-Headers", "Authorization,Content-Type,Accept, Access-Control-Allow-Headers, " +
                "Origin,Accept, X-Requested-With, ocp-apim-subscription-key,Content-Type, Access-Control-Request-Method," +
                "Access-Control-Request-Headers");*/
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Strict-Transport-Security", "max-age=31536000 ; includeSubDomains");
        response.setHeader("X-Frame-Options", "DENY");
        response.setHeader("Connection", "close");
        //response.setHeader("X-XSS-Protection", "1; mode=block");
        if ( "OPTIONS".equals(request.getMethod()) ) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}
