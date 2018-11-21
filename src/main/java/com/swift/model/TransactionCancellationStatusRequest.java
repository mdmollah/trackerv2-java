/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.CancellationResponseDetails1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This call informs the tracker about the updated status of a given payment.
 */
@ApiModel(description = "This call informs the tracker about the updated status of a given payment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class TransactionCancellationStatusRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("assignment_identification")
  private String assignmentIdentification = null;

  @SerializedName("resolved_case_identification")
  private String resolvedCaseIdentification = null;

  @SerializedName("underlying_cancellation_details")
  private CancellationResponseDetails1 underlyingCancellationDetails = null;

  @SerializedName("originator")
  private String originator = null;

  @SerializedName("forwarded_to_agent")
  private String forwardedToAgent = null;

  public TransactionCancellationStatusRequest from(String from) {
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

  public TransactionCancellationStatusRequest businessService(String businessService) {
    this.businessService = businessService;
    return this;
  }

   /**
   * Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.   To be used when there is a choice of processing services or processing service levels.  Example: 001
   * @return businessService
  **/
  @ApiModelProperty(required = true, value = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.   To be used when there is a choice of processing services or processing service levels.  Example: 001")
  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }

  public TransactionCancellationStatusRequest uetr(String uetr) {
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

  public TransactionCancellationStatusRequest assignmentIdentification(String assignmentIdentification) {
    this.assignmentIdentification = assignmentIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case assignment.
   * @return assignmentIdentification
  **/
  @ApiModelProperty(required = true, value = "Uniquely identifies the case assignment.")
  public String getAssignmentIdentification() {
    return assignmentIdentification;
  }

  public void setAssignmentIdentification(String assignmentIdentification) {
    this.assignmentIdentification = assignmentIdentification;
  }

  public TransactionCancellationStatusRequest resolvedCaseIdentification(String resolvedCaseIdentification) {
    this.resolvedCaseIdentification = resolvedCaseIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case.
   * @return resolvedCaseIdentification
  **/
  @ApiModelProperty(required = true, value = "Uniquely identifies the case.")
  public String getResolvedCaseIdentification() {
    return resolvedCaseIdentification;
  }

  public void setResolvedCaseIdentification(String resolvedCaseIdentification) {
    this.resolvedCaseIdentification = resolvedCaseIdentification;
  }

  public TransactionCancellationStatusRequest underlyingCancellationDetails(CancellationResponseDetails1 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
    return this;
  }

   /**
   * Provides further information with regards to the cancellation of the payments event.
   * @return underlyingCancellationDetails
  **/
  @ApiModelProperty(required = true, value = "Provides further information with regards to the cancellation of the payments event.")
  public CancellationResponseDetails1 getUnderlyingCancellationDetails() {
    return underlyingCancellationDetails;
  }

  public void setUnderlyingCancellationDetails(CancellationResponseDetails1 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
  }

  public TransactionCancellationStatusRequest originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Party that issues the status.
   * @return originator
  **/
  @ApiModelProperty(required = true, value = "Party that issues the status.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public TransactionCancellationStatusRequest forwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
    return this;
  }

   /**
   * Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.
   * @return forwardedToAgent
  **/
  @ApiModelProperty(value = "Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.")
  public String getForwardedToAgent() {
    return forwardedToAgent;
  }

  public void setForwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCancellationStatusRequest transactionCancellationStatusRequest = (TransactionCancellationStatusRequest) o;
    return Objects.equals(this.from, transactionCancellationStatusRequest.from) &&
        Objects.equals(this.businessService, transactionCancellationStatusRequest.businessService) &&
        Objects.equals(this.uetr, transactionCancellationStatusRequest.uetr) &&
        Objects.equals(this.assignmentIdentification, transactionCancellationStatusRequest.assignmentIdentification) &&
        Objects.equals(this.resolvedCaseIdentification, transactionCancellationStatusRequest.resolvedCaseIdentification) &&
        Objects.equals(this.underlyingCancellationDetails, transactionCancellationStatusRequest.underlyingCancellationDetails) &&
        Objects.equals(this.originator, transactionCancellationStatusRequest.originator) &&
        Objects.equals(this.forwardedToAgent, transactionCancellationStatusRequest.forwardedToAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, businessService, uetr, assignmentIdentification, resolvedCaseIdentification, underlyingCancellationDetails, originator, forwardedToAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCancellationStatusRequest {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    assignmentIdentification: ").append(toIndentedString(assignmentIdentification)).append("\n");
    sb.append("    resolvedCaseIdentification: ").append(toIndentedString(resolvedCaseIdentification)).append("\n");
    sb.append("    underlyingCancellationDetails: ").append(toIndentedString(underlyingCancellationDetails)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    forwardedToAgent: ").append(toIndentedString(forwardedToAgent)).append("\n");
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
