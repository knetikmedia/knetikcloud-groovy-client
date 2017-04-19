package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityEntitlementResource;
import io.swagger.model.ArrayList;
import io.swagger.model.AvailableSettingResource;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.RewardSetResource;
import java.util.List;
@Canonical
class ActivityResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The list of items that can be used for entitlement (wager amounts/etc) */
  List<ActivityEntitlementResource> entitlements = new ArrayList<ActivityEntitlementResource>()

  /* The unique ID for that resource */
  Long id = null

  /* Details about how to launch the activity */
  String launch = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  RewardSetResource rewardSet = null

  /* The list of settings and their options available for this activity. Not populated when getting listing */
  List<AvailableSettingResource> settings = new ArrayList<AvailableSettingResource>()

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* Whether this activity is a template for other activities. Default: false */
  Boolean template = null

  /* An activity template this activity is validated against (private). May be null and no validation of additional_properties will be done */
  String templateId = null

  /* The type of the activity */
  String type = null

  /* The unique key (for static reference in code) of the activity */
  String uniqueKey = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

