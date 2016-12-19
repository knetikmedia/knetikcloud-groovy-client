package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CartSummary {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The unique id code for the currency used in the cart */
  String currencyCode = null

  /* The grand total for the cart */
  Double grandTotal = null

  /* The unique ID for the cart */
  String id = null

  /* The ID of the invoice associated with this cart */
  Double invoiceId = null

  /* The number of items in the cart */
  Integer itemsInCart = null

  /* The status of the cart */
  String status = null

  /* The subtotal of all items in the cart */
  Double subtotal = null
  

}

