package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class StripePaymentRequest {

  /* The amount to pay, if not the full remaining balance (leave out to pay in full, but be careful no other partial payment has been started) */
  BigDecimal amount = null

  /* The id of the invoice to pay */
  Integer invoiceId = null

  /* A token from Stripe to identify payment info to be tied to the customer */
  String token = null
  

}

