package com.iba.exchangeImpl;

import org.apache.camel.Exchange;

import com.iba.IBAsub;
import com.xius.billing.subscribermanagement.GetSubTPDetailsRequest;
import com.xius.billing.subscribermanagement.GetSubscriberInfoRequest;
import com.xius.billing.subscribermanagement.GetSubscriberInfoResponse;
import com.xius.billing.subscribermanagement.OptionType;
import com.xius.billing.subscribermanagement_wsdl.FaultMessage;

public class TRANS_IBA   {
		
		
		 IBAsub iBAsub = new IBAsub();
		 
			/*
			 * public void subTPDetails(Exchange exchange) throws FaultMessage {
			 * 
			 * GetSubTPDetailsRequest getSubTPDetailsRequest= new GetSubTPDetailsRequest();
			 * // Exchange exchange= RequestProcessorBean.getExchange();
			 * System.out.println("TRANS_IBA  msisdn " + exchange.getProperty("msisdn",
			 * String.class));
			 * getSubTPDetailsRequest.setMSISDN(exchange.getProperty("msisdn",
			 * String.class));
			 * 
			 * iBAsub.getSubTPDetails(getSubTPDetailsRequest); }
			 */
		
		public void getSubscriberInfo(Exchange exchange) throws FaultMessage {
			GetSubscriberInfoRequest req= new GetSubscriberInfoRequest();
			OptionType optionType= new OptionType();
			optionType.setMSISDN(exchange.getProperty("msisdn", String.class));
			req.setOption(optionType);
			
			GetSubscriberInfoResponse re=iBAsub.getSubscriberInfo(req);
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - SimSerialNo " +re.getSimSerialNo() );
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getGPRSServStatus " +re.getGPRSServStatus() );
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getExpiryDate " +re.getExpiryDate() );
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getActivationDate " +re.getActivationDate() );
			
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getLastCallDate " +re.getLastCallDate() );
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getLastTransAction " +re.getLastTransAction() );
			
			System.out.println("TRANS_IBA - GetSubscriberInfoResponse - getLanguage " +re.getLanguage() );
			
			exchange.setProperty("SimSerialNo", re.getSimSerialNo());
		}
		
			 
	
	}
	
	

