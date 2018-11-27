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
 * Provides details on the status of the cancellation of a payment transaction.
 */
@ApiModel(description = "Provides details on the status of the cancellation of a payment transaction.")
public class PaymentTransactionCancellationStatus1 {
  @SerializedName("transaction_cancellation_status")
  private CancellationIndividualStatus2Code transactionCancellationStatus = null;

  public PaymentTransactionCancellationStatus1 transactionCancellationStatus(CancellationIndividualStatus2Code transactionCancellationStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionCancellationStatus1 paymentTransactionCancellationStatus1 = (PaymentTransactionCancellationStatus1) o;
    return Objects.equals(this.transactionCancellationStatus, paymentTransactionCancellationStatus1.transactionCancellationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCancellationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionCancellationStatus1 {\n");

    sb.append("    transactionCancellationStatus: ").append(toIndentedString(transactionCancellationStatus)).append("\n");
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
