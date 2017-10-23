package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BigDecimal;
import io.swagger.model.Discount;
import java.util.List;
@Canonical
class CartLineItem {

    String currencyCode = null

    String description = null

    Discount discount = null

    BigDecimal lineTotal = null

    String name = null

    BigDecimal originalLineTotal = null

    BigDecimal originalUnitPrice = null

    Integer qty = null

    String saleName = null

    String sku = null

    String skuDescription = null

    Integer storeItemId = null

    List<String> tags = new ArrayList<String>()

    String thumbUrl = null

    String uniqueKey = null

    BigDecimal unitPrice = null

    Integer vendorId = null

    String vendorName = null
  

}

