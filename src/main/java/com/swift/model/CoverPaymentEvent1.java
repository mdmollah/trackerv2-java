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
import com.swift.model.PaymentEvent2;
import com.swift.model.PaymentStatus3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies a payment transaction related to the underlying cover payment.
 */
@ApiModel(description = "Specifies a payment transaction related to the underlying cover payment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CoverPaymentEvent1 {
  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("debtor")
  private String debtor = null;

  @SerializedName("agent")
  private List<PaymentEvent2> agent = new ArrayList<PaymentEvent2>();

  @SerializedName("creditor")
  private String creditor = null;

  @SerializedName("initiation_time")
  private String initiationTime = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  @SerializedName("instructed_amount")
  private ActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  public CoverPaymentEvent1 transactionStatus(PaymentStatus3 transactionStatus) {
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

  public CoverPaymentEvent1 debtor(String debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Party that owes an amount of money to the (ultimate) creditor.
   * @return debtor
  **/
  @ApiModelProperty(value = "Party that owes an amount of money to the (ultimate) creditor.")
  public String getDebtor() {
    return debtor;
  }

  public void setDebtor(String debtor) {
    this.debtor = debtor;
  }

  public CoverPaymentEvent1 agent(List<PaymentEvent2> agent) {
    this.agent = agent;
    return this;
  }

  public CoverPaymentEvent1 addAgentItem(PaymentEvent2 agentItem) {
    this.agent.add(agentItem);
    return this;
  }

   /**
   * Identifies the agent(s) currently participating in a transaction.
   * @return agent
  **/
  @ApiModelProperty(required = true, value = "Identifies the agent(s) currently participating in a transaction.")
  public List<PaymentEvent2> getAgent() {
    return agent;
  }

  public void setAgent(List<PaymentEvent2> agent) {
    this.agent = agent;
  }

  public CoverPaymentEvent1 creditor(String creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Party to which an amount of money is due.
   * @return creditor
  **/
  @ApiModelProperty(value = "Party to which an amount of money is due.")
  public String getCreditor() {
    return creditor;
  }

  public void setCreditor(String creditor) {
    this.creditor = creditor;
  }

  public CoverPaymentEvent1 initiationTime(String initiationTime) {
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

  public CoverPaymentEvent1 completionTime(String completionTime) {
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

  public CoverPaymentEvent1 instructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
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

  public CoverPaymentEvent1 lastUpdateTime(String lastUpdateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverPaymentEvent1 coverPaymentEvent1 = (CoverPaymentEvent1) o;
    return Objects.equals(this.transactionStatus, coverPaymentEvent1.transactionStatus) &&
        Objects.equals(this.debtor, coverPaymentEvent1.debtor) &&
        Objects.equals(this.agent, coverPaymentEvent1.agent) &&
        Objects.equals(this.creditor, coverPaymentEvent1.creditor) &&
        Objects.equals(this.initiationTime, coverPaymentEvent1.initiationTime) &&
        Objects.equals(this.completionTime, coverPaymentEvent1.completionTime) &&
        Objects.equals(this.instructedAmount, coverPaymentEvent1.instructedAmount) &&
        Objects.equals(this.lastUpdateTime, coverPaymentEvent1.lastUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, debtor, agent, creditor, initiationTime, completionTime, instructedAmount, lastUpdateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverPaymentEvent1 {\n");

    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    initiationTime: ").append(toIndentedString(initiationTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
