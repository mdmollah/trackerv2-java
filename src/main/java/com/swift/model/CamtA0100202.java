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
 * ISO 20022 JSON Schema UpdatePaymentStatusResponse (camt.a01.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema UpdatePaymentStatusResponse (camt.a01.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02")
public class CamtA0100202 {
  @SerializedName("update_payment_status_response")
  private UpdatePaymentStatusResponse updatePaymentStatusResponse = null;

  public CamtA0100202 updatePaymentStatusResponse(UpdatePaymentStatusResponse updatePaymentStatusResponse) {
    this.updatePaymentStatusResponse = updatePaymentStatusResponse;
    return this;
  }

   /**
   * Get updatePaymentStatusResponse
   * @return updatePaymentStatusResponse
  **/
  @ApiModelProperty(value = "")
  public UpdatePaymentStatusResponse getUpdatePaymentStatusResponse() {
    return updatePaymentStatusResponse;
  }

  public void setUpdatePaymentStatusResponse(UpdatePaymentStatusResponse updatePaymentStatusResponse) {
    this.updatePaymentStatusResponse = updatePaymentStatusResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0100202 camtA0100202 = (CamtA0100202) o;
    return Objects.equals(this.updatePaymentStatusResponse, camtA0100202.updatePaymentStatusResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatePaymentStatusResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0100202 {\n");

    sb.append("    updatePaymentStatusResponse: ").append(toIndentedString(updatePaymentStatusResponse)).append("\n");
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
