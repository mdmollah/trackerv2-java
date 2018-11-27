package com.swift.example;

import com.swift.ApiException;
import com.swift.api.CancelTransactionsApi;
import com.swift.model.CamtA0600102;
import com.swift.model.CamtA0600202;

public class CancelTransactionsApiExample {

	public static void main(String[] args) {
		
		CancelTransactionsApi apiInstance = new CancelTransactionsApi();
		String laUApplicationID = UtilHelper.getInstance().mymap.get("laUApplicationID"); // String | ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys
		String laUVersion = UtilHelper.getInstance().mymap.get("laUVersion"); // String | version of the LAUSigned header. Mandatory. \"1.0\" for this first release
		String laUCallTime = UtilHelper.getInstance().mymap.get("laUCallTime"); // String | timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ
		String laURequestNonce = UtilHelper.getInstance().mymap.get("laURequestNonce"); // String | a random value generated by the client. Provided with the request and copied by the gpi Connector on the response
		String laUSigned = UtilHelper.getInstance().mymap.get("laUSigned"); // String | service specific HTTP headers
		String laUSignature = UtilHelper.getInstance().mymap.get("laUSignature"); // String | contains the LAU signature, base64 ecoded
		Boolean signatureRequired = Boolean.parseBoolean(
				UtilHelper.getInstance().mymap.get("CancellationStatusConfirmationsApiTest.signatureRequired")); // Boolean | a field indicating that a Signature is required
		String xApiKey = UtilHelper.getInstance().mymap.get("xApi"); // String | An API key given to your application to authenticate against the sandbox URL
        CamtA0600102 requestBody = new CamtA0600102(); // CamtA0600102 | Cancel Transaction Request
        try {
            CamtA0600202 result = apiInstance.cancelTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, signatureRequired, xApiKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CancelTransactionsApi#cancelTransactionsPost");
            e.printStackTrace();
        }

	}

}
