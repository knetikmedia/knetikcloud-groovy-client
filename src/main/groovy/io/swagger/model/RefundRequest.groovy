package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class RefundRequest {

  /* The amount to refund. If left off, will refund the remaining balance of the transaction or specific item balance (if SKU provided), whichever is less. */
  Double amount = null

  /* Notes about or reason for the refund */
  String notes = null

  /* The SKU of a specific item from the invoice to refund. Affects the maximum refund amount (not to exceed the price of this item times quantity on invoice). Transaction must be tied to an invoice if used. */
  String sku = null
  

}

