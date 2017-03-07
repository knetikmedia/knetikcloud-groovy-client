package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class RewardItemResource {

  /* The id of the item to reward */
  Integer itemId = null

  /* The name of the item to reward (read only, set by id) */
  String itemName = null

  /* The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank */
  Integer maxRank = null

  /* The lowest number (best) rank to give the reward to. Must be greater than zero */
  Integer minRank = null

  /* How many copies to give */
  Integer quantity = null
  

}

