package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class UserLevelingResource {

  /* The name of the last tier the user has qualified for */
  String lastTierName = null

  /* The progress level of the last tier the user has qualified for */
  Integer lastTierProgress = null

  /* The name of the level schema */
  String levelName = null

  /* The name of the next tier the user can qualify for */
  String nextTierName = null

  /* The progress needed to qualify for the next tier */
  Integer nextTierProgress = null

  /* The amount of progress the user has */
  Integer progress = null

  /* The names of the tiers the user has qualified for */
  List<String> tierNames = new ArrayList<String>()

  /* The ID of the user */
  Integer userId = null
  

}

