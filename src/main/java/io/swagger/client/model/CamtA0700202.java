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
import io.swagger.client.model.TransactionCancellationStatusResponse;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema TransactionCancellationStatusResponse (camt.a07.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema TransactionCancellationStatusResponse (camt.a07.002.02) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T16:12:10.361-04:00")
public class CamtA0700202 {
  @SerializedName("transaction_cancellation_status_response")
  private TransactionCancellationStatusResponse transactionCancellationStatusResponse = null;

  public CamtA0700202 transactionCancellationStatusResponse(TransactionCancellationStatusResponse transactionCancellationStatusResponse) {
    this.transactionCancellationStatusResponse = transactionCancellationStatusResponse;
    return this;
  }

   /**
   * Get transactionCancellationStatusResponse
   * @return transactionCancellationStatusResponse
  **/
  @ApiModelProperty(value = "")
  public TransactionCancellationStatusResponse getTransactionCancellationStatusResponse() {
    return transactionCancellationStatusResponse;
  }

  public void setTransactionCancellationStatusResponse(TransactionCancellationStatusResponse transactionCancellationStatusResponse) {
    this.transactionCancellationStatusResponse = transactionCancellationStatusResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0700202 camtA0700202 = (CamtA0700202) o;
    return Objects.equals(this.transactionCancellationStatusResponse, camtA0700202.transactionCancellationStatusResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCancellationStatusResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0700202 {\n");
    
    sb.append("    transactionCancellationStatusResponse: ").append(toIndentedString(transactionCancellationStatusResponse)).append("\n");
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

