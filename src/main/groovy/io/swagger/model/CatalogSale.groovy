package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CatalogSale {

  /* The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply */
  String currencyCode = null

  /* The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%) */
  String discountType = null

  /* The amount deducted from the price, in the same currencyCode as the item */
  Double discountValue = null

  /* The id of the sale */
  Integer id = null

  /* The id of the item this sale applies to.  Leave null to use other filters */
  Integer item = null

  /* The long description of the sale */
  String longDescription = null

  /* The name of the sale.  Max 40 characters */
  String name = null

  /* The date the sale ends, null for never.  Unix timestamp in seconds */
  Long saleEndDate = null

  /* The date the sale begins.  Unix timestamp in seconds */
  Long saleStartDate = null

  /* The short description of the sale.  Max 140 characters */
  String shortDescription = null

  /* The tag this sale applies to.  Leave null to skip this filter (applies to all tags) */
  String tag = null

  /* The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors) */
  Integer vendor = null
  

}

