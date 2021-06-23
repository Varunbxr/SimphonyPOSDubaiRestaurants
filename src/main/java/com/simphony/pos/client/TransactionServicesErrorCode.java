//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionServices_ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionServices_ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AmountNotEntered"/&gt;
 *     &lt;enumeration value="AppInitInProgress"/&gt;
 *     &lt;enumeration value="CCAuthDeclined"/&gt;
 *     &lt;enumeration value="CCAuthDeclinedWithMessage"/&gt;
 *     &lt;enumeration value="CCServerDown"/&gt;
 *     &lt;enumeration value="CheckEmployeeNumberMismatch"/&gt;
 *     &lt;enumeration value="CheckNotFound"/&gt;
 *     &lt;enumeration value="CheckListNotFound"/&gt;
 *     &lt;enumeration value="CheckOpenedOnSystem"/&gt;
 *     &lt;enumeration value="CheckTableNumberMismatch"/&gt;
 *     &lt;enumeration value="ComboMealNotFound"/&gt;
 *     &lt;enumeration value="ConnectionDown"/&gt;
 *     &lt;enumeration value="DataOutOfRange"/&gt;
 *     &lt;enumeration value="DetailDoesNotSupportTriggeredEvents"/&gt;
 *     &lt;enumeration value="DiscountNotFound"/&gt;
 *     &lt;enumeration value="DiscountAmountRequired"/&gt;
 *     &lt;enumeration value="DiscountAmountTooLarge"/&gt;
 *     &lt;enumeration value="DiscountAmountZero"/&gt;
 *     &lt;enumeration value="DiscountItemNotAllowed"/&gt;
 *     &lt;enumeration value="DiscountNotAllowedFilterActive"/&gt;
 *     &lt;enumeration value="DiscountOnParentCombo"/&gt;
 *     &lt;enumeration value="DuplicateLineNumber"/&gt;
 *     &lt;enumeration value="EGatewayClientStartError"/&gt;
 *     &lt;enumeration value="EGatewayClientStopError"/&gt;
 *     &lt;enumeration value="EGatewayConnectionError"/&gt;
 *     &lt;enumeration value="EGatewayConnectionNotInPool"/&gt;
 *     &lt;enumeration value="EGatewayWaitConnectionTimeout"/&gt;
 *     &lt;enumeration value="EmployeeClockIOStatusMismatch"/&gt;
 *     &lt;enumeration value="EmployeeIDMismatch"/&gt;
 *     &lt;enumeration value="EmployeeNotFound"/&gt;
 *     &lt;enumeration value="EmployeeRVCMismatch"/&gt;
 *     &lt;enumeration value="ErrorCreatingGuestcheck"/&gt;
 *     &lt;enumeration value="ErrorInvalidWorkstation"/&gt;
 *     &lt;enumeration value="ErrorReadingCheck"/&gt;
 *     &lt;enumeration value="ErrorPickupCheck"/&gt;
 *     &lt;enumeration value="FailedDataStoreInitialization"/&gt;
 *     &lt;enumeration value="FailedDbSettingLoad"/&gt;
 *     &lt;enumeration value="FailedErrorTranslationInitial"/&gt;
 *     &lt;enumeration value="FailedPostCARequest"/&gt;
 *     &lt;enumeration value="FailedInitialization"/&gt;
 *     &lt;enumeration value="FailedLoggerInitialization"/&gt;
 *     &lt;enumeration value="FailedSecurityAPIInitialization"/&gt;
 *     &lt;enumeration value="FailedSubmitPrintJob"/&gt;
 *     &lt;enumeration value="InternalCommunicationError"/&gt;
 *     &lt;enumeration value="InternalProcessingError"/&gt;
 *     &lt;enumeration value="InvalidArguments"/&gt;
 *     &lt;enumeration value="InvaildAuthCode"/&gt;
 *     &lt;enumeration value="InvalidCheckNumber"/&gt;
 *     &lt;enumeration value="InvalidCreditCardExpirationDate"/&gt;
 *     &lt;enumeration value="InvalidCreditCardHost"/&gt;
 *     &lt;enumeration value="InvalidCreditCardNumber"/&gt;
 *     &lt;enumeration value="InvalidClientName"/&gt;
 *     &lt;enumeration value="InvalidClosedDays"/&gt;
 *     &lt;enumeration value="InvalidConfigInfoRequestType"/&gt;
 *     &lt;enumeration value="InvalidConfigInfoType"/&gt;
 *     &lt;enumeration value="InvalidCustomerInfo"/&gt;
 *     &lt;enumeration value="InvalidDetailLine"/&gt;
 *     &lt;enumeration value="InvalidDetailLineType"/&gt;
 *     &lt;enumeration value="InvalidEmployeeNumber"/&gt;
 *     &lt;enumeration value="InvalidGuestCount"/&gt;
 *     &lt;enumeration value="InvalidLineNumber"/&gt;
 *     &lt;enumeration value="InvalidMenuItemPrice"/&gt;
 *     &lt;enumeration value="InvalidOrderTypeNumber"/&gt;
 *     &lt;enumeration value="InvalidPropertyNum"/&gt;
 *     &lt;enumeration value="InvalidRvcNum"/&gt;
 *     &lt;enumeration value="InvalidServingPeriod"/&gt;
 *     &lt;enumeration value="InvalidTableNumber"/&gt;
 *     &lt;enumeration value="InvalidTranslationSpecifier"/&gt;
 *     &lt;enumeration value="ItemDiscountNeedsParentItem"/&gt;
 *     &lt;enumeration value="LicensingFailed"/&gt;
 *     &lt;enumeration value="MenuItemOutOfOrder"/&gt;
 *     &lt;enumeration value="MissingDetailLinesElement"/&gt;
 *     &lt;enumeration value="MissingTransactionElement"/&gt;
 *     &lt;enumeration value="MissingTransactionHeaderElement"/&gt;
 *     &lt;enumeration value="NoRequestHeader"/&gt;
 *     &lt;enumeration value="NoSalesForDiscount"/&gt;
 *     &lt;enumeration value="NotImplemented"/&gt;
 *     &lt;enumeration value="NoSalesToApplyServiceCharge"/&gt;
 *     &lt;enumeration value="NullInput"/&gt;
 *     &lt;enumeration value="PaidPartially"/&gt;
 *     &lt;enumeration value="PaymentAborted"/&gt;
 *     &lt;enumeration value="PriceMenuItemWithZeroAmount"/&gt;
 *     &lt;enumeration value="SecurityInitFailed"/&gt;
 *     &lt;enumeration value="ServiceChargeTaxClassNotFound"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="TenderTypeNotFound"/&gt;
 *     &lt;enumeration value="TransactionEmployeeNotFound"/&gt;
 *     &lt;enumeration value="TranslationFileNotAvailable"/&gt;
 *     &lt;enumeration value="UnhandledException"/&gt;
 *     &lt;enumeration value="UnknownCreditCardType"/&gt;
 *     &lt;enumeration value="UnknownExceptionCode"/&gt;
 *     &lt;enumeration value="TransactionLocked"/&gt;
 *     &lt;enumeration value="WorkstationNotification"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionServices_ErrorCode")
