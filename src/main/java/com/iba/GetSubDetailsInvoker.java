
package com.iba;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.xius.billing.subscribermanagement.GetSubTPDetailsRequest;
import com.xius.billing.subscribermanagement.GetSubTPDetailsResponse;
import com.xius.billing.subscribermanagement.GetSubscriberInfoRequest;
import com.xius.billing.subscribermanagement.GetSubscriberInfoResponse;
import com.xius.billing.subscribermanagement_wsdl.FaultMessage;
import com.xius.billing.subscribermanagement_wsdl.SubscriberManagementPortType;
import com.xius.billing.subscribermanagement_wsdl.SubscriberService;

public class GetSubDetailsInvoker {

	public GetSubTPDetailsResponse getSubTPDetails(GetSubTPDetailsRequest ibarequest) throws FaultMessage, IOException {

		/*
		 * String url
		 * ="http://192.168.149.221:12380/infinetbilling/services/SubscriberManagementPort?wsdl";
		 */

		GetSubTPDetailsResponse response = new GetSubTPDetailsResponse();
		try {
			// Replace this URL with the actual URL of the server's WSDL file

			URL wsdlURL = new URL("http://192.168.149.221:12380/infinetbilling/services/SubscriberManagementPort?wsdl");

			// Create an instance of SubscriberService with the WSDL location
			System.out.println("ibarequest "+ibarequest.getMSISDN());
			SubscriberService subscriberService = new SubscriberService(wsdlURL);

			// Get the port and invoke service operations as shown in the previous response
			System.out.println("Calling getSubscriberManagementPort");
			SubscriberManagementPortType port = subscriberService.getSubscriberManagementPort();

			System.out.println("Calling BindingProvider");

			BindingProvider bindingProvider = (BindingProvider) port;
			List<Handler> handlerChain = bindingProvider.getBinding().getHandlerChain();
			if (handlerChain == null) {
				handlerChain = new ArrayList<>();
			}
			System.out.println("Calling CustomSoapHeaderHandler");
			handlerChain.add(new CustomSoapHeaderHandler());
			System.out.println("Calling setHandlerChain");
			bindingProvider.getBinding().setHandlerChain(handlerChain);

			response = port.getSubTPDetails(ibarequest);

			// Prepare and invoke service operations
			// ...

			// Close the client when done
			((java.io.Closeable) port).close();
		} catch (MalformedURLException e) {
			// Handle the MalformedURLException
			e.printStackTrace();
		} catch (Exception e) {

			if (e instanceof FaultMessage) {
				FaultMessage fm = (FaultMessage) e;
				com.xius.billing.common.error.errordetails.ErrorDetailsType er = fm.getFaultInfo();
				System.out.println("ErrorDetailsType code: " + er.getErrorCode());
				System.out.println("ErrorDetailsType getErrorMessage :" + er.getErrorMessage());
			} else {
				System.out.println("n ot ErrorDetailsType  :");
			}

		}

		return response;

	}

	public GetSubscriberInfoResponse getSubscriberInfo(GetSubscriberInfoRequest ibarequest) {

		
		GetSubscriberInfoResponse response = new GetSubscriberInfoResponse();
		try {
			// Replace this URL with the actual URL of the server's WSDL file

			URL wsdlURL = new URL("http://192.168.149.221:12380/infinetbilling/services/SubscriberManagementPort?wsdl");

			// Create an instance of SubscriberService with the WSDL location
			System.out.println("ibarequest "+ibarequest.getOption().getMSISDN());
			SubscriberService subscriberService = new SubscriberService(wsdlURL);

			// Get the port and invoke service operations as shown in the previous response
			System.out.println("Calling getSubscriberManagementPort");
			SubscriberManagementPortType port = subscriberService.getSubscriberManagementPort();

			System.out.println("Calling BindingProvider");

			BindingProvider bindingProvider = (BindingProvider) port;
			List<Handler> handlerChain = bindingProvider.getBinding().getHandlerChain();
			if (handlerChain == null) {
				handlerChain = new ArrayList<>();
			}
			System.out.println("Calling CustomSoapHeaderHandler");
			handlerChain.add(new CustomSoapHeaderHandler());
			System.out.println("Calling setHandlerChain");
			bindingProvider.getBinding().setHandlerChain(handlerChain);

			response = port.getSubscriberInfo(ibarequest);

			// Prepare and invoke service operations
			// ...

			// Close the client when done
			((java.io.Closeable) port).close();
		} catch (MalformedURLException e) {
			// Handle the MalformedURLException
			e.printStackTrace();
		} catch (Exception e) {

			if (e instanceof FaultMessage) {
				FaultMessage fm = (FaultMessage) e;
				com.xius.billing.common.error.errordetails.ErrorDetailsType er = fm.getFaultInfo();
				System.out.println("ErrorDetailsType code: " + er.getErrorCode());
				System.out.println("ErrorDetailsType getErrorMessage :" + er.getErrorMessage());
			} else {
				System.out.println("n ot ErrorDetailsType  :");
			}

		}

		return response;

	}

}

/*
 * public static SOAPHeaderElement getSoapHeader() {
 * 
 * SOAPHeaderElement header = new
 * SOAPHeaderElement("http://billing.xius.com/common/header/HeaderDetails.xsd",
 * "messageHeader"); header.setActor(null); header.setPrefix("head");
 * SOAPElement cNode; SOAPElement node1; SOAPElement node2; SOAPElement node3;
 * SOAPElement node4; try { cNode =
 * header.addChildElement("trackingMessageHeader"); node1 =
 * cNode.addChildElement("messageId"); node1.addTextNode("1"); node2 =
 * cNode.addChildElement("carrierId"); node2.addTextNode("1"); node3 =
 * cNode.addChildElement("userId"); node3.addTextNode("chief"); node4 =
 * cNode.addChildElement("password"); node4.addTextNode("12345678"); } catch
 * (SOAPException se) { se.printStackTrace(); } return header; } }
 */
