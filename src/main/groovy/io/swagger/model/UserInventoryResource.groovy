package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class UserInventoryResource {

  /* A map of data for behaviors */
  Object behaviorData = null

  /* The date/time this resource was created in seconds since epoch */
  Long createdDate = null

  /* The date/time this resource exires in seconds since epoch. Null for no expiration. For subscriptions, this is the end of the 'grace period' if left unpaid */
  Long expires = null

  /* The id of the inventory */
  Integer id = null

  /* The id of the invoice that resulted in this inventory, if any */
  Integer invoiceId = null

  /* The id of the item */
  Integer itemId = null

  /* The name of the item */
  String itemName = null

  /* The type hint of the item */
  String itemTypeHint = null

  /* The status of the inventory. Pending inventory is not yet ready for use. Inactive inventory has expired or been used up */
  String status = null

  /* The date/time this resource was last updated in seconds since epoch */
  Long updatedDate = null

  /* The id of the user this inventory belongs to */
  SimpleUserResource user = null
  

}

