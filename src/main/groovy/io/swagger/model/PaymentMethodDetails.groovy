package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PaymentMethodDetails {

    Boolean _default = null

  /* The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods */
  Long expirationDate = null

  /* The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods */
  Integer expirationMonth = null

  /* The expiration year for the payment method. Typically used for credit card payment methods */
  Integer expirationYear = null

  /* The last 4 digits of the account number for the payment method. Typically used for credit card payment methods */
  String last4 = null

  /* The sort value for the payment method */
  Integer sort = null

  /* An optional unique identifier */
  String uniqueKey = null

    Boolean verified = null
  

}

