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
import io.swagger.client.model.GetPaymentTransactionsRequest;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema GetPaymentTransactionsRequest (camt.a03.001.03) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema GetPaymentTransactionsRequest (camt.a03.001.03) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T16:12:10.361-04:00")
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

