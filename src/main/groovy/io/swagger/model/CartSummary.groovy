package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class CartSummary {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The unique id code for the currency used in the cart */
  String currencyCode = null

  /* The grand total for the cart */
  BigDecimal grandTotal = null

  /* The unique ID for the cart */
  String id = null

  /* The ID of the invoice associated with this cart */
  BigDecimal invoiceId = null

  /* The number of items in the cart */
  Integer itemsInCart = null

  /* The status of the cart */
  String status = null

  /* The subtotal of all items in the cart */
  BigDecimal subtotal = null
  

}

