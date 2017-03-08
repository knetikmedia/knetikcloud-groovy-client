package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import java.util.List;
@Canonical
class ShippingItem {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* A category for filtering items */
  String category = null

  /* A unique list of country iso3 codes that allow the shipping option */
  List<String> countries = new ArrayList<String>()

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* Whether or not the item is currently displayable.  Default = true */
  Boolean displayable = null

  /* A list of country ID to include in the blacklist/whitelist geo policy */
  List<String> geoCountryList = new ArrayList<String>()

  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  String geoPolicyType = null

  /* The id of the item */
  Integer id = null

  /* A long description of the item */
  String longDescription = null

  /* An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled */
  Integer maxTierTotal = null

  /* The name of the item */
  String name = null

  /* Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0 */
  Integer shippingTier = null

  /* A short description of the item, max 255 chars */
  String shortDescription = null

  /* The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart */
  List<Sku> skus = new ArrayList<Sku>()

  /* A number to use in sorting items.  Default 500 */
  Integer sort = null

  /* The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store */
  Long storeEnd = null

  /* The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately */
  Long storeStart = null

  /* List of tags used for filtering items */
  List<String> tags = new ArrayList<String>()

  /* Whether tax should be applied to the shipping price.  Default = false */
  Boolean taxable = null

  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  String template = null

  /* The type of the item */
  String typeHint = null

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated, unix timestamp in seconds */
  Long updatedDate = null

  /* The vendor who provides the item */
  Integer vendorId = null
  

}

