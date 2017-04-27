package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.LeaderboardEntryResource;
import java.util.List;
@Canonical
class LeaderboardResource {

  /* The paginated list of user results, in order from best to worst */
  List<LeaderboardEntryResource> entries = new ArrayList<LeaderboardEntryResource>()

  /* The id of the leaderboard */
  Long id = null

  /* The name of the strategy that defines how entries are stored and compared */
  String strategy = null
  

}

