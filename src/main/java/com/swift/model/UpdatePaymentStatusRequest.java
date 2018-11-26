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
import com.swift.model.PaymentScenario1Code;
import com.swift.model.PaymentStatusType2Choice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This API is a status confirmation update to inform the tracker about the updated status of a given payment.
 */
@ApiModel(description = "This API is a status confirmation update to inform the tracker about the updated status of a given payment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class UpdatePaymentStatusRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("update_payment_scenario")
  private PaymentScenario1Code updatePaymentScenario = null;

  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("payment_status")
  private PaymentStatusType2Choice paymentStatus = null;

  public UpdatePaymentStatusRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public UpdatePaymentStatusRequest businessService(String businessService) {
    this.businessService = businessService;
    return this;
  }

   /**
   * Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.
   * @return businessService
  **/
  @ApiModelProperty(required = true, value = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.  ")
  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }

  public UpdatePaymentStatusRequest updatePaymentScenario(PaymentScenario1Code updatePaymentScenario) {
    this.updatePaymentScenario = updatePaymentScenario;
    return this;
  }

   /**
   * Specifies which payment scenario is to be updated.
   * @return updatePaymentScenario
  **/
  @ApiModelProperty(required = true, value = "Specifies which payment scenario is to be updated.")
  public PaymentScenario1Code getUpdatePaymentScenario() {
    return updatePaymentScenario;
  }

  public void setUpdatePaymentScenario(PaymentScenario1Code updatePaymentScenario) {
    this.updatePaymentScenario = updatePaymentScenario;
  }

  public UpdatePaymentStatusRequest uetr(String uetr) {
    this.uetr = uetr;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference.   Format is lowercase separated by hyphens.
   * @return uetr
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference.   Format is lowercase separated by hyphens.")
  public String getUetr() {
    return uetr;
  }

  public void setUetr(String uetr) {
    this.uetr = uetr;
  }

  public UpdatePaymentStatusRequest instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public UpdatePaymentStatusRequest paymentStatus(PaymentStatusType2Choice paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Contains the details on the payment status.
   * @return paymentStatus
  **/
  @ApiModelProperty(required = true, value = "Contains the details on the payment status.")
  public PaymentStatusType2Choice getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusType2Choice paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentStatusRequest updatePaymentStatusRequest = (UpdatePaymentStatusRequest) o;
    return Objects.equals(this.from, updatePaymentStatusRequest.from) &&
        Objects.equals(this.businessService, updatePaymentStatusRequest.businessService) &&
        Objects.equals(this.updatePaymentScenario, updatePaymentStatusRequest.updatePaymentScenario) &&
        Objects.equals(this.uetr, updatePaymentStatusRequest.uetr) &&
        Objects.equals(this.instructionIdentification, updatePaymentStatusRequest.instructionIdentification) &&
        Objects.equals(this.paymentStatus, updatePaymentStatusRequest.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, businessService, updatePaymentScenario, uetr, instructionIdentification, paymentStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentStatusRequest {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    updatePaymentScenario: ").append(toIndentedString(updatePaymentScenario)).append("\n");
    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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
