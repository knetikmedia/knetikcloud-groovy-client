package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CoreActivityOccurrenceSettings;
import io.swagger.model.ItemIdRequest;
import io.swagger.model.Participant;
import io.swagger.model.SelectedSettingRequest;
import java.util.List;
@Canonical
class CreateActivityOccurrenceRequest {

  /* The id of the activity, only needed when outside of challenge/event */
  Long activityId = null

  /* The id of the challenge activity (required if playing in a challenge/event). Note that this is the challenge_activity_id in case the same activity apears twice in the challenge. */
  Long challengeActivityId = null

  /* Defines core settings about the activity that affect how it can be created/played by users. */
  CoreActivityOccurrenceSettings coreSettings = null

  /* The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity */
  ItemIdRequest entitlement = null

  /* The id of the event this occurence is a part of, if any */
  Long eventId = null

  /* The host of the occurrence, if not a participant (will be left out of users array). Must be the caller that creates the occurrence unless admin. Requires activity/challenge to allow host_option of 'non_player' if not admin as well */
  Integer host = null

  /* The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity. */
  List<SelectedSettingRequest> settings = new ArrayList<SelectedSettingRequest>()

  /* Whether this occurrence will be ran as a simulation. Simulations will not be rewarded. Useful for bot play or trials */
  Boolean simulated = null

  /* The current status of the occurrence (default: SETUP). */
  String status = null

  /* The list of users participating in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission */
  List<Participant> users = new ArrayList<Participant>()
  

}

