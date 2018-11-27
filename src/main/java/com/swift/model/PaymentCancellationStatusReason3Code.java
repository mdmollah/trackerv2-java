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
 * Gets or Sets PaymentCancellationStatusReason3Code
 */
@JsonAdapter(PaymentCancellationStatusReason3Code.Adapter.class)
public enum PaymentCancellationStatusReason3Code {

  S003("S003"),

  S004("S004");

  private String value;

  PaymentCancellationStatusReason3Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentCancellationStatusReason3Code fromValue(String text) {
    for (PaymentCancellationStatusReason3Code b : PaymentCancellationStatusReason3Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentCancellationStatusReason3Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentCancellationStatusReason3Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentCancellationStatusReason3Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentCancellationStatusReason3Code.fromValue(String.valueOf(value));
    }
  }
}
