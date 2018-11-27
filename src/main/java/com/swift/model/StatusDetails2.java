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
 * Contains details on the status of a payment.
 */
@ApiModel(description = "Contains details on the status of a payment.")
public class StatusDetails2 {
  @SerializedName("originator")
  private String originator = null;

  @SerializedName("funds_available")
  private String fundsAvailable = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("forwarded_to_agent")
  private String forwardedToAgent = null;

  @SerializedName("confirmed_amount")
  private ActiveOrHistoricCurrencyAndAmount confirmedAmount = null;

  @SerializedName("foreign_exchange_details")
  private CurrencyExchange8 foreignExchangeDetails = null;

  @SerializedName("charge_amount")
  private List<ActiveOrHistoricCurrencyAndAmount> chargeAmount = null;

  public StatusDetails2 originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Party that issues the status.
   * @return originator
  **/
  @ApiModelProperty(required = true, value = "Party that issues the status.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public StatusDetails2 fundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

   /**
   * Date and time at which the funds are available,  as reported in the ACSC status update.
   * @return fundsAvailable
  **/
  @ApiModelProperty(value = "Date and time at which the funds are available,  as reported in the ACSC status update.")
  public String getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public StatusDetails2 transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Specifies the status of the transaction.
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of the transaction.")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public StatusDetails2 forwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
    return this;
  }

   /**
   * Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.
   * @return forwardedToAgent
  **/
  @ApiModelProperty(value = "Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.")
  public String getForwardedToAgent() {
    return forwardedToAgent;
  }

  public void setForwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
  }

  public StatusDetails2 confirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount.
   * @return confirmedAmount
  **/
  @ApiModelProperty(required = true, value = "The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount.")
  public ActiveOrHistoricCurrencyAndAmount getConfirmedAmount() {
    return confirmedAmount;
  }

  public void setConfirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }

  public StatusDetails2 foreignExchangeDetails(CurrencyExchange8 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
    return this;
  }

   /**
   * Specifies the exchange rate details between two currencies.
   * @return foreignExchangeDetails
  **/
  @ApiModelProperty(value = "Specifies the exchange rate details between two currencies.")
  public CurrencyExchange8 getForeignExchangeDetails() {
    return foreignExchangeDetails;
  }

  public void setForeignExchangeDetails(CurrencyExchange8 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
  }

  public StatusDetails2 chargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  public StatusDetails2 addChargeAmountItem(ActiveOrHistoricCurrencyAndAmount chargeAmountItem) {
    if (this.chargeAmount == null) {
      this.chargeAmount = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
    }
    this.chargeAmount.add(chargeAmountItem);
    return this;
  }

   /**
   * Amount of money asked or paid for the charge.
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "Amount of money asked or paid for the charge.")
  public List<ActiveOrHistoricCurrencyAndAmount> getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails2 statusDetails2 = (StatusDetails2) o;
    return Objects.equals(this.originator, statusDetails2.originator) &&
        Objects.equals(this.fundsAvailable, statusDetails2.fundsAvailable) &&
        Objects.equals(this.transactionStatus, statusDetails2.transactionStatus) &&
        Objects.equals(this.forwardedToAgent, statusDetails2.forwardedToAgent) &&
        Objects.equals(this.confirmedAmount, statusDetails2.confirmedAmount) &&
        Objects.equals(this.foreignExchangeDetails, statusDetails2.foreignExchangeDetails) &&
        Objects.equals(this.chargeAmount, statusDetails2.chargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originator, fundsAvailable, transactionStatus, forwardedToAgent, confirmedAmount, foreignExchangeDetails, chargeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails2 {\n");

    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    forwardedToAgent: ").append(toIndentedString(forwardedToAgent)).append("\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    foreignExchangeDetails: ").append(toIndentedString(foreignExchangeDetails)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
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
