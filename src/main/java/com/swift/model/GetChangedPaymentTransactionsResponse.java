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
import com.swift.model.PaymentTransaction76;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This API is the response to a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database.   All use cases applicable for the get and search of payment transactions apply also for this API.   The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.
 */
@ApiModel(description = "This API is the response to a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database.   All use cases applicable for the get and search of payment transactions apply also for this API.   The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class GetChangedPaymentTransactionsResponse {
  @SerializedName("payment_transaction")
  private List<PaymentTransaction76> paymentTransaction = null;

  @SerializedName("total_number")
  private String totalNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetChangedPaymentTransactionsResponse paymentTransaction(List<PaymentTransaction76> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  public GetChangedPaymentTransactionsResponse addPaymentTransactionItem(PaymentTransaction76 paymentTransactionItem) {
    if (this.paymentTransaction == null) {
      this.paymentTransaction = new ArrayList<PaymentTransaction76>();
    }
    this.paymentTransaction.add(paymentTransactionItem);
    return this;
  }

   /**
   * contains the payment transactions that meet the search criteria.
   * @return paymentTransaction
  **/
  @ApiModelProperty(value = "contains the payment transactions that meet the search criteria.")
  public List<PaymentTransaction76> getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(List<PaymentTransaction76> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public GetChangedPaymentTransactionsResponse totalNumber(String totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * Contains the total number of returned result entries.
   * @return totalNumber
  **/
  @ApiModelProperty(required = true, value = "Contains the total number of returned result entries.")
  public String getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(String totalNumber) {
    this.totalNumber = totalNumber;
  }

  public GetChangedPaymentTransactionsResponse more(String more) {
    this.more = more;
    return this;
  }

   /**
   * Contains a token to obtain the next set of responses. It indicates whether there are more results to retrieve, what timestamp to start from and how many more result entries are to be retrieved.
   * @return more
  **/
  @ApiModelProperty(value = "Contains a token to obtain the next set of responses. It indicates whether there are more results to retrieve, what timestamp to start from and how many more result entries are to be retrieved.")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChangedPaymentTransactionsResponse getChangedPaymentTransactionsResponse = (GetChangedPaymentTransactionsResponse) o;
    return Objects.equals(this.paymentTransaction, getChangedPaymentTransactionsResponse.paymentTransaction) &&
        Objects.equals(this.totalNumber, getChangedPaymentTransactionsResponse.totalNumber) &&
        Objects.equals(this.more, getChangedPaymentTransactionsResponse.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransaction, totalNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChangedPaymentTransactionsResponse {\n");

    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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
