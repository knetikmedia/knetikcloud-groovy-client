package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class UserActivityResultsResource {

  /* The raw score. Null means non-compete or disqualification */
  Long score = null

  /* Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each */
  List<String> tags = new ArrayList<String>()

  /* The id of the player */
  Integer userId = null
  

}

