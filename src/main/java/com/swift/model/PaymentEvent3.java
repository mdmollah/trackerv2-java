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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the details of an invalid payment event.
 */
@ApiModel(description = "Contains the details of an invalid payment event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentEvent3 {
  @SerializedName("uetr")
  private String uetr = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("participant")
  private Boolean participant = null;

  @SerializedName("network_reference")
  private String networkReference = null;

  @SerializedName("message_name_identification")
  private String messageNameIdentification = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("invalidity_reason")
  private String invalidityReason = null;

  public PaymentEvent3 uetr(String uetr) {
    this.uetr = uetr;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference of a payment.
   * @return uetr
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference of a payment.")
  public String getUetr() {
    return uetr;
  }

  public void setUetr(String uetr) {
    this.uetr = uetr;
  }

  public PaymentEvent3 businessService(String businessService) {
    this.businessService = businessService;
    return this;
  }

   /**
   * Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.
   * @return businessService
  **/
  @ApiModelProperty(value = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.")
  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }

  public PaymentEvent3 participant(Boolean participant) {
    this.participant = participant;
    return this;
  }

   /**
   * Indicates whether the requestor institution participates in the payment transaction identified by the unique end to end transaction reference identification  (UETR).
   * @return participant
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the requestor institution participates in the payment transaction identified by the unique end to end transaction reference identification  (UETR).")
  public Boolean getParticipant() {
    return participant;
  }

  public void setParticipant(Boolean participant) {
    this.participant = participant;
  }

  public PaymentEvent3 networkReference(String networkReference) {
    this.networkReference = networkReference;
    return this;
  }

   /**
   * Reference assigned by the network when sending the payment.
   * @return networkReference
  **/
  @ApiModelProperty(required = true, value = "Reference assigned by the network when sending the payment.")
  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }

  public PaymentEvent3 messageNameIdentification(String messageNameIdentification) {
    this.messageNameIdentification = messageNameIdentification;
    return this;
  }

   /**
   * Specifies the original message name identifier to which the message refers.
   * @return messageNameIdentification
  **/
  @ApiModelProperty(required = true, value = "Specifies the original message name identifier to which the message refers.")
  public String getMessageNameIdentification() {
    return messageNameIdentification;
  }

  public void setMessageNameIdentification(String messageNameIdentification) {
    this.messageNameIdentification = messageNameIdentification;
  }

  public PaymentEvent3 instructionIdentification(String instructionIdentification) {
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

  public PaymentEvent3 from(String from) {
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

  public PaymentEvent3 to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).
   * @return to
  **/
  @ApiModelProperty(value = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public PaymentEvent3 invalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
    return this;
  }

   /**
   * Specifies the reason why the event is invalid.
   * @return invalidityReason
  **/
  @ApiModelProperty(required = true, value = "Specifies the reason why the event is invalid.")
  public String getInvalidityReason() {
    return invalidityReason;
  }

  public void setInvalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent3 paymentEvent3 = (PaymentEvent3) o;
    return Objects.equals(this.uetr, paymentEvent3.uetr) &&
        Objects.equals(this.businessService, paymentEvent3.businessService) &&
        Objects.equals(this.participant, paymentEvent3.participant) &&
        Objects.equals(this.networkReference, paymentEvent3.networkReference) &&
        Objects.equals(this.messageNameIdentification, paymentEvent3.messageNameIdentification) &&
        Objects.equals(this.instructionIdentification, paymentEvent3.instructionIdentification) &&
        Objects.equals(this.from, paymentEvent3.from) &&
        Objects.equals(this.to, paymentEvent3.to) &&
        Objects.equals(this.invalidityReason, paymentEvent3.invalidityReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uetr, businessService, participant, networkReference, messageNameIdentification, instructionIdentification, from, to, invalidityReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent3 {\n");

    sb.append("    uetr: ").append(toIndentedString(uetr)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    networkReference: ").append(toIndentedString(networkReference)).append("\n");
    sb.append("    messageNameIdentification: ").append(toIndentedString(messageNameIdentification)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    invalidityReason: ").append(toIndentedString(invalidityReason)).append("\n");
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
