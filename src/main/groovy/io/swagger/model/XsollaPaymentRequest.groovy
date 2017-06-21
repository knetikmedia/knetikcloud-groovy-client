package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class XsollaPaymentRequest {

  /* The id of an invoice to pay */
  Integer invoiceId = null

  /* The endpoint URL xsolla should forward the user to after they pay */
  String returnUrl = null
  

}

