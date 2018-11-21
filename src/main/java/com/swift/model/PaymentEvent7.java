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
import com.swift.model.ActiveCurrencyAndAmount;
import com.swift.model.ActiveOrHistoricCurrencyAndAmount;
import com.swift.model.ChargeBearerType3Code;
import com.swift.model.CreditTransferTransactionParties1;
import com.swift.model.CurrencyExchange8;
import com.swift.model.CustomerCreditTransferTransactionParties1;
import com.swift.model.PaymentStatus3;
import com.swift.model.TrackerEventType1Code;
import com.swift.model.UnderlyingCancellationDetails2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains information coming from the related MT 199 or MT 103, or the StatusConfirmationUpdate.
 */
@ApiModel(description = "Contains information coming from the related MT 199 or MT 103, or the StatusConfirmationUpdate.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T13:44:06.319-05:00")
public class PaymentEvent7 {
  @SerializedName("network_reference")
  private String networkReference = null;

  @SerializedName("message_name_identification")
  private String messageNameIdentification = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("tracker_event_type")
  private TrackerEventType1Code trackerEventType = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("invalidity_reason")
  private String invalidityReason = null;

  @SerializedName("invalidity_description")
  private String invalidityDescription = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("related_reference")
  private String relatedReference = null;

  @SerializedName("case_identification")
  private String caseIdentification = null;

  @SerializedName("original_instruction_identification")
  private String originalInstructionIdentification = null;

  @SerializedName("assignment_identification")
  private String assignmentIdentification = null;

  @SerializedName("resolved_case_identification")
  private String resolvedCaseIdentification = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("underlying_cancellation_details")
  private UnderlyingCancellationDetails2 underlyingCancellationDetails = null;

  @SerializedName("forwarded_to_agent")
  private String forwardedToAgent = null;

  @SerializedName("funds_available")
  private String fundsAvailable = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("originator")
  private String originator = null;

  @SerializedName("serial_parties")
  private CustomerCreditTransferTransactionParties1 serialParties = null;

  @SerializedName("cover_parties")
  private CreditTransferTransactionParties1 coverParties = null;

  @SerializedName("sender_acknowledgement_receipt")
  private String senderAcknowledgementReceipt = null;

  @SerializedName("received_date")
  private String receivedDate = null;

  @SerializedName("instructed_amount")
  private ActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @SerializedName("confirmed_amount")
  private ActiveOrHistoricCurrencyAndAmount confirmedAmount = null;

  @SerializedName("interbank_settlement_amount")
  private ActiveCurrencyAndAmount interbankSettlementAmount = null;

  @SerializedName("interbank_settlement_date")
  private String interbankSettlementDate = null;

  @SerializedName("charge_bearer")
  private ChargeBearerType3Code chargeBearer = null;

  @SerializedName("charge_amount")
  private List<ActiveOrHistoricCurrencyAndAmount> chargeAmount = null;

  @SerializedName("foreign_exchange_details")
  private CurrencyExchange8 foreignExchangeDetails = null;

  @SerializedName("update_payment")
  private String updatePayment = null;

  @SerializedName("duplicate_message_reference")
  private String duplicateMessageReference = null;

