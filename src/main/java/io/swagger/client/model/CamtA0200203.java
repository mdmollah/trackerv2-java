/*
 * gpi API
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 2.0.2
 * Contact: Li.JIE@swift.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetPaymentTransactionDetailsResponse;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema GetPaymentTransactionDetailsResponse (camt.a02.002.03) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema GetPaymentTransactionDetailsResponse (camt.a02.002.03) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T16:12:10.361-04:00")
public class CamtA0200203 {
  @SerializedName("get_payment_transaction_details_response")
  private GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse = null;

  public CamtA0200203 getPaymentTransactionDetailsResponse(GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse) {
    this.getPaymentTransactionDetailsResponse = getPaymentTransactionDetailsResponse;
    return this;
  }

   /**
   * Get getPaymentTransactionDetailsResponse
   * @return getPaymentTransactionDetailsResponse
  **/
  @ApiModelProperty(value = "")
  public GetPaymentTransactionDetailsResponse getGetPaymentTransactionDetailsResponse() {
    return getPaymentTransactionDetailsResponse;
  }

  public void setGetPaymentTransactionDetailsResponse(GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse) {
    this.getPaymentTransactionDetailsResponse = getPaymentTransactionDetailsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0200203 camtA0200203 = (CamtA0200203) o;
    return Objects.equals(this.getPaymentTransactionDetailsResponse, camtA0200203.getPaymentTransactionDetailsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPaymentTransactionDetailsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0200203 {\n");
    
    sb.append("    getPaymentTransactionDetailsResponse: ").append(toIndentedString(getPaymentTransactionDetailsResponse)).append("\n");
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

