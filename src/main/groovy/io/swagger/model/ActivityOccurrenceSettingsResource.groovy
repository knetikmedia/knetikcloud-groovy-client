package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CoreActivityOccurrenceSettings;
import io.swagger.model.SelectedSettingRequest;
import java.util.List;
@Canonical
class ActivityOccurrenceSettingsResource {

  /* Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity. */
  CoreActivityOccurrenceSettings coreSettings = null

  /* The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity. */
  List<SelectedSettingRequest> settings = new ArrayList<SelectedSettingRequest>()
  

}

