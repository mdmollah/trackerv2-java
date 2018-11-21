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
import com.swift.model.CancellationIndividualStatus2Code;
import com.swift.model.PaymentCancellationStatusReason3Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides details on the status of the cancellation of a payment transaction.
 */
@ApiModel(description = "Provides details on the status of the cancellation of a payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentTransactionCancellationStatus3 {
  @SerializedName("transaction_cancellation_status")
  private CancellationIndividualStatus2Code transactionCancellationStatus = null;

  @SerializedName("cancellation_status_reason_information")
  private PaymentCancellationStatusReason3Code cancellationStatusReasonInformation = null;

  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("cancellation_event_date_time")
  private String cancellationEventDateTime = null;

  public PaymentTransactionCancellationStatus3 transactionCancellationStatus(CancellationIndividualStatus2Code transactionCancellationStatus) {
    this.transactionCancellationStatus = transactionCancellationStatus;
    return this;
  }

   /**
   * Specifies the status of a cancellation request.
   * @return transactionCancellationStatus
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of a cancellation request.")
  public CancellationIndividualStatus2Code getTransactionCancellationStatus() {
    return transactionCancellationStatus;
  }

  public void setTransactionCancellationStatus(CancellationIndividualStatus2Code transactionCancellationStatus) {
    this.transactionCancellationStatus = transactionCancellationStatus;
  }

  public PaymentTransactionCancellationStatus3 cancellationStatusReasonInformation(PaymentCancellationStatusReason3Code cancellationStatusReasonInformation) {
    this.cancellationStatusReasonInformation = cancellationStatusReasonInformation;
    return this;
  }

   /**
   * Provides status reason with regards to the cancellation of the payment.
   * @return cancellationStatusReasonInformation
  **/
  @ApiModelProperty(value = "Provides status reason with regards to the cancellation of the payment.")
  public PaymentCancellationStatusReason3Code getCancellationStatusReasonInformation() {
    return cancellationStatusReasonInformation;
  }

  public void setCancellationStatusReasonInformation(PaymentCancellationStatusReason3Code cancellationStatusReasonInformation) {
    this.cancellationStatusReasonInformation = cancellationStatusReasonInformation;
  }

  public PaymentTransactionCancellationStatus3 assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Party that the case is assigned to. This is also the receiver of the message.
   * @return assignee
  **/
  @ApiModelProperty(required = true, value = "Party that the case is assigned to. This is also the receiver of the message.")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public PaymentTransactionCancellationStatus3 cancellationEventDateTime(String cancellationEventDateTime) {
    this.cancellationEventDateTime = cancellationEventDateTime;
    return this;
  }

   /**
   * Date and Time at which the cancellation response message enters the tracking system and thus on which the status is provided.
   * @return cancellationEventDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and Time at which the cancellation response message enters the tracking system and thus on which the status is provided.")
  public String getCancellationEventDateTime() {
    return cancellationEventDateTime;
  }

  public void setCancellationEventDateTime(String cancellationEventDateTime) {
    this.cancellationEventDateTime = cancellationEventDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionCancellationStatus3 paymentTransactionCancellationStatus3 = (PaymentTransactionCancellationStatus3) o;
    return Objects.equals(this.transactionCancellationStatus, paymentTransactionCancellationStatus3.transactionCancellationStatus) &&
        Objects.equals(this.cancellationStatusReasonInformation, paymentTransactionCancellationStatus3.cancellationStatusReasonInformation) &&
        Objects.equals(this.assignee, paymentTransactionCancellationStatus3.assignee) &&
        Objects.equals(this.cancellationEventDateTime, paymentTransactionCancellationStatus3.cancellationEventDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCancellationStatus, cancellationStatusReasonInformation, assignee, cancellationEventDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionCancellationStatus3 {\n");

    sb.append("    transactionCancellationStatus: ").append(toIndentedString(transactionCancellationStatus)).append("\n");
    sb.append("    cancellationStatusReasonInformation: ").append(toIndentedString(cancellationStatusReasonInformation)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    cancellationEventDateTime: ").append(toIndentedString(cancellationEventDateTime)).append("\n");
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
