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
 * Contains the status of the payment, either as a raw status, or as a detailed status.
 */
@ApiModel(description = "Contains the status of the payment, either as a raw status, or as a detailed status.")
public class PaymentStatusType2Choice {
  @SerializedName("raw_status")
  private String rawStatus = null;

  @SerializedName("detailed_status")
  private StatusDetails2 detailedStatus = null;

  public PaymentStatusType2Choice rawStatus(String rawStatus) {
    this.rawStatus = rawStatus;
    return this;
  }

   /**
   * Contains the status of the payment taken from field 79 of the MT 199.
   * @return rawStatus
  **/
  @ApiModelProperty(value = "Contains the status of the payment taken from field 79 of the MT 199.")
  public String getRawStatus() {
    return rawStatus;
  }

  public void setRawStatus(String rawStatus) {
    this.rawStatus = rawStatus;
  }

  public PaymentStatusType2Choice detailedStatus(StatusDetails2 detailedStatus) {
    this.detailedStatus = detailedStatus;
    return this;
  }

   /**
   * Contains the detailed status of the payment.
   * @return detailedStatus
  **/
  @ApiModelProperty(value = "Contains the detailed status of the payment.")
  public StatusDetails2 getDetailedStatus() {
    return detailedStatus;
  }

  public void setDetailedStatus(StatusDetails2 detailedStatus) {
    this.detailedStatus = detailedStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatusType2Choice paymentStatusType2Choice = (PaymentStatusType2Choice) o;
    return Objects.equals(this.rawStatus, paymentStatusType2Choice.rawStatus) &&
        Objects.equals(this.detailedStatus, paymentStatusType2Choice.detailedStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawStatus, detailedStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatusType2Choice {\n");

    sb.append("    rawStatus: ").append(toIndentedString(rawStatus)).append("\n");
    sb.append("    detailedStatus: ").append(toIndentedString(detailedStatus)).append("\n");
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
