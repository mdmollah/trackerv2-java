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
 * Contains detailed information from the cancellation request (e.g. an MT 192 or an MT 199).
 */
@ApiModel(description = "Contains detailed information from the cancellation request (e.g. an MT 192 or an MT 199).")
public class CancellationRequestDetails1 {
  @SerializedName("cancellation_reason_information")
  private CancellationReason6Code cancellationReasonInformation = null;

  @SerializedName("indemnity_agreement")
  private PendingPaymentCancellationReason2Code indemnityAgreement = null;

  public CancellationRequestDetails1 cancellationReasonInformation(CancellationReason6Code cancellationReasonInformation) {
    this.cancellationReasonInformation = cancellationReasonInformation;
    return this;
  }

   /**
   * Contains information on the reason for the cancellation.
   * @return cancellationReasonInformation
  **/
  @ApiModelProperty(required = true, value = "Contains information on the reason for the cancellation.")
  public CancellationReason6Code getCancellationReasonInformation() {
    return cancellationReasonInformation;
  }

  public void setCancellationReasonInformation(CancellationReason6Code cancellationReasonInformation) {
    this.cancellationReasonInformation = cancellationReasonInformation;
  }

  public CancellationRequestDetails1 indemnityAgreement(PendingPaymentCancellationReason2Code indemnityAgreement) {
    this.indemnityAgreement = indemnityAgreement;
    return this;
  }

   /**
   * Get indemnityAgreement
   * @return indemnityAgreement
  **/
  @ApiModelProperty(value = "")
  public PendingPaymentCancellationReason2Code getIndemnityAgreement() {
    return indemnityAgreement;
  }

  public void setIndemnityAgreement(PendingPaymentCancellationReason2Code indemnityAgreement) {
    this.indemnityAgreement = indemnityAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationRequestDetails1 cancellationRequestDetails1 = (CancellationRequestDetails1) o;
    return Objects.equals(this.cancellationReasonInformation, cancellationRequestDetails1.cancellationReasonInformation) &&
        Objects.equals(this.indemnityAgreement, cancellationRequestDetails1.indemnityAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReasonInformation, indemnityAgreement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationRequestDetails1 {\n");

    sb.append("    cancellationReasonInformation: ").append(toIndentedString(cancellationReasonInformation)).append("\n");
    sb.append("    indemnityAgreement: ").append(toIndentedString(indemnityAgreement)).append("\n");
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
