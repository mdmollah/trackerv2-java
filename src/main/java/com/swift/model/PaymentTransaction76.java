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
import com.swift.model.PaymentEvent7;
import com.swift.model.PaymentStatus3;
import com.swift.model.PaymentTransactionCancellationStatus1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains details on the payment transaction.
 */
@ApiModel(description = "Contains details on the payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentTransaction76 {
  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("cancellation_status")
  private PaymentTransactionCancellationStatus1 cancellationStatus = null;

  @SerializedName("initiation_time")
  private String initiationTime = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  @SerializedName("payment_event")
  private List<PaymentEvent7> paymentEvent = null;

  public PaymentTransaction76 uetr(String uetr) {
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

  public PaymentTransaction76 transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Specifies the status of a transaction, in a coded form.
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of a transaction, in a coded form.")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentTransaction76 cancellationStatus(PaymentTransactionCancellationStatus1 cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
    return this;
  }

   /**
   * Get cancellationStatus
   * @return cancellationStatus
  **/
  @ApiModelProperty(value = "")
  public PaymentTransactionCancellationStatus1 getCancellationStatus() {
    return cancellationStatus;
  }

  public void setCancellationStatus(PaymentTransactionCancellationStatus1 cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
  }

  public PaymentTransaction76 initiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
    return this;
  }

   /**
   * Date and Time at which the message enters the tracking system (e.g. gpi).
   * @return initiationTime
  **/
  @ApiModelProperty(required = true, value = "Date and Time at which the message enters the tracking system (e.g. gpi).")
  public String getInitiationTime() {
    return initiationTime;
  }

  public void setInitiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
  }

  public PaymentTransaction76 completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC
   * @return completionTime
  **/
  @ApiModelProperty(value = "Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }

  public PaymentTransaction76 lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Last date and time at which the status of this transaction was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "Last date and time at which the status of this transaction was updated.")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public PaymentTransaction76 paymentEvent(List<PaymentEvent7> paymentEvent) {
    this.paymentEvent = paymentEvent;
    return this;
  }

  public PaymentTransaction76 addPaymentEventItem(PaymentEvent7 paymentEventItem) {
    if (this.paymentEvent == null) {
      this.paymentEvent = new ArrayList<PaymentEvent7>();
    }
    this.paymentEvent.add(paymentEventItem);
    return this;
  }

   /**
   * This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned.
   * @return paymentEvent
  **/
  @ApiModelProperty(value = "This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned.")
  public List<PaymentEvent7> getPaymentEvent() {
    return paymentEvent;
  }

  public void setPaymentEvent(List<PaymentEvent7> paymentEvent) {
    this.paymentEvent = paymentEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransaction76 paymentTransaction76 = (PaymentTransaction76) o;
    return Objects.equals(this.uetr, paymentTransaction76.uetr) &&
        Objects.equals(this.transactionStatus, paymentTransaction76.transactionStatus) &&
        Objects.equals(this.cancellationStatus, paymentTransaction76.cancellationStatus) &&
        Objects.equals(this.initiationTime, paymentTransaction76.initiationTime) &&
        Objects.equals(this.completionTime, paymentTransaction76.completionTime) &&
        Objects.equals(this.lastUpdateTime, paymentTransaction76.lastUpdateTime) &&
        Objects.equals(this.paymentEvent, paymentTransaction76.paymentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uetr, transactionStatus, cancellationStatus, initiationTime, completionTime, lastUpdateTime, paymentEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction76 {\n");

    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    cancellationStatus: ").append(toIndentedString(cancellationStatus)).append("\n");
    sb.append("    initiationTime: ").append(toIndentedString(initiationTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    paymentEvent: ").append(toIndentedString(paymentEvent)).append("\n");
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
