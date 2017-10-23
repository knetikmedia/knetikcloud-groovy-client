package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class QuickBuyRequest {

  /* SKU of item being purchased */
  String sku = null

  /* ID of the user making the purchase. If null, currently logged in user will be used. */
  Integer userId = null
  

}

