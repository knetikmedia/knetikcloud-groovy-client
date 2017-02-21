package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BundledSku {

  /* The amount this item will cost inside the bundle instead of its regular price */
  Double priceOverride = null

  /* The quantity of this item within the bundle */
  Integer quantity = null

  /* The stock keeping unit (SKU) for an item included in the bundle */
  String sku = null
  

}

