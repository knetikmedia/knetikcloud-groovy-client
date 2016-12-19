package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentMethodTypeResource;
@Canonical
class PaymentMethodResource {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

    Boolean _default = null

  /* Whether this payment method is disabled or not */
  Boolean disabled = null

  /* The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods */
  Long expirationDate = null

  /* The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods */
  Integer expirationMonth = null

  /* The expiration year for the payment method. Typically used for credit card payment methods */
  Integer expirationYear = null

  /* The unique ID for that resource */
  Long id = null

  /* The last 4 digits of the account number for the payment method. Typically used for credit card payment methods */
  String last4 = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The type of payment method. Must be a pre-existing value */
  PaymentMethodTypeResource paymentMethodType = null

  /* The generic payment type. Default is card */
  String paymentType = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* The sort value for the payment method */
  Integer sort = null

  /* The unique token for the payment method */
  String token = null

  /* An optional unique identifier */
  String uniqueKey = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null

  /* The user's id. If null, indicates a shared payment method that any user can use (i.e., 'wallet') */
  Integer userId = null

    Boolean verified = null
  

}

