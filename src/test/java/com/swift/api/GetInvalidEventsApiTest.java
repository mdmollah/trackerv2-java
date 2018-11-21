/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.api;

import com.swift.ApiException;
import com.swift.model.CamtA0500103;
import com.swift.model.CamtA0500203;
import com.swift.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetInvalidEventsApi
 */
@Ignore
public class GetInvalidEventsApiTest {

    private final GetInvalidEventsApi api = new GetInvalidEventsApi();


    /**
     * Get Invalid Events
     *
     * This API is a payment events&#39; query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvalidEventsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0500103 requestBody = null;
        CamtA0500203 response = api.getInvalidEventsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody);

        // TODO: test validations
    }

}
