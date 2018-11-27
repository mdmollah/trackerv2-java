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
 * Provides the reason as to why a payment cancellation request is pending.
 */
@JsonAdapter(PendingPaymentCancellationReason1Code.Adapter.class)
public enum PendingPaymentCancellationReason1Code {

  INDM("INDM"),

  PTNA("PTNA"),

  RQDA("RQDA");

  private String value;

  PendingPaymentCancellationReason1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PendingPaymentCancellationReason1Code fromValue(String text) {
    for (PendingPaymentCancellationReason1Code b : PendingPaymentCancellationReason1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PendingPaymentCancellationReason1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PendingPaymentCancellationReason1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PendingPaymentCancellationReason1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PendingPaymentCancellationReason1Code.fromValue(String.valueOf(value));
    }
  }
}
