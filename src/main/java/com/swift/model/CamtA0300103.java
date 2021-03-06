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
 * ISO 20022 JSON Schema GetPaymentTransactionsRequest (camt.a03.001.03) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema GetPaymentTransactionsRequest (camt.a03.001.03) Generated by SWIFT Standards 2018-07-16 09:05:02")
public class CamtA0300103 {
  @SerializedName("get_payment_transactions_request")
  private GetPaymentTransactionsRequest getPaymentTransactionsRequest = null;

  public CamtA0300103 getPaymentTransactionsRequest(GetPaymentTransactionsRequest getPaymentTransactionsRequest) {
    this.getPaymentTransactionsRequest = getPaymentTransactionsRequest;
    return this;
  }

   /**
   * Get getPaymentTransactionsRequest
   * @return getPaymentTransactionsRequest
  **/
  @ApiModelProperty(value = "")
  public GetPaymentTransactionsRequest getGetPaymentTransactionsRequest() {
    return getPaymentTransactionsRequest;
  }

  public void setGetPaymentTransactionsRequest(GetPaymentTransactionsRequest getPaymentTransactionsRequest) {
    this.getPaymentTransactionsRequest = getPaymentTransactionsRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0300103 camtA0300103 = (CamtA0300103) o;
    return Objects.equals(this.getPaymentTransactionsRequest, camtA0300103.getPaymentTransactionsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPaymentTransactionsRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0300103 {\n");

    sb.append("    getPaymentTransactionsRequest: ").append(toIndentedString(getPaymentTransactionsRequest)).append("\n");
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
