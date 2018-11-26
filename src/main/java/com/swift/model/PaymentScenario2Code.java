/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Describes the payment scenario used for a payment transaction.
 */
@JsonAdapter(PaymentScenario2Code.Adapter.class)
public enum PaymentScenario2Code {

  CCTR("CCTR"),

  COVE("COVE"),

  CTCO("CTCO");

  private String value;

  PaymentScenario2Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentScenario2Code fromValue(String text) {
    for (PaymentScenario2Code b : PaymentScenario2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentScenario2Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentScenario2Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentScenario2Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentScenario2Code.fromValue(String.valueOf(value));
    }
  }
}
