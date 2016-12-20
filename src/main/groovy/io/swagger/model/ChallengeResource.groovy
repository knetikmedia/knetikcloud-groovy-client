package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.RewardSetResource;
import io.swagger.model.Schedule;
import java.util.List;
@Canonical
class ChallengeResource {

  /* The number of activities allowed to this challenge */
  Integer activities = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The id of the campaign this challenge is a part of. The challenge must be tied to an active campaign before it will spawn events */
  Long campaignId = null

  /* The ID of the original challenge it was copied from */
  Long copyOf = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The end date of this challenge in seconds since epoch. required if part of a campaign */
  Long endDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service. */
  String leaderboardStrategy = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The next date this challenge will be occur in seconds since epoch */
  Long nextEventDate = null

  /* The number of minutes minimum to wait at the end of this challenge before running rewards, to allow activities to complete */
  Integer rewardLagMinutes = null

  /* The rewards to give at the end of the challenge. When creating/updating only id is used. Reward set must be pre-existing */
  RewardSetResource rewardSet = null

  /* The repeat schedule for the challenge */
  Schedule schedule = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* The start date of this challenge in seconds since epoch. required if part of a campaign */
  Long startDate = null

  /* A challenge template this challenge is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

