package com.simphony.pos.controller;


import com.google.gson.Gson;
import com.simphony.pos.client.*;
import com.simphony.pos.dto.Cart;
import com.simphony.pos.dto.OrderObject;
import com.simphony.pos.services.PostTransactionExClient;
import com.simphony.pos.util.AppConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Holder;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    PostTransactionExClient postTransactionExClient;

    @Autowired
    Jaxb2Marshaller marshaller;

    /**
     * createOrder
     *
     * @param orderObject
     * @return
     */
   /* @Operation(summary = "Create Customer Order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Create Customer Order",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = OrderObject.class))}),
            @ApiResponse(responseCode = "204", description = "No Content",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Unfortunately, we are facing an issue at our end. Please try again later'}"))}),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
            @ApiResponse(responseCode = "422", description = "Un-Processable Entity", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
    })
    @PostMapping(value = "/createorder", produces = {"application/json"})
    public ResponseEntity<?> createorder(@RequestBody OrderObject orderObject) {
        LOGGER.info("Came here to Create the customer Order {} ", new Gson().toJson(orderObject));
        LOGGER.info("Came here to Create the customer Order {} ", orderObject.getCart().get(0).getName());
        Map<String, String> message;
        try {
            SimphonyPosApiGuestCheck guestCheck = new SimphonyPosApiGuestCheck();
            Holder<SimphonyPosApiGuestCheck> pGuestCheck = new Holder<>(guestCheck);

            pGuestCheck.value.setCheckRevenueCenterID(AppConstants.revenueCenterObjectNum);
            pGuestCheck.value.setCheckEmployeeObjectNum(AppConstants.employeeObjectNum);
            pGuestCheck.value.setCheckRevenueCenterID(AppConstants.revenueCenterObjectNum);
            LOGGER.info("Created Guest Check Values for Revenue Center {}, Employment Object {}, Revenue Centre ID {} ", AppConstants.revenueCenterObjectNum, AppConstants.employeeObjectNum, AppConstants.revenueCenterObjectNum);
            ArrayOfString arrayOfString = new ArrayOfString();
            Holder<ArrayOfString> ppCheckPrintLines = new Holder(arrayOfString);
            Holder<ArrayOfString> ppVoucherOutput = new Holder(arrayOfString);
            Holder<SimphonyPosApiTotalsResponse> pTotalsResponse = new Holder<SimphonyPosApiTotalsResponse>();
            SimphonyPosApiDiscount posApiDiscount = new SimphonyPosApiDiscount();
            Holder<SimphonyPosApiDiscount> pSubTotalDiscount = new Holder<>(posApiDiscount);
            pSubTotalDiscount.value.setDiscObjectNum(0);
            pSubTotalDiscount.value.setDiscAmountOrPercent("");
            pSubTotalDiscount.value.setDiscReference("");
            SimphonyPosApiSvcCharge posApiSvcCharge = new SimphonyPosApiSvcCharge();
            Holder<SimphonyPosApiSvcCharge> pServiceChg = new Holder<>(posApiSvcCharge);
            pServiceChg.value.setSvcChgAmountOrPercent("0");
            pServiceChg.value.setSvcChgObjectNum(0);
            pServiceChg.value.setSvcChgReference("");
            SimphonyPosApiTmedDetailItemEx simphonyPosApiTmedDetailItemEx = new SimphonyPosApiTmedDetailItemEx();
            Holder<SimphonyPosApiTmedDetailItemEx> pTmedDetail = new Holder<>(simphonyPosApiTmedDetailItemEx);
            pTmedDetail.value.setTmedObjectNum(0);
            pTmedDetail.value.setTmedReference("");
            pTmedDetail.value.setTmedPartialPayment("");
            ArrayOfSimphonyPosApiMenuItemEx menuItem = getMenuItemList(orderObject.getCart());
            LOGGER.info("Menu Item is Not Null {} ", new Gson().toJson(menuItem));
            if ( Objects.isNull(menuItem) ) {
                LOGGER.info("Menu Item is Null{} ", new Gson().toJson(menuItem));
                message = new HashMap<>();
                message.put(AppConstants.MESSAGE, AppConstants.INVALID_CART_DETAILS);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
            }
            Holder<ArrayOfSimphonyPosApiMenuItem> ppMenuItems = new Holder<>(menuItem);

            Holder<ArrayOfSimphonyPosApiComboMeal> ppComboMeals = new Holder<>();
//        SimphonyPosAPIWebSoap simphonyPosAPIWebSoap = new SimphonyPosAPIWeb(new ClassPathResource("SimphonyPosApiWeb.wsdl").getURL()).getSimphonyPosAPIWebSoap();
            LOGGER.info("Finally Going to Hit the Server");
            PostTransactionEx postTransactionEx = new PostTransactionEx();
            postTransactionEx.setVendorCode(AppConstants.vendorCode);
            postTransactionEx.setPGuestCheck(pGuestCheck.value);
            postTransactionEx.setPpComboMeals(ppComboMeals.value);
            postTransactionEx.setPpCheckPrintLines(ppCheckPrintLines.value);
            postTransactionEx.setPTotalsResponse(pTotalsResponse.value);
            postTransactionEx.setPTmedDetail(pTmedDetail.value);
            postTransactionEx.setPSubTotalDiscount(pSubTotalDiscount.value);
            postTransactionEx.setPServiceChg(pServiceChg.value);
            postTransactionEx.setPpVoucherOutput(ppVoucherOutput.value);
            postTransactionEx.setPpMenuItems(ppMenuItems.value);
            StringWriter sw = new StringWriter();
            Result result = new StreamResult(sw);
            marshaller.marshal(postTransactionEx, result);
            LOGGER.info("{}", sw.toString());
            PostTransactionExResponse postTransactionExResponse = postTransactionExClient.postTransaction(postTransactionEx);
            LOGGER.info("Finally Done Hitting the Server Expect Orders to be created \n\n {}", postTransactionExResponse);
            StringWriter sw1 = new StringWriter();
            Result result1 = new StreamResult(sw1);
            marshaller.marshal(postTransactionExResponse, result1);
            LOGGER.info(" Post Response {}", sw1.toString());
            message = new HashMap<>();
            message.put(AppConstants.MESSAGE, AppConstants.SUCCESSFULLY_PLACED);
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            e.printStackTrace();
            message = new HashMap<>();
            message.put(AppConstants.MESSAGE, AppConstants.ERROR_MESSAGE);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }
    }*/


    /**
     * createOrder
     *
     * @param orderObject
     * @return
     */
    @Operation(summary = "Create Customer Order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Create Customer Order",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = OrderObject.class))}),
            @ApiResponse(responseCode = "204", description = "No Content",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Unfortunately, we are facing an issue at our end. Please try again later'}"))}),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
            @ApiResponse(responseCode = "422", description = "Un-Processable Entity", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {@Content(mediaType = "application/json",
                    examples = @ExampleObject("{'error': 'Kindly provide valid details to proceed'}"))}),
    })
    @PostMapping(value = "/createorder", produces = {"application/json"})
    public ResponseEntity<?> createorderWithNewApi(@RequestBody OrderObject orderObject) {
        LOGGER.info("Came here to Create the customer Order {} ", new Gson().toJson(orderObject));
        LOGGER.info("Came here to Create the customer Order {} ", orderObject.getCart().get(0).getName());
        Map<String, String> message;
        try {
            SimphonyPosApiGuestCheck pGuestCheck = new SimphonyPosApiGuestCheck();
            ArrayOfSimphonyPosApiMenuItemEx ppMenuItemsEx = new ArrayOfSimphonyPosApiMenuItemEx();
            ArrayOfSimphonyPosApiComboMealEx ppComboMealsEx = new ArrayOfSimphonyPosApiComboMealEx();
            SimphonyPosApiSvcChargeEx pSvcChargeEx = new SimphonyPosApiSvcChargeEx();
            ArrayOfSimphonyPosApiDiscountEx pSubTotalDiscountEx = new ArrayOfSimphonyPosApiDiscountEx();
            ArrayOfSimphonyPosApiTmedDetailItemEx2 pTmedDetailEx2 = new ArrayOfSimphonyPosApiTmedDetailItemEx2();
            SimphonyPosApiTotalsResponseEx pTotalsResponseEx = new SimphonyPosApiTotalsResponseEx();
            ArrayOfSimphonyPosApiExtensibility checkExtensibilityDetails = new ArrayOfSimphonyPosApiExtensibility();

            pGuestCheck.setCheckRevenueCenterID(AppConstants.revenueCenterObjectNum);
            pGuestCheck.setCheckEmployeeObjectNum(AppConstants.employeeObjectNum);
            pGuestCheck.setCheckRevenueCenterID(AppConstants.revenueCenterObjectNum);

            pSvcChargeEx.setSvcChgAmountOrPercent("0");
            pSvcChargeEx.setSvcChgObjectNum(0);
            pSvcChargeEx.setSvcChgReference("");
            SimphonyPosApiDiscount posApiDiscount = new SimphonyPosApiDiscount();
            Holder<SimphonyPosApiDiscount> pSubTotalDiscount = new Holder<>(posApiDiscount);

            pSubTotalDiscount.value.setDiscObjectNum(0);
            pSubTotalDiscount.value.setDiscAmountOrPercent("");
            pSubTotalDiscount.value.setDiscReference("");

            SimphonyPosApiTmedDetailItemEx2 simphonyPosApiTmedDetailItemEx2  = new SimphonyPosApiTmedDetailItemEx2();
            SimphonyPosApiEPaymentEx  simphonyPosApiEPaymentEx = new SimphonyPosApiEPaymentEx();

            simphonyPosApiEPaymentEx.setAccountDataSource(EAccountDataSource.SOURCE_UNDEFINED);
            simphonyPosApiEPaymentEx.setAccountType(EAccountType.ACCOUNT_TYPE_UNDEFINED);
            simphonyPosApiEPaymentEx.setPaymentCommand(EPaymentDirective.NO_E_PAYMENT);
            simphonyPosApiEPaymentEx.setInterfaceName("1001");

            simphonyPosApiTmedDetailItemEx2.setTmedObjectNum(1001);
            simphonyPosApiTmedDetailItemEx2.setTmedPartialPayment("");
            simphonyPosApiTmedDetailItemEx2.setTmedReference("");
            simphonyPosApiTmedDetailItemEx2.setTmedEPayment(simphonyPosApiEPaymentEx);
            pTmedDetailEx2.getSimphonyPosApiTmedDetailItemEx2().add(simphonyPosApiTmedDetailItemEx2);

            ArrayOfSimphonyPosApiMenuItemEx menuItem = getMenuItemList(orderObject.getCart());
            LOGGER.info("Menu Item is Not Null {} ", new Gson().toJson(menuItem));
            if ( Objects.isNull(menuItem) ) {
                LOGGER.info("Menu Item is Null{} ", new Gson().toJson(menuItem));
                message = new HashMap<>();
                message.put(AppConstants.MESSAGE, AppConstants.INVALID_CART_DETAILS);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
            }
            LOGGER.info("Finally Going to Hit the Server");
            PostTransactionEx2 postTransactionEx = new PostTransactionEx2();
            postTransactionEx.setPpCheckPrintLines(new ArrayOfString());
            postTransactionEx.setPpVoucherOutput(new ArrayOfString());
            postTransactionEx.setPGuestCheck(pGuestCheck);
            postTransactionEx.setPTotalsResponseEx(pTotalsResponseEx);
            postTransactionEx.setPSubTotalDiscountEx(pSubTotalDiscountEx);
            postTransactionEx.setPpComboMealsEx(ppComboMealsEx);
            postTransactionEx.setPTmedDetailEx2(pTmedDetailEx2);
            postTransactionEx.setPSvcChargeEx(pSvcChargeEx);
            postTransactionEx.setPpMenuItemsEx(menuItem);
            StringWriter sw = new StringWriter();
            Result result = new StreamResult(sw);
            marshaller.marshal(postTransactionEx, result);
            LOGGER.info("{}", sw.toString());
            PostTransactionEx2Response postTransactionExResponse = postTransactionExClient.postTransaction(postTransactionEx);
            LOGGER.info("Finally Done Hitting the Server Expect Orders to be created \n\n {}", postTransactionExResponse);
            StringWriter sw1 = new StringWriter();
            Result result1 = new StreamResult(sw1);
            marshaller.marshal(postTransactionExResponse, result1);
            LOGGER.info(" Post Response {}", sw1.toString());
            message = new HashMap<>();
            message.put(AppConstants.MESSAGE, AppConstants.SUCCESSFULLY_PLACED);
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            e.printStackTrace();
            message = new HashMap<>();
            message.put(AppConstants.MESSAGE, AppConstants.ERROR_MESSAGE);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }
    }

    private ArrayOfSimphonyPosApiMenuItemEx getMenuItemList(List<Cart> cartValue) {
        if ( CollectionUtils.isEmpty(cartValue) ) {
            return null;
        }
        ArrayOfSimphonyPosApiMenuItemEx menuItem = new ArrayOfSimphonyPosApiMenuItemEx();
        List<SimphonyPosApiMenuItemEx> posApiMenuItems = cartValue
                .stream()
                .map(cart -> {
                    SimphonyPosApiMenuItemEx posApiMenuItem = new SimphonyPosApiMenuItemEx();
                    SimphonyPosApiMenuItemDefinitionEx simphonyPosApiMenuItemDefinition = new SimphonyPosApiMenuItemDefinitionEx();
                    simphonyPosApiMenuItemDefinition.setMiPriceLevel(cart.getPrice());
                    simphonyPosApiMenuItemDefinition.setMiObjectNum(cart.getItemId());
                    simphonyPosApiMenuItemDefinition.setMiOverridePrice(cart.getTotalPrice().toString());
                    /*String instructionWithQuantity = "<ExtraData><MiQuantity>" + cart.getItemQty() + "</MiQuantity></ExtraData>" + cart.getComment();
                    simphonyPosApiMenuItemDefinition.setMiReference(instructionWithQuantity);*/
                    posApiMenuItem.setMenuItem(simphonyPosApiMenuItemDefinition);
                    if ( !CollectionUtils.isEmpty(cart.getCondimentList()) ) {
                        ArrayOfSimphonyPosApiMenuItemDefinitionEx arrayOfSimphonyPosApiMenuItem = new ArrayOfSimphonyPosApiMenuItemDefinitionEx();
                        List<SimphonyPosApiMenuItemDefinitionEx> simphonyPosApiCondimentsItems = cart.getCondimentList()
                                .stream()
                                .map(condiments -> {
                                    SimphonyPosApiMenuItemDefinitionEx simphonyPosApiMenuItemDefinition1 = new SimphonyPosApiMenuItemDefinitionEx();
                                    simphonyPosApiMenuItemDefinition1.setMiObjectNum(condiments.getId());
                                    simphonyPosApiMenuItemDefinition1.setMiOverridePrice(condiments.getPrice().toString());
                                    simphonyPosApiMenuItemDefinition1.setMiPriceLevel(condiments.getPrice());
                                 /*   String instructionWithQuantity1 = "<ExtraData><MiQuantity>" + condiments.getQuantity() + "</MiQuantity></ExtraData>";
                                    simphonyPosApiMenuItemDefinition1.setMiReference(instructionWithQuantity1);*/
                                    return simphonyPosApiMenuItemDefinition1;
                                })
                                .collect(Collectors.toList());
                        arrayOfSimphonyPosApiMenuItem.getSimphonyPosApiMenuItemDefinitionEx().addAll(simphonyPosApiCondimentsItems);
                        posApiMenuItem.setCondiments(arrayOfSimphonyPosApiMenuItem);
                    }
                    return posApiMenuItem;
                })
                .collect(Collectors.toList());
        menuItem.getSimphonyPosApiMenuItemEx().addAll(posApiMenuItems);
        return menuItem;
    }


}
