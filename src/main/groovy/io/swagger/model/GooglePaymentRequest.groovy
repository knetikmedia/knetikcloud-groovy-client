package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class GooglePaymentRequest {

  /* The json payload exactly as sent from Google */
  String jsonPayload = null

  /* The signature from Google to verify the payload */
  String signature = null
  

}

