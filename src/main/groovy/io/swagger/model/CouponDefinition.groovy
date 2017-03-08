package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class CouponDefinition {

  /* A unique identifier for the discount. Can be used to remove the discount, and uniqueness within the cart will be enforced. */
  String code = null

  /* A description for the discount. */
  String description = null

  /* The type of discount in terms of how it deducts price. */
  String discountType = null

  /* Whether this discount is exclusive and cannot be used in conjunction with other discounts/coupons. default=false */
  Boolean exclusive = null

  /* For coupon_cart, a minimum total price that the cart must meet to be valid. */
  Double maxDiscount = null

  /* The maximum number of items to count this discount for (not for cart_coupon). */
  Integer maxQuantity = null

  /* For coupon_cart, a minimum total price that the cart must meet to be valid. */
  Double minCartTotal = null

  /* A name for the discount. */
  String name = null

  /* Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false */
  Boolean selfExclusive = null

  /* The id of the item this discount applies to, which must be present in the cart. Applies if coupon_type_hint is coupon_single_item or coupon_voucher. */
  Integer targetItemId = null

  /* The type of discount in terms of what it applies to. coupon_cart applies to the cart as a whole, other types apply to specific items based on different criteria. */
  String type = null

  /* Which tags this applies for (item must have at least one of them), if coupon_type is coupon_tag. */
  List<String> validForTags = new ArrayList<String>()

  /* The amount of the discount. If discount_type is value then this is the raw currency amount to remove. If discount_type is percentage then this will be multiplied by the cart total or item price to get the discount amount (0.5 is half price). */
  Double value = null

  /* Which vendor this applies for, if coupon_type is coupon_vendor. */
  Integer vendorId = null
  

}

