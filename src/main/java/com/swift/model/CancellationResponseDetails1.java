/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.InvestigationExecutionConfirmation5Code;
import com.swift.model.InvestigationExecutionStatusReason1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains detailed information from the cancellation response (e.g. an MT 196 or an MT 199).
 */
@ApiModel(description = "Contains detailed information from the cancellation response (e.g. an MT 196 or an MT 199).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class CancellationResponseDetails1 {
  @SerializedName("investigation_execution_status")
  private InvestigationExecutionConfirmation5Code investigationExecutionStatus = null;

  @SerializedName("investigation_execution_status_reason")
  private InvestigationExecutionStatusReason1 investigationExecutionStatusReason = null;

  public CancellationResponseDetails1 investigationExecutionStatus(InvestigationExecutionConfirmation5Code investigationExecutionStatus) {
    this.investigationExecutionStatus = investigationExecutionStatus;
    return this;
  }

   /**
   * Provides the status on the execution of an investigation.
   * @return investigationExecutionStatus
  **/
  @ApiModelProperty(required = true, value = "Provides the status on the execution of an investigation.")
  public InvestigationExecutionConfirmation5Code getInvestigationExecutionStatus() {
    return investigationExecutionStatus;
  }

  public void setInvestigationExecutionStatus(InvestigationExecutionConfirmation5Code investigationExecutionStatus) {
    this.investigationExecutionStatus = investigationExecutionStatus;
  }

  public CancellationResponseDetails1 investigationExecutionStatusReason(InvestigationExecutionStatusReason1 investigationExecutionStatusReason) {
    this.investigationExecutionStatusReason = investigationExecutionStatusReason;
    return this;
  }

   /**
   * Get investigationExecutionStatusReason
   * @return investigationExecutionStatusReason
  **/
  @ApiModelProperty(value = "")
  public InvestigationExecutionStatusReason1 getInvestigationExecutionStatusReason() {
    return investigationExecutionStatusReason;
  }

  public void setInvestigationExecutionStatusReason(InvestigationExecutionStatusReason1 investigationExecutionStatusReason) {
    this.investigationExecutionStatusReason = investigationExecutionStatusReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationResponseDetails1 cancellationResponseDetails1 = (CancellationResponseDetails1) o;
    return Objects.equals(this.investigationExecutionStatus, cancellationResponseDetails1.investigationExecutionStatus) &&
        Objects.equals(this.investigationExecutionStatusReason, cancellationResponseDetails1.investigationExecutionStatusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investigationExecutionStatus, investigationExecutionStatusReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationResponseDetails1 {\n");

    sb.append("    investigationExecutionStatus: ").append(toIndentedString(investigationExecutionStatus)).append("\n");
    sb.append("    investigationExecutionStatusReason: ").append(toIndentedString(investigationExecutionStatusReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
