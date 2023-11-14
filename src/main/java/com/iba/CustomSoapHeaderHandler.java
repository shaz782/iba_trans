package com.iba;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class CustomSoapHeaderHandler implements SOAPHandler<SOAPMessageContext> {
	@Override
	public Set<QName> getHeaders() {
		return null; // Return null or an empty set if you don't need to examine headers
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isOutbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (isOutbound) {
			try {
				// Get the SOAP message from the context
				SOAPMessage soapMessage = context.getMessage();

				// Get or create the SOAP header
				SOAPHeader soapHeader = soapMessage.getSOAPHeader();
				if (soapHeader == null) {
					soapHeader = soapMessage.getSOAPPart().getEnvelope().addHeader();
				} else {
					System.out.println("SOAPHeader is null");
				}

				// Create your custom header element
				SOAPElement customHeaderElement = soapHeader.addChildElement(
						new QName("http://billing.xius.com/common/header/HeaderDetails.xsd", "messageHeader"));

				// Create child elements under customHeaderElement
				SOAPElement trackingMessageHeader = customHeaderElement.addChildElement("trackingMessageHeader");
				SOAPElement messageId = trackingMessageHeader.addChildElement("messageId");
				messageId.addTextNode("1");
				SOAPElement carrierId = trackingMessageHeader.addChildElement("carrierId");
				carrierId.addTextNode("1");
				SOAPElement userId = trackingMessageHeader.addChildElement("userId");
				userId.addTextNode("chief");
				SOAPElement password = trackingMessageHeader.addChildElement("password");
				password.addTextNode("12345678");
				// Save the changes to the SOAP message
				soapMessage.saveChanges();
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		}

		return true;
	}


	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// Handle faults if necessary
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// Clean up resources if needed
	}
}
