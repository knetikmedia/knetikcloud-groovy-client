package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StripeCreatePaymentMethod {

  /* A token from Stripe to identify payment info to be tied to the customer */
  String token = null

  /* The id of the user, if null the logged in user is used. Admin privilege need to specify other users */
  Integer userId = null
  

}

