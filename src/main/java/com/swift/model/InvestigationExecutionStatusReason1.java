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
import com.swift.model.PaymentCancellationRejection3Code;
import com.swift.model.PendingPaymentCancellationReason1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvestigationExecutionStatusReason1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class InvestigationExecutionStatusReason1 {
  @SerializedName("rejected")
  private PaymentCancellationRejection3Code rejected = null;

  @SerializedName("pending")
  private PendingPaymentCancellationReason1Code pending = null;

  public InvestigationExecutionStatusReason1 rejected(PaymentCancellationRejection3Code rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @ApiModelProperty(value = "")
  public PaymentCancellationRejection3Code getRejected() {
    return rejected;
  }

  public void setRejected(PaymentCancellationRejection3Code rejected) {
    this.rejected = rejected;
  }

  public InvestigationExecutionStatusReason1 pending(PendingPaymentCancellationReason1Code pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @ApiModelProperty(value = "")
  public PendingPaymentCancellationReason1Code getPending() {
    return pending;
  }

  public void setPending(PendingPaymentCancellationReason1Code pending) {
    this.pending = pending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestigationExecutionStatusReason1 investigationExecutionStatusReason1 = (InvestigationExecutionStatusReason1) o;
    return Objects.equals(this.rejected, investigationExecutionStatusReason1.rejected) &&
        Objects.equals(this.pending, investigationExecutionStatusReason1.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejected, pending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestigationExecutionStatusReason1 {\n");

    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
