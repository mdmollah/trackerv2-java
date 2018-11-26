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
import com.swift.model.CancellationRequestDetails1;
import com.swift.model.CancellationResponseDetails1;
import com.swift.model.PaymentCancellationStatusReason2Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides details on the status of the cancellation of the underlying payments event.
 */
@ApiModel(description = "Provides details on the status of the cancellation of the underlying payments event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class UnderlyingCancellationDetails2 {
  @SerializedName("cancellation_request_details")
  private CancellationRequestDetails1 cancellationRequestDetails = null;

  @SerializedName("cancellation_response_details")
  private CancellationResponseDetails1 cancellationResponseDetails = null;

  @SerializedName("cancellation_request_tracking_status")
  private PaymentCancellationStatusReason2Code cancellationRequestTrackingStatus = null;

  public UnderlyingCancellationDetails2 cancellationRequestDetails(CancellationRequestDetails1 cancellationRequestDetails) {
    this.cancellationRequestDetails = cancellationRequestDetails;
    return this;
  }

   /**
   * Provides information from the cancellation request.
   * @return cancellationRequestDetails
  **/
  @ApiModelProperty(value = "Provides information from the cancellation request.")
  public CancellationRequestDetails1 getCancellationRequestDetails() {
    return cancellationRequestDetails;
  }

  public void setCancellationRequestDetails(CancellationRequestDetails1 cancellationRequestDetails) {
    this.cancellationRequestDetails = cancellationRequestDetails;
  }

  public UnderlyingCancellationDetails2 cancellationResponseDetails(CancellationResponseDetails1 cancellationResponseDetails) {
    this.cancellationResponseDetails = cancellationResponseDetails;
    return this;
  }

   /**
   * Provides information from the cancellation response.
   * @return cancellationResponseDetails
  **/
  @ApiModelProperty(value = "Provides information from the cancellation response.")
  public CancellationResponseDetails1 getCancellationResponseDetails() {
    return cancellationResponseDetails;
  }

  public void setCancellationResponseDetails(CancellationResponseDetails1 cancellationResponseDetails) {
    this.cancellationResponseDetails = cancellationResponseDetails;
  }

  public UnderlyingCancellationDetails2 cancellationRequestTrackingStatus(PaymentCancellationStatusReason2Code cancellationRequestTrackingStatus) {
    this.cancellationRequestTrackingStatus = cancellationRequestTrackingStatus;
    return this;
  }

   /**
   * Specifies the status of the cancellation request.
   * @return cancellationRequestTrackingStatus
  **/
  @ApiModelProperty(value = "Specifies the status of the cancellation request.")
  public PaymentCancellationStatusReason2Code getCancellationRequestTrackingStatus() {
    return cancellationRequestTrackingStatus;
  }

  public void setCancellationRequestTrackingStatus(PaymentCancellationStatusReason2Code cancellationRequestTrackingStatus) {
    this.cancellationRequestTrackingStatus = cancellationRequestTrackingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnderlyingCancellationDetails2 underlyingCancellationDetails2 = (UnderlyingCancellationDetails2) o;
    return Objects.equals(this.cancellationRequestDetails, underlyingCancellationDetails2.cancellationRequestDetails) &&
        Objects.equals(this.cancellationResponseDetails, underlyingCancellationDetails2.cancellationResponseDetails) &&
        Objects.equals(this.cancellationRequestTrackingStatus, underlyingCancellationDetails2.cancellationRequestTrackingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationRequestDetails, cancellationResponseDetails, cancellationRequestTrackingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnderlyingCancellationDetails2 {\n");

    sb.append("    cancellationRequestDetails: ").append(toIndentedString(cancellationRequestDetails)).append("\n");
    sb.append("    cancellationResponseDetails: ").append(toIndentedString(cancellationResponseDetails)).append("\n");
    sb.append("    cancellationRequestTrackingStatus: ").append(toIndentedString(cancellationRequestTrackingStatus)).append("\n");
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
