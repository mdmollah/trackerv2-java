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
 * Provides the reason as to why a payment cancellation request is pending.
 */
@JsonAdapter(PendingPaymentCancellationReason2Code.Adapter.class)
public enum PendingPaymentCancellationReason2Code {

  INDM("INDM");

  private String value;

  PendingPaymentCancellationReason2Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PendingPaymentCancellationReason2Code fromValue(String text) {
    for (PendingPaymentCancellationReason2Code b : PendingPaymentCancellationReason2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PendingPaymentCancellationReason2Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PendingPaymentCancellationReason2Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PendingPaymentCancellationReason2Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PendingPaymentCancellationReason2Code.fromValue(String.valueOf(value));
    }
  }
}
