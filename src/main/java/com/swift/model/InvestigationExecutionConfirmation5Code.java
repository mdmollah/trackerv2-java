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
 * Provides the status on an investigation.
 */
@JsonAdapter(InvestigationExecutionConfirmation5Code.Adapter.class)
public enum InvestigationExecutionConfirmation5Code {

  CNCL("CNCL"),

  PDCR("PDCR"),

  RJCR("RJCR");

  private String value;

  InvestigationExecutionConfirmation5Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvestigationExecutionConfirmation5Code fromValue(String text) {
    for (InvestigationExecutionConfirmation5Code b : InvestigationExecutionConfirmation5Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InvestigationExecutionConfirmation5Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvestigationExecutionConfirmation5Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvestigationExecutionConfirmation5Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvestigationExecutionConfirmation5Code.fromValue(String.valueOf(value));
    }
  }
}
