package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CartItemRequest {

  /* The affiliate key of the item */
  String affiliateKey = null

  /* The catalog SKU of the item */
  String catalogSku = null

  /* Allows to override the price of an item, if the behavior configuration permits it */
  Double priceOverride = null

  /* The quantity of the item */
  Integer quantity = null
  

}

