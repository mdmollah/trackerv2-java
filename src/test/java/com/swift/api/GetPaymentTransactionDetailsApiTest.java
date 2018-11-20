/*
 * gpi API
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 2.0.2
 * Contact: Li.JIE@swift.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.api;

import com.swift.ApiException;
import com.swift.model.CamtA0200103;
import com.swift.model.CamtA0200203;
import com.swift.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetPaymentTransactionDetailsApi
 */
@Ignore
public class GetPaymentTransactionDetailsApiTest {

    private final GetPaymentTransactionDetailsApi api = new GetPaymentTransactionDetailsApi();

    
    /**
     * Get Payment Transaction Details
     *
     * This API is a payment query to get detailed information regarding a given payment. It requires the UETR to be known.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentTransactionDetailsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0200103 requestBody = null;
        CamtA0200203 response = api.getPaymentTransactionDetailsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody);

        // TODO: test validations
    }
    
}