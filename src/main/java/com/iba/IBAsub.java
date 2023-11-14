package com.iba;

import java.io.IOException;

import com.xius.billing.subscribermanagement.*;
import com.xius.billing.subscribermanagement_wsdl.FaultMessage;



public class IBAsub implements com.xius.billing.subscribermanagement_wsdl.SubscriberManagementPortType{ 
	
	public IBAsub() {
		
	}
	
	@Override
	public GetSubscriberInfoResponse getSubscriberInfo(GetSubscriberInfoRequest body) throws FaultMessage {
		
		 GetSubDetailsInvoker invoker = new GetSubDetailsInvoker();
		 GetSubscriberInfoResponse response= new GetSubscriberInfoResponse();
		 System.out.println("Calling GetSubDetailsInvoker");
		response= invoker.getSubscriberInfo(body);
		System.out.println("IBAsub response getExpiryDate  "+response.getExpiryDate());
		System.out.println("IBAsub response getGPRSServStatus "+response.getGPRSServStatus());
		System.out.println("IBAsub response getSimSerialNo "+response.getSimSerialNo());
	
		
		return response;
	}
	
	
	
	@Override
	public GetSubTPDetailsResponse getSubTPDetails(GetSubTPDetailsRequest body) throws FaultMessage {
		
		 GetSubDetailsInvoker invoker = new GetSubDetailsInvoker();
		 GetSubTPDetailsResponse response= new GetSubTPDetailsResponse();
		 try {
			 System.out.println("Calling GetSubTPDetailsInvoker");
			response= invoker.getSubTPDetails(body);
			System.out.println("IBAsub response getSIMNumber  "+response.getSIMNumber());
			System.out.println("IBAsub response getEndDate "+response.getEndDate());
		
		} catch (FaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return response;
	}

	@Override
	public ManageNoteResponse manageNote(ManageNoteRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTPActivationFeeResponse getTPActivationFee(GetTPActivationFeeRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubOptServicesPreInfoResponse subOptServicesPreInfo(SubOptServicesPreInfoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetFreeMDNSResponse getFreeMDNS(GetFreeMDNSRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTariffServicePackDtlsResponse getTariffServicePackDtls(GetTariffServicePackDtlsRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetOfficeNIRResponse getOfficeNIR(GetOfficeNIRRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetNPANXXResponse getNPANXX(GetNPANXXRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public GetNotesResponse getNotes(GetNotesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAccntsCountOfIDResponse getAccntsCountOfID(GetAccntsCountOfIDRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTariffPackageResponse getTariffPackage(GetTariffPackageRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetDeviceInfoResponse getDeviceInfo(GetDeviceInfoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTPDetailsResponse getTPDetails(GetTPDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBndlBucketsResponse getBndlBuckets(GetBndlBucketsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateSubsIDResponse updateSubsID(UpdateSubsIDRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangeLanguagePreInfoResponse changeLanguagePreInfo(ChangeLanguagePreInfoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateDeviceInfoResponse updateDeviceInfo(UpdateDeviceInfoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PUKDetailsResponse pukDetails(PUKDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetDataPlansResponse getDataPlans(GetDataPlansRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetMSISDNTypeResponse getMSISDNType(GetMSISDNTypeRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetTrpltSIMStatusResponse getTrpltSIMStatus(GetTrpltSIMStatusRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBundleDtlsResponse getBundleDtls(GetBundleDtlsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBannerResponse getBanner(GetBannerRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageDataPlansResponse manageDataPlans(ManageDataPlansRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveBucketSummaryResponse activeBucketSummary(ActiveBucketSummaryRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSubViewDataResponse getSubViewData(GetSubViewDataRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetNotificationDataResponse getNotificationData(GetNotificationDataRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscribeOptionalServicesResponse subscribeOptionalServices(SubscribeOptionalServicesRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConfigureServicesResponse configureServices(ConfigureServicesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetCategoryBasedTPsResponse getCategoryBasedTPs(GetCategoryBasedTPsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangeTariffPlanPreInfoResponse changeTariffPlanPreInfo(ChangeTariffPlanPreInfoRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetNIRResponse getNIR(GetNIRRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetRCPreInfoResponse getRCPreInfo(GetRCPreInfoRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangeLanguageResponse changeLanguage(ChangeLanguageRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetMulBndlNameDetailsResponse getMulBndlNameDetails(GetMulBndlNameDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetPublicityIdDetailsResponse getPublicityIdDetails(GetPublicityIdDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelAccountResponse cancelAccount(CancelAccountRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetCorpProductIdResponse getCorpProductId(GetCorpProductIdRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangeAddnlServicePlanResponse changeAddnlServicePlan(ChangeAddnlServicePlanRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriberValidationResponse subscriberValidation(SubscriberValidationRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetETNotifInfoResponse getETNotifInfo(GetETNotifInfoRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangeTariffPlanResponse changeTariffPlan(ChangeTariffPlanRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetsubBaseServicesttResponse getsubBaseServicestt(GetsubBaseServicesttRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateChangeTPResponse initiateChangeTP(InitiateChangeTPRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetPromoDetailsResponse getPromoDetails(GetPromoDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageFnFSMSResponse manageFnFSMS(ManageFnFSMSRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBalanceDetailsResponse getBalanceDetails(GetBalanceDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertNotificationResponse insertNotification(InsertNotificationRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppendBulkIMSIsResponse appendBulkIMSIs(AppendBulkIMSIsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSessionStatusResponse getSessionStatus(GetSessionStatusRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageBannerResponse manageBanner(ManageBannerRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BundlePurchaseResponse bundlePurchase(BundlePurchaseRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAssocMSISDNResponse getAssociatedMSISDNs(GetAssocMSISDNRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBundlesDetailsResponse getBundlesDetails(GetBundlesDetailsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAccountSummaryResponse getAccountSummary(GetAccountSummaryRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetbalanceInfoResponse getBalanceInfo(GetbalanceInfoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdatePromoStatusResponse updatePromoStatus(UpdatePromoStatusRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageBundleResponse manageBundle(ManageBundleRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAttachedPackagesResponse getAttachedPackages(GetAttachedPackagesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddnlServicePlanPreInfoResponse addnlServicePlanPreInfo(AddnlServicePlanPreInfoRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBaseSubsServicesResponse getBaseSubsServices(GetBaseSubsServicesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddNoteResponse addNote(AddNoteRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostPaidPreInfoResponse postPaidPreInfo(PostPaidPreInfoRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSubDataResponse getSubData(GetSubDataRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheckCommercialTPResponse checkCommercialTP(CheckCommercialTPRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetNPANXXForExResponse getNPANXXForEx(GetNPANXXForExRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBucketsResponse getBuckets(GetBucketsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBundlesResponse getBundles(GetBundlesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManagePromoResponse managePromo(ManagePromoRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FluValidationResponse fluValidation(FluValidationRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetBaseATPServicesResponse getBaseATPServices(GetBaseATPServicesRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostPaymtCreditUpdResponse postPaymtCreditUpd(PostPaymtCreditUpdRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelAccountResponsev1 cancelAccountv1(CancelAccountRequestv1 request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceDeleteResponse serviceDelete(ServiceDeleteRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetInitialBalanceResponse setInitialBalance(SetInitialBalanceRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetMultiplePublicityIdDtlsResponse getMultiplePublicityIdDtls(GetMultiplePublicityIdDtlsRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetFnFSMSResponse getFnFSMS(GetFnFSMSRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActOnRegflgDtlsResponse actOnRegflgDtls(ActOnRegflgDtlsRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriberStateChangeResponse subscriberStateChange(SubscriberStateChangeRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateNotificationDataResponse updateNotificationData(UpdateNotificationDataRequest body)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetChngeTpRecquiredResponse getChngeTpRecquired(GetChngeTpRecquiredRequest request) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSubDataPlansResponse getSubDataPlans(GetSubDataPlansRequest body) throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}
	}
