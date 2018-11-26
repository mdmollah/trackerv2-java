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
 * Returned when a request for cancellation cannot be executed.
 */
@JsonAdapter(PaymentCancellationRejection3Code.Adapter.class)
public enum PaymentCancellationRejection3Code {

  AGNT("AGNT"),

  ARDT("ARDT"),

  INDM("INDM"),

  AC04("AC04"),

  CUST("CUST"),

  AM04("AM04"),

  LEGL("LEGL"),

  NOAS("NOAS"),

  NOOR("NOOR");

  private String value;

  PaymentCancellationRejection3Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentCancellationRejection3Code fromValue(String text) {
    for (PaymentCancellationRejection3Code b : PaymentCancellationRejection3Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentCancellationRejection3Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentCancellationRejection3Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentCancellationRejection3Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentCancellationRejection3Code.fromValue(String.valueOf(value));
    }
  }
}
