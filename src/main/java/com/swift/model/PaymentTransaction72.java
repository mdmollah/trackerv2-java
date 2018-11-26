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
import com.swift.model.ActiveOrHistoricCurrencyAndAmount;
import com.swift.model.CoverPaymentEvent1;
import com.swift.model.PaymentEvent2;
import com.swift.model.PaymentScenario3Code;
import com.swift.model.PaymentStatus3;
import com.swift.model.PaymentTransactionCancellationStatus3;
import com.swift.model.PaymentsPartyType2Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains details on the payment transaction.
 */
@ApiModel(description = "Contains details on the payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentTransaction72 {
  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("payment_scenario_returned")
  private PaymentScenario3Code paymentScenarioReturned = null;

  @SerializedName("my_institution")
  private String myInstitution = null;

  @SerializedName("role")
  private PaymentsPartyType2Code role = null;

  @SerializedName("event_time")
  private String eventTime = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("cancellation_status")
  private PaymentTransactionCancellationStatus3 cancellationStatus = null;

  @SerializedName("debtor_agent")
  private String debtorAgent = null;

  @SerializedName("debtor")
  private String debtor = null;

  @SerializedName("agent")
  private List<PaymentEvent2> agent = null;

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  @SerializedName("creditor")
  private String creditor = null;

  @SerializedName("initiation_time")
  private String initiationTime = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  @SerializedName("instructed_amount")
  private ActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @SerializedName("confirmed_amount")
  private ActiveOrHistoricCurrencyAndAmount confirmedAmount = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  @SerializedName("cover_payment_event")
  private List<CoverPaymentEvent1> coverPaymentEvent = null;

  public PaymentTransaction72 uetr(String uetr) {
    this.uetr = uetr;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference of a payment.
   * @return uetr
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference of a payment.")
  public String getUetr() {
    return uetr;
  }

  public void setUetr(String uetr) {
    this.uetr = uetr;
  }

  public PaymentTransaction72 paymentScenarioReturned(PaymentScenario3Code paymentScenarioReturned) {
    this.paymentScenarioReturned = paymentScenarioReturned;
    return this;
  }

   /**
   * Specifies which payment scenario is returned by the search.
   * @return paymentScenarioReturned
  **/
  @ApiModelProperty(required = true, value = "Specifies which payment scenario is returned by the search.")
  public PaymentScenario3Code getPaymentScenarioReturned() {
    return paymentScenarioReturned;
  }

  public void setPaymentScenarioReturned(PaymentScenario3Code paymentScenarioReturned) {
    this.paymentScenarioReturned = paymentScenarioReturned;
  }

  public PaymentTransaction72 myInstitution(String myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

   /**
   * Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.")
  public String getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(String myInstitution) {
    this.myInstitution = myInstitution;
  }

  public PaymentTransaction72 role(PaymentsPartyType2Code role) {
    this.role = role;
    return this;
  }

   /**
   * Specifies the role of the party in the payment chain.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "Specifies the role of the party in the payment chain.")
  public PaymentsPartyType2Code getRole() {
    return role;
  }

  public void setRole(PaymentsPartyType2Code role) {
    this.role = role;
  }

  public PaymentTransaction72 eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time determined by the Role that the entity defined in MyInstitution is playing in this transaction.
   * @return eventTime
  **/
  @ApiModelProperty(required = true, value = "Time determined by the Role that the entity defined in MyInstitution is playing in this transaction.")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public PaymentTransaction72 transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Specifies the status of a transaction, in a coded form.
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of a transaction, in a coded form.")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentTransaction72 cancellationStatus(PaymentTransactionCancellationStatus3 cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
    return this;
  }

   /**
   * Get cancellationStatus
   * @return cancellationStatus
  **/
  @ApiModelProperty(value = "")
  public PaymentTransactionCancellationStatus3 getCancellationStatus() {
    return cancellationStatus;
  }

  public void setCancellationStatus(PaymentTransactionCancellationStatus3 cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
  }

  public PaymentTransaction72 debtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Financial institution servicing an account for the debtor.     Debtor Agent in this case only refers to FI to FI Customer Credit Transfers.
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "Financial institution servicing an account for the debtor.     Debtor Agent in this case only refers to FI to FI Customer Credit Transfers.")
  public String getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public PaymentTransaction72 debtor(String debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Party that owes an amount of money to the (ultimate) creditor.    Debtor in this case only refers to Financial Institution Credit Transfer with cover.
   * @return debtor
  **/
  @ApiModelProperty(value = "Party that owes an amount of money to the (ultimate) creditor.    Debtor in this case only refers to Financial Institution Credit Transfer with cover.")
  public String getDebtor() {
    return debtor;
  }

  public void setDebtor(String debtor) {
    this.debtor = debtor;
  }

  public PaymentTransaction72 agent(List<PaymentEvent2> agent) {
    this.agent = agent;
    return this;
  }

  public PaymentTransaction72 addAgentItem(PaymentEvent2 agentItem) {
    if (this.agent == null) {
      this.agent = new ArrayList<PaymentEvent2>();
    }
    this.agent.add(agentItem);
    return this;
  }

   /**
   * Identifies the agent(s) currently participating in a transaction.
   * @return agent
  **/
  @ApiModelProperty(value = "Identifies the agent(s) currently participating in a transaction.")
  public List<PaymentEvent2> getAgent() {
    return agent;
  }

  public void setAgent(List<PaymentEvent2> agent) {
    this.agent = agent;
  }

  public PaymentTransaction72 creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Financial institution servicing an account for the creditor.
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "Financial institution servicing an account for the creditor.")
  public String getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PaymentTransaction72 creditor(String creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Party to which an amount of money is due.    This role is only to be used in Financial Institution Credit Transfer with cover
   * @return creditor
  **/
  @ApiModelProperty(value = "Party to which an amount of money is due.    This role is only to be used in Financial Institution Credit Transfer with cover")
  public String getCreditor() {
    return creditor;
  }

  public void setCreditor(String creditor) {
    this.creditor = creditor;
  }

  public PaymentTransaction72 initiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
    return this;
  }

   /**
   * Date and Time at which the message enters the Gpi system.
   * @return initiationTime
  **/
  @ApiModelProperty(required = true, value = "Date and Time at which the message enters the Gpi system.")
  public String getInitiationTime() {
    return initiationTime;
  }

  public void setInitiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
  }

  public PaymentTransaction72 completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC.")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }

  public PaymentTransaction72 instructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  This amount has to be transported unchanged through the transaction chain.
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  This amount has to be transported unchanged through the transaction chain.")
  public ActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentTransaction72 confirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * The actual amount that has been paid to the ultimate beneficiary, after all charges etc... have been deducted.
   * @return confirmedAmount
  **/
  @ApiModelProperty(value = "The actual amount that has been paid to the ultimate beneficiary, after all charges etc... have been deducted.")
  public ActiveOrHistoricCurrencyAndAmount getConfirmedAmount() {
    return confirmedAmount;
  }

  public void setConfirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }

  public PaymentTransaction72 lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Last date and time at which the status of this transaction was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "Last date and time at which the status of this transaction was updated.")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public PaymentTransaction72 coverPaymentEvent(List<CoverPaymentEvent1> coverPaymentEvent) {
    this.coverPaymentEvent = coverPaymentEvent;
    return this;
  }

  public PaymentTransaction72 addCoverPaymentEventItem(CoverPaymentEvent1 coverPaymentEventItem) {
    if (this.coverPaymentEvent == null) {
      this.coverPaymentEvent = new ArrayList<CoverPaymentEvent1>();
    }
    this.coverPaymentEvent.add(coverPaymentEventItem);
    return this;
  }

   /**
   * Specifies the payment events related to the underlying cover payment.
   * @return coverPaymentEvent
  **/
  @ApiModelProperty(value = "Specifies the payment events related to the underlying cover payment.")
  public List<CoverPaymentEvent1> getCoverPaymentEvent() {
    return coverPaymentEvent;
  }

  public void setCoverPaymentEvent(List<CoverPaymentEvent1> coverPaymentEvent) {
    this.coverPaymentEvent = coverPaymentEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransaction72 paymentTransaction72 = (PaymentTransaction72) o;
    return Objects.equals(this.uetr, paymentTransaction72.uetr) &&
        Objects.equals(this.paymentScenarioReturned, paymentTransaction72.paymentScenarioReturned) &&
        Objects.equals(this.myInstitution, paymentTransaction72.myInstitution) &&
        Objects.equals(this.role, paymentTransaction72.role) &&
        Objects.equals(this.eventTime, paymentTransaction72.eventTime) &&
        Objects.equals(this.transactionStatus, paymentTransaction72.transactionStatus) &&
        Objects.equals(this.cancellationStatus, paymentTransaction72.cancellationStatus) &&
        Objects.equals(this.debtorAgent, paymentTransaction72.debtorAgent) &&
        Objects.equals(this.debtor, paymentTransaction72.debtor) &&
        Objects.equals(this.agent, paymentTransaction72.agent) &&
        Objects.equals(this.creditorAgent, paymentTransaction72.creditorAgent) &&
        Objects.equals(this.creditor, paymentTransaction72.creditor) &&
        Objects.equals(this.initiationTime, paymentTransaction72.initiationTime) &&
        Objects.equals(this.completionTime, paymentTransaction72.completionTime) &&
        Objects.equals(this.instructedAmount, paymentTransaction72.instructedAmount) &&
        Objects.equals(this.confirmedAmount, paymentTransaction72.confirmedAmount) &&
        Objects.equals(this.lastUpdateTime, paymentTransaction72.lastUpdateTime) &&
        Objects.equals(this.coverPaymentEvent, paymentTransaction72.coverPaymentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uetr, paymentScenarioReturned, myInstitution, role, eventTime, transactionStatus, cancellationStatus, debtorAgent, debtor, agent, creditorAgent, creditor, initiationTime, completionTime, instructedAmount, confirmedAmount, lastUpdateTime, coverPaymentEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction72 {\n");

    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    paymentScenarioReturned: ").append(toIndentedString(paymentScenarioReturned)).append("\n");
    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    cancellationStatus: ").append(toIndentedString(cancellationStatus)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    initiationTime: ").append(toIndentedString(initiationTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    coverPaymentEvent: ").append(toIndentedString(coverPaymentEvent)).append("\n");
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
