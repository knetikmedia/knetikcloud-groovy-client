package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class InvoiceItemResource {

    String bundleSku = null

    String currentFulfillmentStatus = null

    Integer id = null

    Integer invoiceId = null

    Integer itemId = null

    String itemName = null

    BigDecimal originalTotalPrice = null

    BigDecimal originalUnitPrice = null

    Integer qty = null

    String saleName = null

    String sku = null

    String skuDescription = null

    BigDecimal systemPrice = null

    BigDecimal totalPrice = null

    String typeHint = null

    BigDecimal unitPrice = null
  

}

