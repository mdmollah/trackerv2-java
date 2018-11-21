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
import com.swift.model.PaymentReason1Code;
import com.swift.model.TransactionIndividualStatus4Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Indicates the payment transaction status and optionally the reason for that status.
 */
@ApiModel(description = "Indicates the payment transaction status and optionally the reason for that status. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentStatus3 {
  @SerializedName("status")
  private TransactionIndividualStatus4Code status = null;

  @SerializedName("reason")
  private PaymentReason1Code reason = null;

  public PaymentStatus3 status(TransactionIndividualStatus4Code status) {
    this.status = status;
    return this;
  }

   /**
   * Reason for the status, as published in an external reason code list.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Reason for the status, as published in an external reason code list.")
  public TransactionIndividualStatus4Code getStatus() {
    return status;
  }

  public void setStatus(TransactionIndividualStatus4Code status) {
    this.status = status;
  }

  public PaymentStatus3 reason(PaymentReason1Code reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Provides more details on the status in process.
   * @return reason
  **/
  @ApiModelProperty(value = "Provides more details on the status in process.")
  public PaymentReason1Code getReason() {
    return reason;
  }

  public void setReason(PaymentReason1Code reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatus3 paymentStatus3 = (PaymentStatus3) o;
    return Objects.equals(this.status, paymentStatus3.status) &&
        Objects.equals(this.reason, paymentStatus3.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatus3 {\n");

    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
