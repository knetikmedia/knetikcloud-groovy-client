package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TransactionResource {

  /* The unix timestamp in seconds of the transaction */
  Long createDate = null

  /* The code of the currency for the transaction */
  String currencyCode = null

  /* The specific details of the transaction, such as a message from the admin that created it */
  String details = null

  /* The id of the transaction */
  Integer id = null

  /* The id of the invoice that spawned the transaction, if any */
  Integer invoiceId = null

  /* Whether the transaction has been refunded */
  Boolean isRefunded = null

  /* The response */
  String response = null

  /* The root source of the transaction */
  String source = null

  /* If the transaction was successful */
  Boolean successful = null

  /* The payment gateway (external) transaction ID */
  String transactionId = null

  /* The general type of the transaction */
  String type = null

  /* The table name of the subclass */
  String typeHint = null

  /* The amount of the transaction, positive if a gain, negative if an expenditure */
  Double value = null
  

}

