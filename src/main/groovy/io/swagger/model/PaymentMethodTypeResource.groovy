package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PaymentMethodTypeResource {

  /* The id of the payment method type */
  Integer id = null

  /* The maximum timelimit in hours for an invoice in the processing status while waiting on this payment method type. Defaults to the global config invoice.processing_expiration_hours if null */
  Integer invoiceProcessingHours = null

  /* The name of the payment method type */
  String name = null

  /* Whether the payment handler supports the authorize and capture flow */
  Boolean supportsCapture = null

  /* Whether the payment handler supports paying for part of an invoice, rather than the full grand_total */
  Boolean supportsPartial = null

  /* Whether the payment handler supports rebilling the method later (for saved payments or subscriptions) */
  Boolean supportsRebill = null

  /* Whether the payment handler supports refunding */
  Boolean supportsRefunds = null
  

}

