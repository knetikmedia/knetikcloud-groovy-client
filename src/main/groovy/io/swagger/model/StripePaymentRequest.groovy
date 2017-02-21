package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StripePaymentRequest {

  /* The id of the invoice to pay */
  Integer invoiceId = null

  /* A token from Stripe to identify payment info to be tied to the customer */
  String token = null
  

}

