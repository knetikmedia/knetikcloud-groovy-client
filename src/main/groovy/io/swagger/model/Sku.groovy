package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class Sku {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The currency code for the SKU, a three letter string (ISO3) */
  String currencyCode = null

  /* The description of the SKU (Ex: An item comes in multiple sizes/colors, each needing its own unique description) */
  String description = null

  /* The number of SKUs currently in stock */
  Integer inventory = null

  /* Alerts vendor when SKU inventory drops below this value */
  Integer minInventoryThreshold = null

  /* The base price before any sale */
  Double originalPrice = null

  /* The current price of the SKU with sales, if any. Set original_price for the base */
  Double price = null

  /* Whether or not the SKU is currently published */
  Boolean published = null

  /* The id of a sale affecting the price, if any */
  Integer saleId = null

  /* The name of a sale affecting the price, if any */
  String saleName = null

  /* The stock keeping unit (SKU), a unique identifier for a given product.  Max 40 characters */
  String sku = null

  /* The date the sku becomes available, unix timestamp in seconds.  If set to null, sku will become available immediately */
  Long startDate = null

  /* The date the sku becomes unavailable, unix timestamp in seconds.  If set to null, sku is always available */
  Long stopDate = null
  

}

