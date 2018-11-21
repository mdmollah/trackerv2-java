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
import com.swift.model.AgentType1;
import com.swift.model.AmountType1;
import com.swift.model.DateTimePeriodDetails;
import com.swift.model.Location1Code;
import com.swift.model.PaymentScenario2Code;
import com.swift.model.PaymentStatus3;
import com.swift.model.PaymentTransactionState1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria. To have full information of a given payment transaction, the GetPaymentTransactionDetailsRequest can be used.  Examples of use cases are:  • Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation  • Flow monitoring, for instance to find payments that are \&quot;stuck\&quot; for which the institution is the beneficiary institution  • Feed a dashboard - give all payment transactions with their last status
 */
@ApiModel(description = "This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria. To have full information of a given payment transaction, the GetPaymentTransactionDetailsRequest can be used.  Examples of use cases are:  • Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation  • Flow monitoring, for instance to find payments that are \"stuck\" for which the institution is the beneficiary institution  • Feed a dashboard - give all payment transactions with their last status  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class GetPaymentTransactionsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("time_window")
  private DateTimePeriodDetails timeWindow = null;

  @SerializedName("payment_scenario_return_criteria")
  private PaymentScenario2Code paymentScenarioReturnCriteria = null;

  @SerializedName("agent")
  private List<AgentType1> agent = null;

  @SerializedName("location")
  private Location1Code location = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("transaction_status")
  private List<PaymentStatus3> transactionStatus = null;

  @SerializedName("amount")
  private AmountType1 amount = null;

  @SerializedName("event")
  private PaymentTransactionState1Code event = null;

  @SerializedName("subject_to_cancellation_process_indicator")
  private Boolean subjectToCancellationProcessIndicator = null;

  @SerializedName("maximum_number")
  private String maximumNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetPaymentTransactionsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetPaymentTransactionsRequest addMyInstitutionItem(String myInstitutionItem) {
    this.myInstitution.add(myInstitutionItem);
    return this;
  }

   /**
   * Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.")
  public List<String> getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
  }

  public GetPaymentTransactionsRequest timeWindow(DateTimePeriodDetails timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

   /**
   * Time window for this institution to which the search applies.
   * @return timeWindow
  **/
  @ApiModelProperty(required = true, value = "Time window for this institution to which the search applies.")
  public DateTimePeriodDetails getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(DateTimePeriodDetails timeWindow) {
    this.timeWindow = timeWindow;
  }

  public GetPaymentTransactionsRequest paymentScenarioReturnCriteria(PaymentScenario2Code paymentScenarioReturnCriteria) {
    this.paymentScenarioReturnCriteria = paymentScenarioReturnCriteria;
    return this;
  }

   /**
   * Criteria that specify which payment scenario is to be returned by the search.
   * @return paymentScenarioReturnCriteria
  **/
  @ApiModelProperty(required = true, value = "Criteria that specify which payment scenario is to be returned by the search.")
  public PaymentScenario2Code getPaymentScenarioReturnCriteria() {
    return paymentScenarioReturnCriteria;
  }

  public void setPaymentScenarioReturnCriteria(PaymentScenario2Code paymentScenarioReturnCriteria) {
    this.paymentScenarioReturnCriteria = paymentScenarioReturnCriteria;
  }

  public GetPaymentTransactionsRequest agent(List<AgentType1> agent) {
    this.agent = agent;
    return this;
  }

  public GetPaymentTransactionsRequest addAgentItem(AgentType1 agentItem) {
    if (this.agent == null) {
      this.agent = new ArrayList<AgentType1>();
    }
    this.agent.add(agentItem);
    return this;
  }

   /**
   * Identifies agent(s) involved in a payment transaction.
   * @return agent
  **/
  @ApiModelProperty(value = "Identifies agent(s) involved in a payment transaction.")
  public List<AgentType1> getAgent() {
    return agent;
  }

  public void setAgent(List<AgentType1> agent) {
    this.agent = agent;
  }

  public GetPaymentTransactionsRequest location(Location1Code location) {
    this.location = location;
    return this;
  }

   /**
   * Specifies the location of the search.
   * @return location
  **/
  @ApiModelProperty(value = "Specifies the location of the search.")
  public Location1Code getLocation() {
    return location;
  }

  public void setLocation(Location1Code location) {
    this.location = location;
  }

  public GetPaymentTransactionsRequest instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(value = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public GetPaymentTransactionsRequest transactionStatus(List<PaymentStatus3> transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  public GetPaymentTransactionsRequest addTransactionStatusItem(PaymentStatus3 transactionStatusItem) {
    if (this.transactionStatus == null) {
      this.transactionStatus = new ArrayList<PaymentStatus3>();
    }
    this.transactionStatus.add(transactionStatusItem);
    return this;
  }

   /**
   * Specifies the status of a transaction, in a coded form.
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "Specifies the status of a transaction, in a coded form.")
  public List<PaymentStatus3> getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(List<PaymentStatus3> transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public GetPaymentTransactionsRequest amount(AmountType1 amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Specifies the amount range for a given currency and amount type.
   * @return amount
  **/
  @ApiModelProperty(value = "Specifies the amount range for a given currency and amount type.")
  public AmountType1 getAmount() {
    return amount;
  }

  public void setAmount(AmountType1 amount) {
    this.amount = amount;
  }

  public GetPaymentTransactionsRequest event(PaymentTransactionState1Code event) {
    this.event = event;
    return this;
  }

   /**
   * Specifies one of the states of the payment transaction.
   * @return event
  **/
  @ApiModelProperty(required = true, value = "Specifies one of the states of the payment transaction.")
  public PaymentTransactionState1Code getEvent() {
    return event;
  }

  public void setEvent(PaymentTransactionState1Code event) {
    this.event = event;
  }

  public GetPaymentTransactionsRequest subjectToCancellationProcessIndicator(Boolean subjectToCancellationProcessIndicator) {
    this.subjectToCancellationProcessIndicator = subjectToCancellationProcessIndicator;
    return this;
  }

   /**
   * Indicates whether only payment transactions under a past or present stop and recall process should be retrieved.   Absence means no.
   * @return subjectToCancellationProcessIndicator
  **/
  @ApiModelProperty(value = "Indicates whether only payment transactions under a past or present stop and recall process should be retrieved.   Absence means no.")
  public Boolean getSubjectToCancellationProcessIndicator() {
    return subjectToCancellationProcessIndicator;
  }

  public void setSubjectToCancellationProcessIndicator(Boolean subjectToCancellationProcessIndicator) {
    this.subjectToCancellationProcessIndicator = subjectToCancellationProcessIndicator;
  }

  public GetPaymentTransactionsRequest maximumNumber(String maximumNumber) {
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

  public GetPaymentTransactionsRequest more(String more) {
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
    GetPaymentTransactionsRequest getPaymentTransactionsRequest = (GetPaymentTransactionsRequest) o;
    return Objects.equals(this.myInstitution, getPaymentTransactionsRequest.myInstitution) &&
        Objects.equals(this.timeWindow, getPaymentTransactionsRequest.timeWindow) &&
        Objects.equals(this.paymentScenarioReturnCriteria, getPaymentTransactionsRequest.paymentScenarioReturnCriteria) &&
        Objects.equals(this.agent, getPaymentTransactionsRequest.agent) &&
        Objects.equals(this.location, getPaymentTransactionsRequest.location) &&
        Objects.equals(this.instructionIdentification, getPaymentTransactionsRequest.instructionIdentification) &&
        Objects.equals(this.transactionStatus, getPaymentTransactionsRequest.transactionStatus) &&
        Objects.equals(this.amount, getPaymentTransactionsRequest.amount) &&
        Objects.equals(this.event, getPaymentTransactionsRequest.event) &&
        Objects.equals(this.subjectToCancellationProcessIndicator, getPaymentTransactionsRequest.subjectToCancellationProcessIndicator) &&
        Objects.equals(this.maximumNumber, getPaymentTransactionsRequest.maximumNumber) &&
        Objects.equals(this.more, getPaymentTransactionsRequest.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, timeWindow, paymentScenarioReturnCriteria, agent, location, instructionIdentification, transactionStatus, amount, event, subjectToCancellationProcessIndicator, maximumNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionsRequest {\n");

    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("    paymentScenarioReturnCriteria: ").append(toIndentedString(paymentScenarioReturnCriteria)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    subjectToCancellationProcessIndicator: ").append(toIndentedString(subjectToCancellationProcessIndicator)).append("\n");
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
