package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AchievementProgressUpdateRequest {

  /* Whether to add one to the current progress instead of setting it to progress_value. Default: false */
  Boolean incrementValue = null

  /* The amount of progress towards earning the achievement. The max/target depends on the achievement. Required if increment_value is false/missing. */
  Integer progressValue = null
  

}

