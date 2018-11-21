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
 * Set of elements used to provide details of the currency exchange.
 */
@ApiModel(description = "Set of elements used to provide details of the currency exchange.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CurrencyExchange8 {
  @SerializedName("source_currency")
  private String sourceCurrency = null;

  @SerializedName("target_currency")
  private String targetCurrency = null;

  @SerializedName("exchange_rate")
  private String exchangeRate = null;

  public CurrencyExchange8 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public CurrencyExchange8 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

   /**
   * Currency into which an amount is to be converted in a currency conversion.
   * @return targetCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency into which an amount is to be converted in a currency conversion.")
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public CurrencyExchange8 exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.  Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate &#x3D; UnitCurrency/QuotedCurrency).
   * @return exchangeRate
  **/
  @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.  Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyExchange8 currencyExchange8 = (CurrencyExchange8) o;
    return Objects.equals(this.sourceCurrency, currencyExchange8.sourceCurrency) &&
        Objects.equals(this.targetCurrency, currencyExchange8.targetCurrency) &&
        Objects.equals(this.exchangeRate, currencyExchange8.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, targetCurrency, exchangeRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyExchange8 {\n");

    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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
