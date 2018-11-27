/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.
 */
@ApiModel(description = "A number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.")
public class ActiveOrHistoricCurrencyAndAmount {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("Amount")
  private String amount = null;

  public ActiveOrHistoricCurrencyAndAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ActiveOrHistoricCurrencyAndAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = (ActiveOrHistoricCurrencyAndAmount) o;
    return Objects.equals(this.currency, activeOrHistoricCurrencyAndAmount.currency) &&
        Objects.equals(this.amount, activeOrHistoricCurrencyAndAmount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveOrHistoricCurrencyAndAmount {\n");

    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
