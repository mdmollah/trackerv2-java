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
 * This API is the response to the CancelTransactionRequest.
 */
@ApiModel(description = "This API is the response to the CancelTransactionRequest.")
public class CancelTransactionResponse {
  @SerializedName("network_reference")
  private String networkReference = null;

  public CancelTransactionResponse networkReference(String networkReference) {
    this.networkReference = networkReference;
    return this;
  }

   /**
   * Reference assigned by the network.
   * @return networkReference
  **/
  @ApiModelProperty(required = true, value = "Reference assigned by the network.")
  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelTransactionResponse cancelTransactionResponse = (CancelTransactionResponse) o;
    return Objects.equals(this.networkReference, cancelTransactionResponse.networkReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelTransactionResponse {\n");

    sb.append("    networkReference: ").append(toIndentedString(networkReference)).append("\n");
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
