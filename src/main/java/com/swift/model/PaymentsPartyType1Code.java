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
 * CodeSet identifying parties involved in a payments transaction.
 */
@JsonAdapter(PaymentsPartyType1Code.Adapter.class)
public enum PaymentsPartyType1Code {

  ALPA("ALPA"),

  CACR("CACR"),

  DADE("DADE"),

  INAG("INAG");

  private String value;

  PaymentsPartyType1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentsPartyType1Code fromValue(String text) {
    for (PaymentsPartyType1Code b : PaymentsPartyType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentsPartyType1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentsPartyType1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentsPartyType1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentsPartyType1Code.fromValue(String.valueOf(value));
    }
  }
}
