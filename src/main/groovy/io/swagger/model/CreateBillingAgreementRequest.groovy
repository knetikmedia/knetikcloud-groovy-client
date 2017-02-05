package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CreateBillingAgreementRequest {

  /* The endpoint URL to which PayPal should forward the user if they cancel (do not accept) the agreement */
  String cancelUrl = null

  /* The endpoint URL to which PayPal should forward the user after they accept the agreement. This endpoint will receive information needed for the next step */
  String returnUrl = null

  /* The ID of the user. Defaults to the logged in user */
  Integer userId = null
  

}

