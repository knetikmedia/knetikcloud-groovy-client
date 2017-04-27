package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class OptimalPaymentRequest {

  /* The email address of the user */
  String email = null

  /* The first name of the user */
  String firstName = null

  /* The id of the invoice to pay */
  Integer invoiceId = null

  /* The last name of the user */
  String lastName = null

  /* The url to redirect the user to after declining payment */
  String onDecline = null

  /* The url to redirect the user to after an error in payment */
  String onError = null

  /* The url to redirect the user to after successful payment */
  String onSuccess = null
  

}

