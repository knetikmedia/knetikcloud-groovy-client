package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.UserAchievementResource;
import java.util.List;
@Canonical
class UserAchievementGroupResource {

  /* The list of achievements associated with the group */
  List<UserAchievementResource> achievements = new ArrayList<UserAchievementResource>()

  /* The name of the group.  If used by Leveling, this will represent the level name */
  String groupName = null

  /* The id of the achievement progress */
  String id = null

  /* The current progress of the user on the group */
  Integer progress = null

  /* The id of the user whose progress is being tracked */
  Integer userId = null
  

}

