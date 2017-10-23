package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class LeaderboardEntryResource {

  /* The position of the user in the leaderboard. Null means non-compete or disqualification */
  Long rank = null

  /* The raw score in this leaderboard. Null means non-compete or disqualification */
  Long score = null

  /* The date this score was recorded or updated. Unix timestamp in seconds */
  Long updatedDate = null

  /* The player for this entry */
  SimpleUserResource user = null
  

}

