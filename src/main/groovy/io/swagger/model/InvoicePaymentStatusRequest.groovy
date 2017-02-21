package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class InvoicePaymentStatusRequest {

  /* If included, will set the payment method used on the invoice */
  Integer paymentMethodId = null

  /* The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund' */
  String status = null
  

}

