package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FinalizeBillingAgreementRequest {

  /* The ID of the invoice being paid along with the creation of this agreement */
  Integer invoiceId = null

  /* Whether the new payment method created should be the user's default */
  Boolean newDefault = null

  /* The payer ID from PayPal (passed as a parameter in the return URL). Only required if an invoice ID was included */
  String payerId = null

  /* The token from PayPal (passed as a parameter in the return URL) */
  String token = null

  /* The ID of the user. Defaults to the logged in user */
  Integer userId = null
  

}

