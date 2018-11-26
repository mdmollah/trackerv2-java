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
 * Specifies the status of a cancellation request.
 */
@JsonAdapter(CancellationIndividualStatus2Code.Adapter.class)
public enum CancellationIndividualStatus2Code {

  RJCR("RJCR"),

  CNCL("CNCL"),

  PDCR("PDCR");

  private String value;

  CancellationIndividualStatus2Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CancellationIndividualStatus2Code fromValue(String text) {
    for (CancellationIndividualStatus2Code b : CancellationIndividualStatus2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CancellationIndividualStatus2Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final CancellationIndividualStatus2Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CancellationIndividualStatus2Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CancellationIndividualStatus2Code.fromValue(String.valueOf(value));
    }
  }
}
