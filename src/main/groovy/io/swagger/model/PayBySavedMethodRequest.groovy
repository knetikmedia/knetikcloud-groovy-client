package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PayBySavedMethodRequest {

  /* The id of the payment method to use. Must belong to the caller, be public or have PAYMENTS_ADMIN permission */
  Integer paymentMethod = null
  

}

