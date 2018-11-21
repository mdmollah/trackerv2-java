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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This API is a payment query to get detailed information regarding a given payment transaction. It requires the UETR to be known.  Examples of use cases are:  • Debtor status check - debtor&#39;s agent or debtor wants to see the status  • Creditor status check - creditor&#39;s agent or creditor wants to see the status
 */
@ApiModel(description = "This API is a payment query to get detailed information regarding a given payment transaction. It requires the UETR to be known.  Examples of use cases are:  • Debtor status check - debtor's agent or debtor wants to see the status  • Creditor status check - creditor's agent or creditor wants to see the status  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class GetPaymentTransactionDetailsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("uetr")
  private String uetr = null;

  public GetPaymentTransactionDetailsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetPaymentTransactionDetailsRequest addMyInstitutionItem(String myInstitutionItem) {
    this.myInstitution.add(myInstitutionItem);
    return this;
  }

   /**
   * Specifies the institution which payments are requested.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies the institution which payments are requested.")
  public List<String> getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
  }

  public GetPaymentTransactionDetailsRequest uetr(String uetr) {
    this.uetr = uetr;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference (UETR) of a payment.
   * @return uetr
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference (UETR) of a payment.")
  public String getUetr() {
    return uetr;
  }

  public void setUetr(String uetr) {
    this.uetr = uetr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentTransactionDetailsRequest getPaymentTransactionDetailsRequest = (GetPaymentTransactionDetailsRequest) o;
    return Objects.equals(this.myInstitution, getPaymentTransactionDetailsRequest.myInstitution) &&
        Objects.equals(this.uetr, getPaymentTransactionDetailsRequest.uetr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, uetr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionDetailsRequest {\n");

    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
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
