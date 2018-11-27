/*
 * Tracker API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Describes the payment scenario used for a payment transaction.
 */
@JsonAdapter(PaymentScenario3Code.Adapter.class)
public enum PaymentScenario3Code {

  COVE("COVE"),

  CCTW("CCTW"),

  CCTC("CCTC");

  private String value;

  PaymentScenario3Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentScenario3Code fromValue(String text) {
    for (PaymentScenario3Code b : PaymentScenario3Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentScenario3Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentScenario3Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentScenario3Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentScenario3Code.fromValue(String.valueOf(value));
    }
  }
}
