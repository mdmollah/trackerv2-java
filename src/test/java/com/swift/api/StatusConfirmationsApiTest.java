/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.api;

import com.swift.ApiException;
import com.swift.model.CamtA0100103;
import com.swift.model.CamtA0100202;
import com.swift.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusConfirmationsApi
 */
@Ignore
public class StatusConfirmationsApiTest {

    private final StatusConfirmationsApi api = new StatusConfirmationsApi();


    /**
     * Status Confirmations
     *
     * This API is a status confirmation update to inform the tracker about the updated status of a given payment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusConfirmationsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        Boolean signatureRequired = null;
        String xApiKey = null;
        CamtA0100103 requestBody = null;
        CamtA0100202 response = api.statusConfirmationsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, signatureRequired, xApiKey, requestBody);

        // TODO: test validations
    }

}