@XmlEnum
public enum TransactionServicesErrorCode {

    @XmlEnumValue("AmountNotEntered")
    AMOUNT_NOT_ENTERED("AmountNotEntered"),
    @XmlEnumValue("AppInitInProgress")
    APP_INIT_IN_PROGRESS("AppInitInProgress"),
    @XmlEnumValue("CCAuthDeclined")
    CC_AUTH_DECLINED("CCAuthDeclined"),
    @XmlEnumValue("CCAuthDeclinedWithMessage")
    CC_AUTH_DECLINED_WITH_MESSAGE("CCAuthDeclinedWithMessage"),
    @XmlEnumValue("CCServerDown")
    CC_SERVER_DOWN("CCServerDown"),
    @XmlEnumValue("CheckEmployeeNumberMismatch")
    CHECK_EMPLOYEE_NUMBER_MISMATCH("CheckEmployeeNumberMismatch"),
    @XmlEnumValue("CheckNotFound")
    CHECK_NOT_FOUND("CheckNotFound"),
    @XmlEnumValue("CheckListNotFound")
    CHECK_LIST_NOT_FOUND("CheckListNotFound"),
    @XmlEnumValue("CheckOpenedOnSystem")
    CHECK_OPENED_ON_SYSTEM("CheckOpenedOnSystem"),
    @XmlEnumValue("CheckTableNumberMismatch")
    CHECK_TABLE_NUMBER_MISMATCH("CheckTableNumberMismatch"),
    @XmlEnumValue("ComboMealNotFound")
    COMBO_MEAL_NOT_FOUND("ComboMealNotFound"),
    @XmlEnumValue("ConnectionDown")
    CONNECTION_DOWN("ConnectionDown"),
    @XmlEnumValue("DataOutOfRange")
    DATA_OUT_OF_RANGE("DataOutOfRange"),
    @XmlEnumValue("DetailDoesNotSupportTriggeredEvents")
    DETAIL_DOES_NOT_SUPPORT_TRIGGERED_EVENTS("DetailDoesNotSupportTriggeredEvents"),
    @XmlEnumValue("DiscountNotFound")
    DISCOUNT_NOT_FOUND("DiscountNotFound"),
    @XmlEnumValue("DiscountAmountRequired")
    DISCOUNT_AMOUNT_REQUIRED("DiscountAmountRequired"),
    @XmlEnumValue("DiscountAmountTooLarge")
    DISCOUNT_AMOUNT_TOO_LARGE("DiscountAmountTooLarge"),
    @XmlEnumValue("DiscountAmountZero")
    DISCOUNT_AMOUNT_ZERO("DiscountAmountZero"),
    @XmlEnumValue("DiscountItemNotAllowed")
    DISCOUNT_ITEM_NOT_ALLOWED("DiscountItemNotAllowed"),
    @XmlEnumValue("DiscountNotAllowedFilterActive")
    DISCOUNT_NOT_ALLOWED_FILTER_ACTIVE("DiscountNotAllowedFilterActive"),
    @XmlEnumValue("DiscountOnParentCombo")
    DISCOUNT_ON_PARENT_COMBO("DiscountOnParentCombo"),
    @XmlEnumValue("DuplicateLineNumber")
    DUPLICATE_LINE_NUMBER("DuplicateLineNumber"),
    @XmlEnumValue("EGatewayClientStartError")
    E_GATEWAY_CLIENT_START_ERROR("EGatewayClientStartError"),
    @XmlEnumValue("EGatewayClientStopError")
    E_GATEWAY_CLIENT_STOP_ERROR("EGatewayClientStopError"),
    @XmlEnumValue("EGatewayConnectionError")
    E_GATEWAY_CONNECTION_ERROR("EGatewayConnectionError"),
    @XmlEnumValue("EGatewayConnectionNotInPool")
    E_GATEWAY_CONNECTION_NOT_IN_POOL("EGatewayConnectionNotInPool"),
    @XmlEnumValue("EGatewayWaitConnectionTimeout")
    E_GATEWAY_WAIT_CONNECTION_TIMEOUT("EGatewayWaitConnectionTimeout"),
    @XmlEnumValue("EmployeeClockIOStatusMismatch")
    EMPLOYEE_CLOCK_IO_STATUS_MISMATCH("EmployeeClockIOStatusMismatch"),
    @XmlEnumValue("EmployeeIDMismatch")
    EMPLOYEE_ID_MISMATCH("EmployeeIDMismatch"),
    @XmlEnumValue("EmployeeNotFound")
    EMPLOYEE_NOT_FOUND("EmployeeNotFound"),
    @XmlEnumValue("EmployeeRVCMismatch")
    EMPLOYEE_RVC_MISMATCH("EmployeeRVCMismatch"),
    @XmlEnumValue("ErrorCreatingGuestcheck")
    ERROR_CREATING_GUESTCHECK("ErrorCreatingGuestcheck"),
    @XmlEnumValue("ErrorInvalidWorkstation")
    ERROR_INVALID_WORKSTATION("ErrorInvalidWorkstation"),
    @XmlEnumValue("ErrorReadingCheck")
    ERROR_READING_CHECK("ErrorReadingCheck"),
    @XmlEnumValue("ErrorPickupCheck")
    ERROR_PICKUP_CHECK("ErrorPickupCheck"),
    @XmlEnumValue("FailedDataStoreInitialization")
    FAILED_DATA_STORE_INITIALIZATION("FailedDataStoreInitialization"),
    @XmlEnumValue("FailedDbSettingLoad")
    FAILED_DB_SETTING_LOAD("FailedDbSettingLoad"),
    @XmlEnumValue("FailedErrorTranslationInitial")
    FAILED_ERROR_TRANSLATION_INITIAL("FailedErrorTranslationInitial"),
    @XmlEnumValue("FailedPostCARequest")
    FAILED_POST_CA_REQUEST("FailedPostCARequest"),
    @XmlEnumValue("FailedInitialization")
    FAILED_INITIALIZATION("FailedInitialization"),
    @XmlEnumValue("FailedLoggerInitialization")
    FAILED_LOGGER_INITIALIZATION("FailedLoggerInitialization"),
    @XmlEnumValue("FailedSecurityAPIInitialization")
    FAILED_SECURITY_API_INITIALIZATION("FailedSecurityAPIInitialization"),
    @XmlEnumValue("FailedSubmitPrintJob")
    FAILED_SUBMIT_PRINT_JOB("FailedSubmitPrintJob"),
    @XmlEnumValue("InternalCommunicationError")
    INTERNAL_COMMUNICATION_ERROR("InternalCommunicationError"),
    @XmlEnumValue("InternalProcessingError")
    INTERNAL_PROCESSING_ERROR("InternalProcessingError"),
    @XmlEnumValue("InvalidArguments")
    INVALID_ARGUMENTS("InvalidArguments"),
    @XmlEnumValue("InvaildAuthCode")
    INVAILD_AUTH_CODE("InvaildAuthCode"),
    @XmlEnumValue("InvalidCheckNumber")
    INVALID_CHECK_NUMBER("InvalidCheckNumber"),
    @XmlEnumValue("InvalidCreditCardExpirationDate")
    INVALID_CREDIT_CARD_EXPIRATION_DATE("InvalidCreditCardExpirationDate"),
    @XmlEnumValue("InvalidCreditCardHost")
    INVALID_CREDIT_CARD_HOST("InvalidCreditCardHost"),
    @XmlEnumValue("InvalidCreditCardNumber")
    INVALID_CREDIT_CARD_NUMBER("InvalidCreditCardNumber"),
    @XmlEnumValue("InvalidClientName")
    INVALID_CLIENT_NAME("InvalidClientName"),
    @XmlEnumValue("InvalidClosedDays")
    INVALID_CLOSED_DAYS("InvalidClosedDays"),
    @XmlEnumValue("InvalidConfigInfoRequestType")
    INVALID_CONFIG_INFO_REQUEST_TYPE("InvalidConfigInfoRequestType"),
    @XmlEnumValue("InvalidConfigInfoType")
    INVALID_CONFIG_INFO_TYPE("InvalidConfigInfoType"),
    @XmlEnumValue("InvalidCustomerInfo")
    INVALID_CUSTOMER_INFO("InvalidCustomerInfo"),
    @XmlEnumValue("InvalidDetailLine")
    INVALID_DETAIL_LINE("InvalidDetailLine"),
    @XmlEnumValue("InvalidDetailLineType")
    INVALID_DETAIL_LINE_TYPE("InvalidDetailLineType"),
    @XmlEnumValue("InvalidEmployeeNumber")
    INVALID_EMPLOYEE_NUMBER("InvalidEmployeeNumber"),
    @XmlEnumValue("InvalidGuestCount")
    INVALID_GUEST_COUNT("InvalidGuestCount"),
    @XmlEnumValue("InvalidLineNumber")
    INVALID_LINE_NUMBER("InvalidLineNumber"),
    @XmlEnumValue("InvalidMenuItemPrice")
    INVALID_MENU_ITEM_PRICE("InvalidMenuItemPrice"),
    @XmlEnumValue("InvalidOrderTypeNumber")
    INVALID_ORDER_TYPE_NUMBER("InvalidOrderTypeNumber"),
    @XmlEnumValue("InvalidPropertyNum")
    INVALID_PROPERTY_NUM("InvalidPropertyNum"),
    @XmlEnumValue("InvalidRvcNum")
    INVALID_RVC_NUM("InvalidRvcNum"),
    @XmlEnumValue("InvalidServingPeriod")
    INVALID_SERVING_PERIOD("InvalidServingPeriod"),
    @XmlEnumValue("InvalidTableNumber")
    INVALID_TABLE_NUMBER("InvalidTableNumber"),
    @XmlEnumValue("InvalidTranslationSpecifier")
    INVALID_TRANSLATION_SPECIFIER("InvalidTranslationSpecifier"),
    @XmlEnumValue("ItemDiscountNeedsParentItem")
    ITEM_DISCOUNT_NEEDS_PARENT_ITEM("ItemDiscountNeedsParentItem"),
    @XmlEnumValue("LicensingFailed")
    LICENSING_FAILED("LicensingFailed"),
    @XmlEnumValue("MenuItemOutOfOrder")
    MENU_ITEM_OUT_OF_ORDER("MenuItemOutOfOrder"),
    @XmlEnumValue("MissingDetailLinesElement")
    MISSING_DETAIL_LINES_ELEMENT("MissingDetailLinesElement"),
    @XmlEnumValue("MissingTransactionElement")
    MISSING_TRANSACTION_ELEMENT("MissingTransactionElement"),
    @XmlEnumValue("MissingTransactionHeaderElement")
    MISSING_TRANSACTION_HEADER_ELEMENT("MissingTransactionHeaderElement"),
    @XmlEnumValue("NoRequestHeader")
    NO_REQUEST_HEADER("NoRequestHeader"),
    @XmlEnumValue("NoSalesForDiscount")
    NO_SALES_FOR_DISCOUNT("NoSalesForDiscount"),
    @XmlEnumValue("NotImplemented")
    NOT_IMPLEMENTED("NotImplemented"),
    @XmlEnumValue("NoSalesToApplyServiceCharge")
    NO_SALES_TO_APPLY_SERVICE_CHARGE("NoSalesToApplyServiceCharge"),
    @XmlEnumValue("NullInput")
    NULL_INPUT("NullInput"),
    @XmlEnumValue("PaidPartially")
    PAID_PARTIALLY("PaidPartially"),
    @XmlEnumValue("PaymentAborted")
    PAYMENT_ABORTED("PaymentAborted"),
    @XmlEnumValue("PriceMenuItemWithZeroAmount")
    PRICE_MENU_ITEM_WITH_ZERO_AMOUNT("PriceMenuItemWithZeroAmount"),
    @XmlEnumValue("SecurityInitFailed")
    SECURITY_INIT_FAILED("SecurityInitFailed"),
    @XmlEnumValue("ServiceChargeTaxClassNotFound")
    SERVICE_CHARGE_TAX_CLASS_NOT_FOUND("ServiceChargeTaxClassNotFound"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("TenderTypeNotFound")
    TENDER_TYPE_NOT_FOUND("TenderTypeNotFound"),
    @XmlEnumValue("TransactionEmployeeNotFound")
    TRANSACTION_EMPLOYEE_NOT_FOUND("TransactionEmployeeNotFound"),
    @XmlEnumValue("TranslationFileNotAvailable")
    TRANSLATION_FILE_NOT_AVAILABLE("TranslationFileNotAvailable"),
    @XmlEnumValue("UnhandledException")
    UNHANDLED_EXCEPTION("UnhandledException"),
    @XmlEnumValue("UnknownCreditCardType")
    UNKNOWN_CREDIT_CARD_TYPE("UnknownCreditCardType"),
    @XmlEnumValue("UnknownExceptionCode")
    UNKNOWN_EXCEPTION_CODE("UnknownExceptionCode"),
    @XmlEnumValue("TransactionLocked")
    TRANSACTION_LOCKED("TransactionLocked"),
    @XmlEnumValue("WorkstationNotification")
    WORKSTATION_NOTIFICATION("WorkstationNotification");
    private final String value;

    TransactionServicesErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionServicesErrorCode fromValue(String v) {
        for (TransactionServicesErrorCode c: TransactionServicesErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}