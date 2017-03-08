package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UserAchievementResource {

  /* Flag indicating whether the user has earned the achievement */
  Boolean achieved = null

  /* The achievement being tracked.  If used for Leveling, this represents the tier name */
  String achievementName = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The date/time the achievement was earned as a unix timestamp in seconds */
  Long earnedDate = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

