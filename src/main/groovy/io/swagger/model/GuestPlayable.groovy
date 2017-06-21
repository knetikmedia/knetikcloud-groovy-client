package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class GuestPlayable {

  /* Whether guests are allowed to use items */
  Boolean allowed = null

  /* Whether guests are allowed on the leaderboard */
  Boolean leaderboard = null
  

}

