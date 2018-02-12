package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityEntitlementResource;
import io.swagger.model.ArrayList;
import io.swagger.model.AvailableSettingResource;
import io.swagger.model.CoreActivitySettings;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.RewardSetResource;
import java.util.List;
@Canonical
class ActivityResource {

  /* A map of additional properties keyed on the property name. Used to further describe an activity. While settings will vary from one activity occurrence (a game) to another, additional properties are shared by all the occurrences of this activity. Ex: Activity Logo, Disclaimer, Greeting, etc. Validated against template if one exists for activities */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* Defines core settings about the activity that affect how it can be created/played by users. */
  CoreActivitySettings coreSettings = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The list of items that can be used for entitlement (wager amounts/etc) */
  List<ActivityEntitlementResource> entitlements = new ArrayList<ActivityEntitlementResource>()

  /* The unique ID for that resource */
  Long id = null

  /* Details about how to launch the activity */
  String launch = null

  /* The strategy for calculating the leaderboard. No strategy means no leaderboard for the top level context. Value MUST come from the list of available strategies from the Leaderboard Service */
  String leaderboardStrategy = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing */
  RewardSetResource rewardSet = null

  /* Define what parameters are required/available to start and run an activity. For example: Difficulty, Number of Questions, Character name, Avatar, Duration, etc. Not populated when getting listing */
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

