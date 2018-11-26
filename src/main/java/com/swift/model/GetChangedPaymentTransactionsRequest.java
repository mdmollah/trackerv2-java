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
 * This API is a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database.   All use cases applicable for the get and search of payment transactions apply also for this API.   The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.
 */
@ApiModel(description = "This API is a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database.   All use cases applicable for the get and search of payment transactions apply also for this API.   The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class GetChangedPaymentTransactionsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("more")
  private String more = null;

  public GetChangedPaymentTransactionsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetChangedPaymentTransactionsRequest addMyInstitutionItem(String myInstitutionItem) {
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

  public GetChangedPaymentTransactionsRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Contains the start date and time as from which the last changed payment transactions must be provided.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Contains the start date and time as from which the last changed payment transactions must be provided.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public GetChangedPaymentTransactionsRequest more(String more) {
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
    GetChangedPaymentTransactionsRequest getChangedPaymentTransactionsRequest = (GetChangedPaymentTransactionsRequest) o;
    return Objects.equals(this.myInstitution, getChangedPaymentTransactionsRequest.myInstitution) &&
        Objects.equals(this.startTime, getChangedPaymentTransactionsRequest.startTime) &&
        Objects.equals(this.more, getChangedPaymentTransactionsRequest.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, startTime, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChangedPaymentTransactionsRequest {\n");

    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
