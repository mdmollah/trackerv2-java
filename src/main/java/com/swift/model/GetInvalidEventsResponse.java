/*
 * Tracker API v2
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This API is a payment events response to a query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.  The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.
 */
@ApiModel(description = "This API is a payment events response to a query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.  The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.  ")
public class GetInvalidEventsResponse {
  @SerializedName("event")
  private List<PaymentEvent3> event = new ArrayList<PaymentEvent3>();

  @SerializedName("total_number")
  private String totalNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetInvalidEventsResponse event(List<PaymentEvent3> event) {
    this.event = event;
    return this;
  }

  public GetInvalidEventsResponse addEventItem(PaymentEvent3 eventItem) {
    this.event.add(eventItem);
    return this;
  }

   /**
   * Each instance contains one payment event that matches the search criteria.
   * @return event
  **/
  @ApiModelProperty(required = true, value = "Each instance contains one payment event that matches the search criteria.")
  public List<PaymentEvent3> getEvent() {
    return event;
  }

  public void setEvent(List<PaymentEvent3> event) {
    this.event = event;
  }

  public GetInvalidEventsResponse totalNumber(String totalNumber) {
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

  public GetInvalidEventsResponse more(String more) {
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
    GetInvalidEventsResponse getInvalidEventsResponse = (GetInvalidEventsResponse) o;
    return Objects.equals(this.event, getInvalidEventsResponse.event) &&
        Objects.equals(this.totalNumber, getInvalidEventsResponse.totalNumber) &&
        Objects.equals(this.more, getInvalidEventsResponse.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, totalNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvalidEventsResponse {\n");

    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
