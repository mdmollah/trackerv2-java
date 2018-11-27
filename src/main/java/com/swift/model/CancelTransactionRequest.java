/*
 * Tracker API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This API informs the tracker about the cancellation of a given transaction
 */
@ApiModel(description = "This API informs the tracker about the cancellation of a given transaction")
public class CancelTransactionRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("case_identification")
  private String caseIdentification = null;

  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("original_instruction_identification")
  private String originalInstructionIdentification = null;

  @SerializedName("underlying_cancellation_details")
  private CancellationRequestDetails1 underlyingCancellationDetails = null;

  public CancelTransactionRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public CancelTransactionRequest businessService(String businessService) {
    this.businessService = businessService;
    return this;
  }

   /**
   * Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.
   * @return businessService
  **/
  @ApiModelProperty(required = true, value = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.")
  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }

  public CancelTransactionRequest caseIdentification(String caseIdentification) {
    this.caseIdentification = caseIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case.
   * @return caseIdentification
  **/
  @ApiModelProperty(required = true, value = "Uniquely identifies the case.")
  public String getCaseIdentification() {
    return caseIdentification;
  }

  public void setCaseIdentification(String caseIdentification) {
    this.caseIdentification = caseIdentification;
  }

  public CancelTransactionRequest uetr(String uetr) {
    this.uetr = uetr;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference of a payment.
   * @return uetr
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference of a payment.")
  public String getUetr() {
    return uetr;
  }

  public void setUetr(String uetr) {
    this.uetr = uetr;
  }

  public CancelTransactionRequest originalInstructionIdentification(String originalInstructionIdentification) {
    this.originalInstructionIdentification = originalInstructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.
   * @return originalInstructionIdentification
  **/
  @ApiModelProperty(value = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.")
  public String getOriginalInstructionIdentification() {
    return originalInstructionIdentification;
  }

  public void setOriginalInstructionIdentification(String originalInstructionIdentification) {
    this.originalInstructionIdentification = originalInstructionIdentification;
  }

  public CancelTransactionRequest underlyingCancellationDetails(CancellationRequestDetails1 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
    return this;
  }

   /**
   * Provides further information with regards to the cancellation of the payments event.
   * @return underlyingCancellationDetails
  **/
  @ApiModelProperty(required = true, value = "Provides further information with regards to the cancellation of the payments event.")
  public CancellationRequestDetails1 getUnderlyingCancellationDetails() {
    return underlyingCancellationDetails;
  }

  public void setUnderlyingCancellationDetails(CancellationRequestDetails1 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelTransactionRequest cancelTransactionRequest = (CancelTransactionRequest) o;
    return Objects.equals(this.from, cancelTransactionRequest.from) &&
        Objects.equals(this.businessService, cancelTransactionRequest.businessService) &&
        Objects.equals(this.caseIdentification, cancelTransactionRequest.caseIdentification) &&
        Objects.equals(this.uetr, cancelTransactionRequest.uetr) &&
        Objects.equals(this.originalInstructionIdentification, cancelTransactionRequest.originalInstructionIdentification) &&
        Objects.equals(this.underlyingCancellationDetails, cancelTransactionRequest.underlyingCancellationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, businessService, caseIdentification, uetr, originalInstructionIdentification, underlyingCancellationDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelTransactionRequest {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    caseIdentification: ").append(toIndentedString(caseIdentification)).append("\n");
    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    originalInstructionIdentification: ").append(toIndentedString(originalInstructionIdentification)).append("\n");
    sb.append("    underlyingCancellationDetails: ").append(toIndentedString(underlyingCancellationDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
