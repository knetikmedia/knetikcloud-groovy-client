package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityEntitlementResource;
import io.swagger.model.ArrayList;
import io.swagger.model.CoreChallengeActivitySettings;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.RewardSetResource;
import io.swagger.model.SelectedSettingResource;
import java.util.List;
@Canonical
class ChallengeActivityResource {

  /* The id of the activity */
  Long activityId = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The id of the challenge */
  Long challengeId = null

  /* Defines core settings about the activity that affect how it can be created/played by users. Values may be left null to inherit from parent activity. */
  CoreChallengeActivitySettings coreSettings = null

  /* The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing */
  ActivityEntitlementResource entitlement = null

  /* The unique ID for this resource */
  Long id = null

  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  RewardSetResource rewardSet = null

  /* The list of settings and the select options */
  List<SelectedSettingResource> settings = new ArrayList<SelectedSettingResource>()

  /* A challenge activity template this challenge activity is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null
  

}

