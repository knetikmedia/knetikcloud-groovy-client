package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class RefundResource {

  /* The amount refunded */
  Double amount = null

  /* The id of the refund transaction */
  Integer refundTransactionId = null

  /* The id of the original transaction */
  Integer transactionId = null
  

}

