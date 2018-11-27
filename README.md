# tracker-v2-java [![Build Status](https://travis-ci.com/swiftinc/gpi-v2-java.svg?branch=master)](https://travis-ci.com/swiftinc/gpi-v2-java)

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swift</groupId>
    <artifactId>trackerv2-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swift:trackerv2-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/trackerv2-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swift.*;
import com.swift.auth.*;
import com.swift.model.*;
import com.swift.api.CancelTransactionsApi;

import java.io.File;
import java.util.*;

public class CancelTransactionsApiExample {

    public static void main(String[] args) {

        CancelTransactionsApi apiInstance = new CancelTransactionsApi();
        String laUApplicationID = "001"; // String | ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys
        String laUVersion = "1.0"; // String | version of the LAUSigned header. Mandatory. \"1.0\" for this first release
        String laUCallTime = "2018-03-23T15:56:26.728Z"; // String | timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ
        String laURequestNonce = "e802ab96-bb3a-4965-9139-5214b9f0f074"; // String | a random value generated by the client. Provided with the request and copied by the gpi Connector on the response
        String laUSigned = "(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])"; // String | service specific HTTP headers
        String laUSignature = "U1khA8h9Lm1PqzB99fG6uw=="; // String | contains the LAU signature, base64 ecoded
        Boolean signatureRequired = true; // Boolean | a field indicating that a Signature is required
        String xApiKey = "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B"; // String | An API key given to your application to authenticate against the sandbox URL
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

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.swift.com/swift-apitracker-pilot/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CancelTransactionsApi* | [**cancelTransactionsPost**](docs/CancelTransactionsApi.md#cancelTransactionsPost) | **POST** /cancel_transactions | Cancel Transactions
*CancellationStatusConfirmationsApi* | [**cancellationStatusConfirmationsPost**](docs/CancellationStatusConfirmationsApi.md#cancellationStatusConfirmationsPost) | **POST** /cancellation_status_confirmations | Cancellation Status Confirmations
*GetChangedPaymentTransactionsApi* | [**getChangedPaymentTransactionsPost**](docs/GetChangedPaymentTransactionsApi.md#getChangedPaymentTransactionsPost) | **POST** /get_changed_payment_transactions | Get Changed Payment Transactions
*GetInvalidEventsApi* | [**getInvalidEventsPost**](docs/GetInvalidEventsApi.md#getInvalidEventsPost) | **POST** /get_invalid_events | Get Invalid Events
*GetPaymentTransactionDetailsApi* | [**getPaymentTransactionDetailsPost**](docs/GetPaymentTransactionDetailsApi.md#getPaymentTransactionDetailsPost) | **POST** /get_payment_transaction_details | Get Payment Transaction Details
*GetPaymentTransactionsApi* | [**getPaymentTransactionsPost**](docs/GetPaymentTransactionsApi.md#getPaymentTransactionsPost) | **POST** /get_payment_transactions | Get Payment Transactions
*StatusConfirmationsApi* | [**statusConfirmationsPost**](docs/StatusConfirmationsApi.md#statusConfirmationsPost) | **POST** /status_confirmations | Status Confirmations


## Documentation for Models

 - [ActiveCurrencyAndAmount](docs/ActiveCurrencyAndAmount.md)
 - [ActiveOrHistoricCurrencyAndAmount](docs/ActiveOrHistoricCurrencyAndAmount.md)
 - [AgentType1](docs/AgentType1.md)
 - [AmountType1](docs/AmountType1.md)
 - [CamtA0100103](docs/CamtA0100103.md)
 - [CamtA0100202](docs/CamtA0100202.md)
 - [CamtA0200103](docs/CamtA0200103.md)
 - [CamtA0200203](docs/CamtA0200203.md)
 - [CamtA0300103](docs/CamtA0300103.md)
 - [CamtA0300203](docs/CamtA0300203.md)
 - [CamtA0400103](docs/CamtA0400103.md)
 - [CamtA0400203](docs/CamtA0400203.md)
 - [CamtA0500103](docs/CamtA0500103.md)
 - [CamtA0500203](docs/CamtA0500203.md)
 - [CamtA0600102](docs/CamtA0600102.md)
 - [CamtA0600202](docs/CamtA0600202.md)
 - [CamtA0700102](docs/CamtA0700102.md)
 - [CamtA0700202](docs/CamtA0700202.md)
 - [CancelTransactionRequest](docs/CancelTransactionRequest.md)
 - [CancelTransactionResponse](docs/CancelTransactionResponse.md)
 - [CancellationIndividualStatus2Code](docs/CancellationIndividualStatus2Code.md)
 - [CancellationReason6Code](docs/CancellationReason6Code.md)
 - [CancellationRequestDetails1](docs/CancellationRequestDetails1.md)
 - [CancellationResponseDetails1](docs/CancellationResponseDetails1.md)
 - [ChargeBearerType3Code](docs/ChargeBearerType3Code.md)
 - [CoverPaymentEvent1](docs/CoverPaymentEvent1.md)
 - [CreditTransferTransactionParties1](docs/CreditTransferTransactionParties1.md)
 - [CurrencyExchange8](docs/CurrencyExchange8.md)
 - [CustomerCreditTransferTransactionParties1](docs/CustomerCreditTransferTransactionParties1.md)
 - [DateTimePeriodDetails](docs/DateTimePeriodDetails.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [ErrorCodeStatus](docs/ErrorCodeStatus.md)
 - [GetChangedPaymentTransactionsRequest](docs/GetChangedPaymentTransactionsRequest.md)
 - [GetChangedPaymentTransactionsResponse](docs/GetChangedPaymentTransactionsResponse.md)
 - [GetInvalidEventsRequest](docs/GetInvalidEventsRequest.md)
 - [GetInvalidEventsResponse](docs/GetInvalidEventsResponse.md)
 - [GetPaymentTransactionDetailsRequest](docs/GetPaymentTransactionDetailsRequest.md)
 - [GetPaymentTransactionDetailsResponse](docs/GetPaymentTransactionDetailsResponse.md)
 - [GetPaymentTransactionsRequest](docs/GetPaymentTransactionsRequest.md)
 - [GetPaymentTransactionsResponse](docs/GetPaymentTransactionsResponse.md)
 - [InvestigationExecutionConfirmation5Code](docs/InvestigationExecutionConfirmation5Code.md)
 - [InvestigationExecutionStatusReason1](docs/InvestigationExecutionStatusReason1.md)
 - [Location1Code](docs/Location1Code.md)
 - [PaymentCancellationRejection3Code](docs/PaymentCancellationRejection3Code.md)
 - [PaymentCancellationStatusReason2Code](docs/PaymentCancellationStatusReason2Code.md)
 - [PaymentCancellationStatusReason3Code](docs/PaymentCancellationStatusReason3Code.md)
 - [PaymentEvent2](docs/PaymentEvent2.md)
 - [PaymentEvent3](docs/PaymentEvent3.md)
 - [PaymentEvent7](docs/PaymentEvent7.md)
 - [PaymentReason1Code](docs/PaymentReason1Code.md)
 - [PaymentScenario1Code](docs/PaymentScenario1Code.md)
 - [PaymentScenario2Code](docs/PaymentScenario2Code.md)
 - [PaymentScenario3Code](docs/PaymentScenario3Code.md)
 - [PaymentStatus3](docs/PaymentStatus3.md)
 - [PaymentStatusType2Choice](docs/PaymentStatusType2Choice.md)
 - [PaymentTransaction72](docs/PaymentTransaction72.md)
 - [PaymentTransaction76](docs/PaymentTransaction76.md)
 - [PaymentTransactionCancellationStatus1](docs/PaymentTransactionCancellationStatus1.md)
 - [PaymentTransactionCancellationStatus3](docs/PaymentTransactionCancellationStatus3.md)
 - [PaymentTransactionState1Code](docs/PaymentTransactionState1Code.md)
 - [PaymentsPartyType1Code](docs/PaymentsPartyType1Code.md)
 - [PaymentsPartyType2Code](docs/PaymentsPartyType2Code.md)
 - [PendingPaymentCancellationReason1Code](docs/PendingPaymentCancellationReason1Code.md)
 - [PendingPaymentCancellationReason2Code](docs/PendingPaymentCancellationReason2Code.md)
 - [StatusDetails2](docs/StatusDetails2.md)
 - [TrackerEventType1Code](docs/TrackerEventType1Code.md)
 - [TransactionCancellationStatusRequest](docs/TransactionCancellationStatusRequest.md)
 - [TransactionCancellationStatusResponse](docs/TransactionCancellationStatusResponse.md)
 - [TransactionIndividualStatus4Code](docs/TransactionIndividualStatus4Code.md)
 - [TypeOfAmount8Code](docs/TypeOfAmount8Code.md)
 - [UnderlyingCancellationDetails2](docs/UnderlyingCancellationDetails2.md)
 - [UpdatePaymentStatusRequest](docs/UpdatePaymentStatusRequest.md)
 - [UpdatePaymentStatusResponse](docs/UpdatePaymentStatusResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Hassan.Mollah@swift.com
