
package com.xius.billing.subscribermanagement_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2023-10-09T17:15:08.269+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "errorDetailItem", targetNamespace = "http://billing.xius.com/common/error/ErrorDetails.xsd")
public class FaultMessage extends Exception {

    private com.xius.billing.common.error.errordetails.ErrorDetailsType faultInfo;

    public FaultMessage() {
        super();
    }

    public FaultMessage(String message) {
        super(message);
    }

    public FaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, com.xius.billing.common.error.errordetails.ErrorDetailsType errorDetailItem) {
        super(message);
        this.faultInfo = errorDetailItem;
    }

    public FaultMessage(String message, com.xius.billing.common.error.errordetails.ErrorDetailsType errorDetailItem, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = errorDetailItem;
    }

    public com.xius.billing.common.error.errordetails.ErrorDetailsType getFaultInfo() {
        return this.faultInfo;
    }
}
