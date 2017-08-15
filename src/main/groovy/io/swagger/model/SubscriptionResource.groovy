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

  /* A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type. */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* Who can purchase this subscription */
  String availability = null

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* A category for filtering items */
  String category = null

  /* The day of the month 1..31 this subscription will renew */
  Integer consolidationDayOfMonth = null

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* A list of country iso3 codes to include in the blacklist/whitelist geo policy */
  List<String> geoCountryList = new ArrayList<String>()

  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
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

  /* List of tags used for filtering items */
  List<String> tags = new ArrayList<String>()

  /* An item template this item is validated against. May be null and no validation of additional properties will be done. */
  String template = null

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated */
  Long updatedDate = null

  /* The vendor who provides the item */
  Integer vendorId = null
  

}

