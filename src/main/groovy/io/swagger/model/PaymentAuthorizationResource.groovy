package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleReferenceResourceint;
@Canonical
class PaymentAuthorizationResource {

  /* Whether this authorization has been captured */
  Boolean captured = null

  /* The date this authorization was received, unix timestamp in seconds */
  Long created = null

  /* The details for this authorization. Format dependent on payment provider */
  Object details = null

  /* The id of the authorization */
  Integer id = null

  /* The invoice this authorization is intended to pay */
  Integer invoice = null

  /* The payment type (which provider) this payment is through */
  SimpleReferenceResourceint paymentType = null
  

}

