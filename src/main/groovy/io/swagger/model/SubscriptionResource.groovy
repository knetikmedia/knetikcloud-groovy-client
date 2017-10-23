package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.SubscriptionPlanResource;
import java.util.List;
@Canonical
class SubscriptionResource {

  /* The additional properties for the subscription */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* Who can purchase this subscription */
  String availability = null

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* The category of the subscription */
  String category = null

  /* The day of the month 1..31 this subscription will renew */
  Integer consolidationDayOfMonth = null

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* Whether or not the item is currently visible to users. Does not block purchase; Use store_start or store_end to block purchase.  Default = true */
  Boolean displayable = null

  /* The geo country list for the subscription */
  List<String> geoCountryList = new ArrayList<String>()

  /* The geo policy type for the subscription */
  String geoPolicyType = null

  /* The id of the item */
  Integer id = null

  /* A long description of the subscription */
  String longDescription = null

  /* The name of the item */
  String name = null

  /* The billing options for this subscription */
  List<SubscriptionPlanResource> plans = new ArrayList<SubscriptionPlanResource>()

  /* A short description of the subscription.  Max 255 characters */
  String shortDescription = null

  /* A number to use in sorting items.  Default 500 */
  Integer sort = null

  /* Used to schedule removal from store.  Null means the subscription will never be removed */
  Long storeEnd = null

  /* Used to schedule appearance in store.  Null means the subscription will appear now */
  Long storeStart = null

  /* The tags for the subscription */
  List<String> tags = new ArrayList<String>()

  /* The template being used */
  String template = null

  /* The unique key of the subscription */
  String uniqueKey = null

  /* The date the item was last updated */
  Long updatedDate = null

  /* The id of the vendor */
  Integer vendorId = null
  

}