  @SerializedName("copied_business_service")
  private String copiedBusinessService = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  public PaymentEvent7 networkReference(String networkReference) {
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

  public PaymentEvent7 messageNameIdentification(String messageNameIdentification) {
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

  public PaymentEvent7 businessService(String businessService) {
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

  public PaymentEvent7 trackerEventType(TrackerEventType1Code trackerEventType) {
    this.trackerEventType = trackerEventType;
    return this;
  }

   /**
   * Indicates the type of payment event.
   * @return trackerEventType
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of payment event.")
  public TrackerEventType1Code getTrackerEventType() {
    return trackerEventType;
  }

  public void setTrackerEventType(TrackerEventType1Code trackerEventType) {
    this.trackerEventType = trackerEventType;
  }

  public PaymentEvent7 valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Indicates if a payment is consistent (YES) or not (NO).
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "Indicates if a payment is consistent (YES) or not (NO).")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentEvent7 invalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
    return this;
  }

   /**
   * Contains the additional information in case the event is not a valid component of a payment transaction.
   * @return invalidityReason
  **/
  @ApiModelProperty(value = "Contains the additional information in case the event is not a valid component of a payment transaction.")
  public String getInvalidityReason() {
    return invalidityReason;
  }

  public void setInvalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
  }

  public PaymentEvent7 invalidityDescription(String invalidityDescription) {
    this.invalidityDescription = invalidityDescription;
    return this;
  }

   /**
   * Contains a textual description as to why the event is not a valid component of a payments transaction.
   * @return invalidityDescription
  **/
  @ApiModelProperty(value = "Contains a textual description as to why the event is not a valid component of a payments transaction.")
  public String getInvalidityDescription() {
    return invalidityDescription;
  }

  public void setInvalidityDescription(String invalidityDescription) {
    this.invalidityDescription = invalidityDescription;
  }

  public PaymentEvent7 instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(value = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public PaymentEvent7 relatedReference(String relatedReference) {
    this.relatedReference = relatedReference;
    return this;
  }

   /**
   * Identification referring to the underlying payment transaction.
   * @return relatedReference
  **/
  @ApiModelProperty(value = "Identification referring to the underlying payment transaction.")
  public String getRelatedReference() {
    return relatedReference;
  }

  public void setRelatedReference(String relatedReference) {
    this.relatedReference = relatedReference;
  }

  public PaymentEvent7 caseIdentification(String caseIdentification) {
    this.caseIdentification = caseIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case.
   * @return caseIdentification
  **/
  @ApiModelProperty(value = "Uniquely identifies the case.")
  public String getCaseIdentification() {
    return caseIdentification;
  }

  public void setCaseIdentification(String caseIdentification) {
    this.caseIdentification = caseIdentification;
  }

  public PaymentEvent7 originalInstructionIdentification(String originalInstructionIdentification) {
    this.originalInstructionIdentification = originalInstructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.
   * @return originalInstructionIdentification
  **/
  @ApiModelProperty(value = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.")
  public String getOriginalInstructionIdentification() {
    return originalInstructionIdentification;
  }

  public void setOriginalInstructionIdentification(String originalInstructionIdentification) {
    this.originalInstructionIdentification = originalInstructionIdentification;
  }

  public PaymentEvent7 assignmentIdentification(String assignmentIdentification) {
    this.assignmentIdentification = assignmentIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case assignment.
   * @return assignmentIdentification
  **/
  @ApiModelProperty(value = "Uniquely identifies the case assignment.")
  public String getAssignmentIdentification() {
    return assignmentIdentification;
  }

  public void setAssignmentIdentification(String assignmentIdentification) {
    this.assignmentIdentification = assignmentIdentification;
  }

  public PaymentEvent7 resolvedCaseIdentification(String resolvedCaseIdentification) {
    this.resolvedCaseIdentification = resolvedCaseIdentification;
    return this;
  }

   /**
   * Uniquely identifies the case.
   * @return resolvedCaseIdentification
  **/
  @ApiModelProperty(value = "Uniquely identifies the case.")
  public String getResolvedCaseIdentification() {
    return resolvedCaseIdentification;
  }

  public void setResolvedCaseIdentification(String resolvedCaseIdentification) {
    this.resolvedCaseIdentification = resolvedCaseIdentification;
  }

  public PaymentEvent7 transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Specifies the status of a transaction, in a coded form.
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "Specifies the status of a transaction, in a coded form.")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentEvent7 underlyingCancellationDetails(UnderlyingCancellationDetails2 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
    return this;
  }

   /**
   * Provides further information with regards to the cancellation of the payments event.
   * @return underlyingCancellationDetails
  **/
  @ApiModelProperty(value = "Provides further information with regards to the cancellation of the payments event.")
  public UnderlyingCancellationDetails2 getUnderlyingCancellationDetails() {
    return underlyingCancellationDetails;
  }

  public void setUnderlyingCancellationDetails(UnderlyingCancellationDetails2 underlyingCancellationDetails) {
    this.underlyingCancellationDetails = underlyingCancellationDetails;
  }

  public PaymentEvent7 forwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
    return this;
  }

   /**
   * Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.
   * @return forwardedToAgent
  **/
  @ApiModelProperty(value = "Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001.")
  public String getForwardedToAgent() {
    return forwardedToAgent;
  }

  public void setForwardedToAgent(String forwardedToAgent) {
    this.forwardedToAgent = forwardedToAgent;
  }

  public PaymentEvent7 fundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

   /**
   * Date and time at which the funds are available,  as reported in the ACSC status update.  Must only be used when TransactionStatus is \&quot;ACSC\&quot;.
   * @return fundsAvailable
  **/
  @ApiModelProperty(value = "Date and time at which the funds are available,  as reported in the ACSC status update.  Must only be used when TransactionStatus is \"ACSC\".")
  public String getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public PaymentEvent7 from(String from) {
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

  public PaymentEvent7 to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).
   * @return to
  **/
  @ApiModelProperty(required = true, value = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public PaymentEvent7 originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Party that issues the status.
   * @return originator
  **/
  @ApiModelProperty(value = "Party that issues the status.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public PaymentEvent7 serialParties(CustomerCreditTransferTransactionParties1 serialParties) {
    this.serialParties = serialParties;
    return this;
  }

   /**
   * Specifies the parties involved in a serial payment scenario.
   * @return serialParties
  **/
  @ApiModelProperty(value = "Specifies the parties involved in a serial payment scenario.")
  public CustomerCreditTransferTransactionParties1 getSerialParties() {
    return serialParties;
  }

  public void setSerialParties(CustomerCreditTransferTransactionParties1 serialParties) {
    this.serialParties = serialParties;
  }

  public PaymentEvent7 coverParties(CreditTransferTransactionParties1 coverParties) {
    this.coverParties = coverParties;
    return this;
  }

   /**
   * Specifies the parties involved in a cover payment scenario.
   * @return coverParties
  **/
  @ApiModelProperty(value = "Specifies the parties involved in a cover payment scenario.")
  public CreditTransferTransactionParties1 getCoverParties() {
    return coverParties;
  }

  public void setCoverParties(CreditTransferTransactionParties1 coverParties) {
    this.coverParties = coverParties;
  }

  public PaymentEvent7 senderAcknowledgementReceipt(String senderAcknowledgementReceipt) {
    this.senderAcknowledgementReceipt = senderAcknowledgementReceipt;
    return this;
  }

   /**
   * Date and time at which the sender was acknowledged receipt of the message.
   * @return senderAcknowledgementReceipt
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the sender was acknowledged receipt of the message.")
  public String getSenderAcknowledgementReceipt() {
    return senderAcknowledgementReceipt;
  }

  public void setSenderAcknowledgementReceipt(String senderAcknowledgementReceipt) {
    this.senderAcknowledgementReceipt = senderAcknowledgementReceipt;
  }

  public PaymentEvent7 receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Date and time at which the message was acknowledged by the receiver.
   * @return receivedDate
  **/
  @ApiModelProperty(value = "Date and time at which the message was acknowledged by the receiver.")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public PaymentEvent7 instructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Amount of money to be moved between the debtor (ordering customer) and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  Usage: This amount has to be transported unchanged through the transaction chain.
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "Amount of money to be moved between the debtor (ordering customer) and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  Usage: This amount has to be transported unchanged through the transaction chain.")
  public ActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentEvent7 confirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount.
   * @return confirmedAmount
  **/
  @ApiModelProperty(value = "The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount.")
  public ActiveOrHistoricCurrencyAndAmount getConfirmedAmount() {
    return confirmedAmount;
  }

  public void setConfirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }

  public PaymentEvent7 interbankSettlementAmount(ActiveCurrencyAndAmount interbankSettlementAmount) {
    this.interbankSettlementAmount = interbankSettlementAmount;
    return this;
  }

   /**
   * Amount of money moved between the instructing agent and the instructed agent.
   * @return interbankSettlementAmount
  **/
  @ApiModelProperty(value = "Amount of money moved between the instructing agent and the instructed agent.")
  public ActiveCurrencyAndAmount getInterbankSettlementAmount() {
    return interbankSettlementAmount;
  }

  public void setInterbankSettlementAmount(ActiveCurrencyAndAmount interbankSettlementAmount) {
    this.interbankSettlementAmount = interbankSettlementAmount;
  }

  public PaymentEvent7 interbankSettlementDate(String interbankSettlementDate) {
    this.interbankSettlementDate = interbankSettlementDate;
    return this;
  }

   /**
   * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.
   * @return interbankSettlementDate
  **/
  @ApiModelProperty(value = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.")
  public String getInterbankSettlementDate() {
    return interbankSettlementDate;
  }

  public void setInterbankSettlementDate(String interbankSettlementDate) {
    this.interbankSettlementDate = interbankSettlementDate;
  }

  public PaymentEvent7 chargeBearer(ChargeBearerType3Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

   /**
   * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
   * @return chargeBearer
  **/
  @ApiModelProperty(value = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.")
  public ChargeBearerType3Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(ChargeBearerType3Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public PaymentEvent7 chargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  public PaymentEvent7 addChargeAmountItem(ActiveOrHistoricCurrencyAndAmount chargeAmountItem) {
    if (this.chargeAmount == null) {
      this.chargeAmount = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
    }
    this.chargeAmount.add(chargeAmountItem);
    return this;
  }

   /**
   * Amount of money asked or paid for the charge.
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "Amount of money asked or paid for the charge.")
  public List<ActiveOrHistoricCurrencyAndAmount> getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public PaymentEvent7 foreignExchangeDetails(CurrencyExchange8 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
    return this;
  }

   /**
   * Specifies the exchange rate details between two currencies.
   * @return foreignExchangeDetails
  **/
  @ApiModelProperty(value = "Specifies the exchange rate details between two currencies.")
  public CurrencyExchange8 getForeignExchangeDetails() {
    return foreignExchangeDetails;
  }

  public void setForeignExchangeDetails(CurrencyExchange8 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
  }

  public PaymentEvent7 updatePayment(String updatePayment) {
    this.updatePayment = updatePayment;
    return this;
  }

   /**
   * Implements the correlation between a payment message and a status update on it.   Contains the network reference of the payment for which the status confirmation was applicable.
   * @return updatePayment
  **/
  @ApiModelProperty(value = "Implements the correlation between a payment message and a status update on it.   Contains the network reference of the payment for which the status confirmation was applicable.")
  public String getUpdatePayment() {
    return updatePayment;
  }

  public void setUpdatePayment(String updatePayment) {
    this.updatePayment = updatePayment;
  }

  public PaymentEvent7 duplicateMessageReference(String duplicateMessageReference) {
    this.duplicateMessageReference = duplicateMessageReference;
    return this;
  }

   /**
   * Network reference of the Payment that is the original recorded Payment.
   * @return duplicateMessageReference
  **/
  @ApiModelProperty(value = "Network reference of the Payment that is the original recorded Payment.")
  public String getDuplicateMessageReference() {
    return duplicateMessageReference;
  }

  public void setDuplicateMessageReference(String duplicateMessageReference) {
    this.duplicateMessageReference = duplicateMessageReference;
  }

  public PaymentEvent7 copiedBusinessService(String copiedBusinessService) {
    this.copiedBusinessService = copiedBusinessService;
    return this;
  }

   /**
   * Specifies the copied business service of the market infrastructure.
   * @return copiedBusinessService
  **/
  @ApiModelProperty(value = "Specifies the copied business service of the market infrastructure.")
  public String getCopiedBusinessService() {
    return copiedBusinessService;
  }

  public void setCopiedBusinessService(String copiedBusinessService) {
    this.copiedBusinessService = copiedBusinessService;
  }

  public PaymentEvent7 lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Last date and time at which the status of this Payment event was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "Last date and time at which the status of this Payment event was updated.")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent7 paymentEvent7 = (PaymentEvent7) o;
    return Objects.equals(this.networkReference, paymentEvent7.networkReference) &&
        Objects.equals(this.messageNameIdentification, paymentEvent7.messageNameIdentification) &&
        Objects.equals(this.businessService, paymentEvent7.businessService) &&
        Objects.equals(this.trackerEventType, paymentEvent7.trackerEventType) &&
        Objects.equals(this.valid, paymentEvent7.valid) &&
        Objects.equals(this.invalidityReason, paymentEvent7.invalidityReason) &&
        Objects.equals(this.invalidityDescription, paymentEvent7.invalidityDescription) &&
        Objects.equals(this.instructionIdentification, paymentEvent7.instructionIdentification) &&
        Objects.equals(this.relatedReference, paymentEvent7.relatedReference) &&
        Objects.equals(this.caseIdentification, paymentEvent7.caseIdentification) &&
        Objects.equals(this.originalInstructionIdentification, paymentEvent7.originalInstructionIdentification) &&
        Objects.equals(this.assignmentIdentification, paymentEvent7.assignmentIdentification) &&
        Objects.equals(this.resolvedCaseIdentification, paymentEvent7.resolvedCaseIdentification) &&
        Objects.equals(this.transactionStatus, paymentEvent7.transactionStatus) &&
        Objects.equals(this.underlyingCancellationDetails, paymentEvent7.underlyingCancellationDetails) &&
        Objects.equals(this.forwardedToAgent, paymentEvent7.forwardedToAgent) &&
        Objects.equals(this.fundsAvailable, paymentEvent7.fundsAvailable) &&
        Objects.equals(this.from, paymentEvent7.from) &&
        Objects.equals(this.to, paymentEvent7.to) &&
        Objects.equals(this.originator, paymentEvent7.originator) &&
        Objects.equals(this.serialParties, paymentEvent7.serialParties) &&
        Objects.equals(this.coverParties, paymentEvent7.coverParties) &&
        Objects.equals(this.senderAcknowledgementReceipt, paymentEvent7.senderAcknowledgementReceipt) &&
        Objects.equals(this.receivedDate, paymentEvent7.receivedDate) &&
        Objects.equals(this.instructedAmount, paymentEvent7.instructedAmount) &&
        Objects.equals(this.confirmedAmount, paymentEvent7.confirmedAmount) &&
        Objects.equals(this.interbankSettlementAmount, paymentEvent7.interbankSettlementAmount) &&
        Objects.equals(this.interbankSettlementDate, paymentEvent7.interbankSettlementDate) &&
        Objects.equals(this.chargeBearer, paymentEvent7.chargeBearer) &&
        Objects.equals(this.chargeAmount, paymentEvent7.chargeAmount) &&
        Objects.equals(this.foreignExchangeDetails, paymentEvent7.foreignExchangeDetails) &&
        Objects.equals(this.updatePayment, paymentEvent7.updatePayment) &&
        Objects.equals(this.duplicateMessageReference, paymentEvent7.duplicateMessageReference) &&
        Objects.equals(this.copiedBusinessService, paymentEvent7.copiedBusinessService) &&
        Objects.equals(this.lastUpdateTime, paymentEvent7.lastUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkReference, messageNameIdentification, businessService, trackerEventType, valid, invalidityReason, invalidityDescription, instructionIdentification, relatedReference, caseIdentification, originalInstructionIdentification, assignmentIdentification, resolvedCaseIdentification, transactionStatus, underlyingCancellationDetails, forwardedToAgent, fundsAvailable, from, to, originator, serialParties, coverParties, senderAcknowledgementReceipt, receivedDate, instructedAmount, confirmedAmount, interbankSettlementAmount, interbankSettlementDate, chargeBearer, chargeAmount, foreignExchangeDetails, updatePayment, duplicateMessageReference, copiedBusinessService, lastUpdateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent7 {\n");

    sb.append("    networkReference: ").append(toIndentedString(networkReference)).append("\n");
    sb.append("    messageNameIdentification: ").append(toIndentedString(messageNameIdentification)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    trackerEventType: ").append(toIndentedString(trackerEventType)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    invalidityReason: ").append(toIndentedString(invalidityReason)).append("\n");
    sb.append("    invalidityDescription: ").append(toIndentedString(invalidityDescription)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    relatedReference: ").append(toIndentedString(relatedReference)).append("\n");
    sb.append("    caseIdentification: ").append(toIndentedString(caseIdentification)).append("\n");
    sb.append("    originalInstructionIdentification: ").append(toIndentedString(originalInstructionIdentification)).append("\n");
    sb.append("    assignmentIdentification: ").append(toIndentedString(assignmentIdentification)).append("\n");
    sb.append("    resolvedCaseIdentification: ").append(toIndentedString(resolvedCaseIdentification)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    underlyingCancellationDetails: ").append(toIndentedString(underlyingCancellationDetails)).append("\n");
    sb.append("    forwardedToAgent: ").append(toIndentedString(forwardedToAgent)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    serialParties: ").append(toIndentedString(serialParties)).append("\n");
    sb.append("    coverParties: ").append(toIndentedString(coverParties)).append("\n");
    sb.append("    senderAcknowledgementReceipt: ").append(toIndentedString(senderAcknowledgementReceipt)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    interbankSettlementAmount: ").append(toIndentedString(interbankSettlementAmount)).append("\n");
    sb.append("    interbankSettlementDate: ").append(toIndentedString(interbankSettlementDate)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    foreignExchangeDetails: ").append(toIndentedString(foreignExchangeDetails)).append("\n");
    sb.append("    updatePayment: ").append(toIndentedString(updatePayment)).append("\n");
    sb.append("    duplicateMessageReference: ").append(toIndentedString(duplicateMessageReference)).append("\n");
    sb.append("    copiedBusinessService: ").append(toIndentedString(copiedBusinessService)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
