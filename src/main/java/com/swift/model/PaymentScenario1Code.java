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
@JsonAdapter(PaymentScenario1Code.Adapter.class)
public enum PaymentScenario1Code {

  COVE("COVE"),

  CCTR("CCTR");

  private String value;

  PaymentScenario1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentScenario1Code fromValue(String text) {
    for (PaymentScenario1Code b : PaymentScenario1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentScenario1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentScenario1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentScenario1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentScenario1Code.fromValue(String.valueOf(value));
    }
  }
}
