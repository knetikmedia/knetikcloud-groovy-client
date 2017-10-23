package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class MetricResource {

  /* The id of the activity occurence where this score/metric occurred */
  Long activityOccurenceId = null

  /* Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each */
  List<String> tags = new ArrayList<String>()

  /* The id of the user this metric is for. Default to caller and requires METRICS_ADMIN permission to specify another */
  Integer userId = null

  /* The value/score of the metric */
  Long value = null
  

}

