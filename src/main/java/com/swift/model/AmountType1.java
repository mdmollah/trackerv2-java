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
import com.swift.model.TypeOfAmount8Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies ranged amounts, for a specific currency and type of amount.
 */
@ApiModel(description = "Specifies ranged amounts, for a specific currency and type of amount.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class AmountType1 {
  @SerializedName("type")
  private TypeOfAmount8Code type = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("from_amount")
  private String fromAmount = null;

  @SerializedName("to_amount")
  private String toAmount = null;

  public AmountType1 type(TypeOfAmount8Code type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies the type of amount.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specifies the type of amount.")
  public TypeOfAmount8Code getType() {
    return type;
  }

  public void setType(TypeOfAmount8Code type) {
    this.type = type;
  }

  public AmountType1 currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code of the ranged amount.
   * @return currency
  **/
  @ApiModelProperty(value = "Currency code of the ranged amount.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AmountType1 fromAmount(String fromAmount) {
    this.fromAmount = fromAmount;
    return this;
  }

   /**
   * Lowest amount value
   * @return fromAmount
  **/
  @ApiModelProperty(required = true, value = "Lowest amount value")
  public String getFromAmount() {
    return fromAmount;
  }

  public void setFromAmount(String fromAmount) {
    this.fromAmount = fromAmount;
  }

  public AmountType1 toAmount(String toAmount) {
    this.toAmount = toAmount;
    return this;
  }

   /**
   * Highest amount value
   * @return toAmount
  **/
  @ApiModelProperty(required = true, value = "Highest amount value")
  public String getToAmount() {
    return toAmount;
  }

  public void setToAmount(String toAmount) {
    this.toAmount = toAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountType1 amountType1 = (AmountType1) o;
    return Objects.equals(this.type, amountType1.type) &&
        Objects.equals(this.currency, amountType1.currency) &&
        Objects.equals(this.fromAmount, amountType1.fromAmount) &&
        Objects.equals(this.toAmount, amountType1.toAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, currency, fromAmount, toAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountType1 {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
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
