package com.simphony.pos.dto;

import com.simphony.pos.client.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    SimphonyPosApiDiscount pGuestCheck;
    List<SimphonyPosApiMenuItem> ppMenuItemsEx;
    List<SimphonyPosApiComboMeal> ppComboMealsEx;
    SimphonyPosApiSvcCharge pSvcChargeEx;
    List<SimphonyPosApiDiscount> pSubTotalDiscountEx;
    List<SimphonyPosApiTmedDetailItemEx> pTmedDetailEx2;
    SimphonyPosApiTotalsResponse pTotalsResponseEx;
    List<String> ppCheckPrintLines;
    List<String> ppVoucherOutput;
    List<SimphonyPosApiExtensibility> checkExtensibilityDetails;
}
