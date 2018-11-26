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

/**
 * Specifies all the parties involved in a cover payment transaction.
 */
@ApiModel(description = "Specifies all the parties involved in a cover payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CreditTransferTransactionParties1 {
  @SerializedName("debtor")
  private String debtor = null;

  @SerializedName("debtor_agent")
  private String debtorAgent = null;

  @SerializedName("intermediary_agent1")
  private String intermediaryAgent1 = null;

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  @SerializedName("creditor")
  private String creditor = null;

  public CreditTransferTransactionParties1 debtor(String debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Financial institution that owes an amount of money to the (ultimate) financial institutional creditor.
   * @return debtor
  **/
  @ApiModelProperty(value = "Financial institution that owes an amount of money to the (ultimate) financial institutional creditor.")
  public String getDebtor() {
    return debtor;
  }

  public void setDebtor(String debtor) {
    this.debtor = debtor;
  }

  public CreditTransferTransactionParties1 debtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Financial institution servicing an account for the debtor.
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "Financial institution servicing an account for the debtor.")
  public String getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public CreditTransferTransactionParties1 intermediaryAgent1(String intermediaryAgent1) {
    this.intermediaryAgent1 = intermediaryAgent1;
    return this;
  }

   /**
   * Agent between the debtor&#39;s agent and the creditor&#39;s agent.
   * @return intermediaryAgent1
  **/
  @ApiModelProperty(value = "Agent between the debtor's agent and the creditor's agent.")
  public String getIntermediaryAgent1() {
    return intermediaryAgent1;
  }

  public void setIntermediaryAgent1(String intermediaryAgent1) {
    this.intermediaryAgent1 = intermediaryAgent1;
  }

  public CreditTransferTransactionParties1 creditorAgent(String creditorAgent) {
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

  public CreditTransferTransactionParties1 creditor(String creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Financial institution that receives an amount of money from the financial institutional debtor.
   * @return creditor
  **/
  @ApiModelProperty(value = "Financial institution that receives an amount of money from the financial institutional debtor.")
  public String getCreditor() {
    return creditor;
  }

  public void setCreditor(String creditor) {
    this.creditor = creditor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditTransferTransactionParties1 creditTransferTransactionParties1 = (CreditTransferTransactionParties1) o;
    return Objects.equals(this.debtor, creditTransferTransactionParties1.debtor) &&
        Objects.equals(this.debtorAgent, creditTransferTransactionParties1.debtorAgent) &&
        Objects.equals(this.intermediaryAgent1, creditTransferTransactionParties1.intermediaryAgent1) &&
        Objects.equals(this.creditorAgent, creditTransferTransactionParties1.creditorAgent) &&
        Objects.equals(this.creditor, creditTransferTransactionParties1.creditor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtor, debtorAgent, intermediaryAgent1, creditorAgent, creditor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditTransferTransactionParties1 {\n");

    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    intermediaryAgent1: ").append(toIndentedString(intermediaryAgent1)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
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
