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
 * Gets or Sets PaymentCancellationStatusReason2Code
 */
@JsonAdapter(PaymentCancellationStatusReason2Code.Adapter.class)
public enum PaymentCancellationStatusReason2Code {

  S004("S004"),

  S003("S003"),

  S002("S002"),

  S000("S000"),

  S001("S001");

  private String value;

  PaymentCancellationStatusReason2Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentCancellationStatusReason2Code fromValue(String text) {
    for (PaymentCancellationStatusReason2Code b : PaymentCancellationStatusReason2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentCancellationStatusReason2Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentCancellationStatusReason2Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentCancellationStatusReason2Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentCancellationStatusReason2Code.fromValue(String.valueOf(value));
    }
  }
}
