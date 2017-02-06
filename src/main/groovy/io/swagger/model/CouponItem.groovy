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
class CouponItem {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* A category for filtering items */
  String category = null

  /* The type of coupon */
  String couponTypeHint = null

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart */
  Double discountMax = null

  /* The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart */
  Double discountMinCartValue = null

  /* The type of coupon discount */
  String discountType = null

  /* The amount the coupon will discount the item */
  Double discountValue = null

  /* Whether or not the item is currently displayable.  Default = true */
  Boolean displayable = null

  /* Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default = false */
  Boolean exclusive = null

  /* A list of country ID to include in the blacklist/whitelist geo policy */
  List<String> geoCountryList = new ArrayList<String>()

  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  String geoPolicyType = null

  /* The id of the item */
  Integer id = null

  /* The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher */
  Integer itemId = null

  /* A long description of the item */
  String longDescription = null

  /* The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher */
  Integer maxQuantity = null

  /* The name of the item */
  String name = null

  /* Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false */
  Boolean selfExclusive = null

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

  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  String template = null

  /* The type of the item */
  String typeHint = null

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated, unix timestamp in seconds */
  Long updatedDate = null

  /* A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag */
  List<String> validForTags = new ArrayList<String>()

  /* The vendor who provides the item */
  Integer vendorId = null
  

}

