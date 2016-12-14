package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UserAchievementResource {

  /* Flag indicating whether the user has earned the achievement */
  Boolean achieved = null

  /* The achievement being tracked */
  String achievementName = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The date/time the achievement was earned as a unix timestamp in seconds */
  Long earnedDate = null

  /* The id of the achievement progress */
  String id = null

  /* The current progress of the user on the achievement */
  Integer progress = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null

  /* The id of the user whose progress is being tracked */
  Integer userId = null
  

}

