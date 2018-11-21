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
 * This API is a payment events query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.  The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.
 */
@ApiModel(description = "This API is a payment events query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.  The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class GetInvalidEventsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("from_date_time")
  private String fromDateTime = null;

  @SerializedName("to_date_time")
  private String toDateTime = null;

  @SerializedName("maximum_number")
  private String maximumNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetInvalidEventsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetInvalidEventsRequest addMyInstitutionItem(String myInstitutionItem) {
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

  public GetInvalidEventsRequest fromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }

   /**
   * Date and time at which the range starts.
   * @return fromDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the range starts.")
  public String getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public GetInvalidEventsRequest toDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }

   /**
   * Date and time at which the range ends.
   * @return toDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the range ends.")
  public String getToDateTime() {
    return toDateTime;
  }

  public void setToDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
  }

  public GetInvalidEventsRequest maximumNumber(String maximumNumber) {
    this.maximumNumber = maximumNumber;
    return this;
  }

   /**
   * Indicates the maximum number of entries returned.
   * @return maximumNumber
  **/
  @ApiModelProperty(required = true, value = "Indicates the maximum number of entries returned.")
  public String getMaximumNumber() {
    return maximumNumber;
  }

  public void setMaximumNumber(String maximumNumber) {
    this.maximumNumber = maximumNumber;
  }

  public GetInvalidEventsRequest more(String more) {
    this.more = more;
    return this;
  }

   /**
   * Contains the token to get the next set of responses.
   * @return more
  **/
  @ApiModelProperty(value = "Contains the token to get the next set of responses.")
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
    GetInvalidEventsRequest getInvalidEventsRequest = (GetInvalidEventsRequest) o;
    return Objects.equals(this.myInstitution, getInvalidEventsRequest.myInstitution) &&
        Objects.equals(this.fromDateTime, getInvalidEventsRequest.fromDateTime) &&
        Objects.equals(this.toDateTime, getInvalidEventsRequest.toDateTime) &&
        Objects.equals(this.maximumNumber, getInvalidEventsRequest.maximumNumber) &&
        Objects.equals(this.more, getInvalidEventsRequest.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, fromDateTime, toDateTime, maximumNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvalidEventsRequest {\n");

    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
    sb.append("    maximumNumber: ").append(toIndentedString(maximumNumber)).append("\n");
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
