package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import io.swagger.model.StoreItem;
import java.util.List;
@Canonical
class CouponItem {

  /* The type of coupon */
  String couponTypeHint = null

  /* The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart */
  Double discountMax = null

  /* The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart */
  Double discountMinCartValue = null

  /* The type of discount in terms of how it deducts price. Value based discount not available for coupon_cart type coupons */
  String discountType = null

  /* The amount the coupon will discount the item. If discount_type is 'value' this will be a flat amount of currency. If discount type is 'percentage' this will be a fraction (0.2 for 20% off) multiplied by the price of the matching item or items. */
  Double discountValue = null

  /* Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default = false */
  Boolean exclusive = null

  /* The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher */
  Integer itemId = null

  /* The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher */
  Integer maxQuantity = null

  /* Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false */
  Boolean selfExclusive = null

  /* A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag */
  List<String> validForTags = new ArrayList<String>()
  

}

