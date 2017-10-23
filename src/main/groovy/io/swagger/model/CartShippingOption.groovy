package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class CartShippingOption {

    String currencyCode = null

    String description = null

    String name = null

    BigDecimal originalPrice = null

    BigDecimal price = null

    Integer shippingItemId = null

    String sku = null

    Boolean taxable = null

    Integer vendorId = null

    String vendorName = null
  

}

