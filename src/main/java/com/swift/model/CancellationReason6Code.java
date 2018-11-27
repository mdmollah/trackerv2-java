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
 * Provides the possible reasons why a payment is to be cancelled.
 */
@JsonAdapter(CancellationReason6Code.Adapter.class)
public enum CancellationReason6Code {

  DUPL("DUPL"),

  AGNT("AGNT"),

  CURR("CURR"),

  CUST("CUST"),

  UPAY("UPAY"),

  CUTA("CUTA"),

  TECH("TECH"),

  FRAD("FRAD"),

  AMNT("AMNT"),

  COVR("COVR");

  private String value;

  CancellationReason6Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CancellationReason6Code fromValue(String text) {
    for (CancellationReason6Code b : CancellationReason6Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CancellationReason6Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final CancellationReason6Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CancellationReason6Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CancellationReason6Code.fromValue(String.valueOf(value));
    }
  }
}
