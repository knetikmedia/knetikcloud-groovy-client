package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivityOccurrenceJoinResult;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class ActivityOccurrenceCreationFailure {

  /* The details of each user's entry, or just the current user's if not run with ACTIVITIES_ADMIN permission */
  List<ActivityOccurrenceJoinResult> userResults = new ArrayList<ActivityOccurrenceJoinResult>()
  

}

