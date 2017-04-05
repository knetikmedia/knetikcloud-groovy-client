package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CartShippableResponse {

  /* The id of the cart */
  Integer cartId = null

  /* Whether the item is shippable */
  Boolean shippable = null
  

}

