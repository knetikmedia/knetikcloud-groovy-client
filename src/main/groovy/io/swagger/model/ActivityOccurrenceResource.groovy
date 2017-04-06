package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityEntitlementResource;
import io.swagger.model.ActivityUserResource;
import io.swagger.model.ArrayList;
import io.swagger.model.SelectedSettingResource;
import java.util.List;
@Canonical
class ActivityOccurrenceResource {

  /* The id of the activity */
  Long activityId = null

  /* The id of the challenge activity (as part of the event, required if eventId set) */
  Long challengeActivityId = null

  /* The date this occurrence was created, unix timestamp in seconds */
  Long createdDate = null

  /* The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity */
  ActivityEntitlementResource entitlement = null

  /* The id of the event */
  Long eventId = null

  /* The id of the activity occurrence */
  Long id = null

  /* Indicate if the rewards have been given out already */
  String rewardStatus = null

  /* The list of settings and their options available for this activity. Should be null on create if and only if part of an event. Otherwise, the set must exactly match those of the activity. */
  List<SelectedSettingResource> settings = new ArrayList<SelectedSettingResource>()

  /* Whether this occurrence will be played as a simulation. */
  Boolean simulated = null

  /* The date this occurrence was started, unix timestamp in seconds. null if not yet started */
  Long startDate = null

  /* The current status of the occurrence (default: OPEN) */
  String status = null

  /* The date this occurrence was last updated, unix timestamp in seconds */
  Long updatedDate = null

  /* The list of users playing in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission */
  List<ActivityUserResource> users = new ArrayList<ActivityUserResource>()
  

}

