package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ApplyPaymentRequest {

  /* The id of the local invoice being paid. */
  Integer invoiceId = null

  /* The encoded receipt string from Apple's services. */
  String receipt = null

  /* The id of the specific transaction from Apple's services. */
  String transactionId = null
  

}

