package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FinalizePayPalPaymentRequest {

  /* The ID of the invoice that is being paid. Must match the invoice sent in originally */
  Integer invoiceId = null

  /* The ID of the payer that PayPal returned with the user at the return URL */
  String payerId = null

  /* The token that PayPal returned with the user in the return URL */
  String token = null
  

}

