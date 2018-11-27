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
 * Indicates the type of payment event.
 */
@JsonAdapter(TrackerEventType1Code.Adapter.class)
public enum TrackerEventType1Code {

  COPT("COPT"),

  CTPT("CTPT"),

  CTCA("CTCA"),

  CTTS("CTTS"),

  CTCR("CTCR"),

  COSU("COSU"),

  CTSU("CTSU");

  private String value;

  TrackerEventType1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrackerEventType1Code fromValue(String text) {
    for (TrackerEventType1Code b : TrackerEventType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TrackerEventType1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final TrackerEventType1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TrackerEventType1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TrackerEventType1Code.fromValue(String.valueOf(value));
    }
  }
}
