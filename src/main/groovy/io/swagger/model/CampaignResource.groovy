package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.RewardSetResource;
import java.util.List;
@Canonical
class CampaignResource {

  /* Whether the campaign is active or not.  Defaults to false */
  Boolean active = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service */
  String leaderboardStrategy = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The name of the next challenge coming up */
  String nextChallenge = null

  /* The date/time of the next challenge coming up */
  Long nextChallengeDate = null

  /* The rewards to give at the end of the campaign. When creating/updating only id is used. Reward set must be pre-existing */
  RewardSetResource rewardSet = null

  /* Indicate if the rewards have been given out already */
  String rewardStatus = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* A campaign template this campaign is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

