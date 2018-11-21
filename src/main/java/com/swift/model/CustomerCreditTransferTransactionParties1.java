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
 * Specifies all the parties involved in a serial payment transaction.
 */
@ApiModel(description = "Specifies all the parties involved in a serial payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CustomerCreditTransferTransactionParties1 {
  @SerializedName("debtor_agent")
  private String debtorAgent = null;

  @SerializedName("instructing_reimbursement_agent")
  private String instructingReimbursementAgent = null;

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  public CustomerCreditTransferTransactionParties1 debtorAgent(String debtorAgent) {
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

  public CustomerCreditTransferTransactionParties1 instructingReimbursementAgent(String instructingReimbursementAgent) {
    this.instructingReimbursementAgent = instructingReimbursementAgent;
    return this;
  }

   /**
   * Agent through which the instructing agent (identified in the \&quot;From\&quot; element) will reimburse the instructed agent (identified in the \&quot;To\&quot; element).
   * @return instructingReimbursementAgent
  **/
  @ApiModelProperty(value = "Agent through which the instructing agent (identified in the \"From\" element) will reimburse the instructed agent (identified in the \"To\" element).")
  public String getInstructingReimbursementAgent() {
    return instructingReimbursementAgent;
  }

  public void setInstructingReimbursementAgent(String instructingReimbursementAgent) {
    this.instructingReimbursementAgent = instructingReimbursementAgent;
  }

  public CustomerCreditTransferTransactionParties1 creditorAgent(String creditorAgent) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreditTransferTransactionParties1 customerCreditTransferTransactionParties1 = (CustomerCreditTransferTransactionParties1) o;
    return Objects.equals(this.debtorAgent, customerCreditTransferTransactionParties1.debtorAgent) &&
        Objects.equals(this.instructingReimbursementAgent, customerCreditTransferTransactionParties1.instructingReimbursementAgent) &&
        Objects.equals(this.creditorAgent, customerCreditTransferTransactionParties1.creditorAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtorAgent, instructingReimbursementAgent, creditorAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreditTransferTransactionParties1 {\n");

    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    instructingReimbursementAgent: ").append(toIndentedString(instructingReimbursementAgent)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
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
