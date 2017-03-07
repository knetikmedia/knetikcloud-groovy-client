package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CreatePayPalPaymentRequest {

  /* The endpoint URL to which PayPal should forward the user to if they cancel the checkout process */
  String cancelUrl = null

  /* The ID of an invoice to pay */
  Integer invoiceId = null

  /* The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step */
  String returnUrl = null
  

}

