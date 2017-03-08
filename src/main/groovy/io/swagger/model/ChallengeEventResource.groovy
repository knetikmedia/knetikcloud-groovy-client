package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ChallengeEventResource {

  /* The id of the challenge */
  Long challengeId = null

  /* The end date in seconds */
  Long endDate = null

  /* The id of the challenge event */
  Long id = null

  /* Indicate if the rewards have been given out already  */
  String rewardStatus = null

  /* The start date in seconds */
  Long startDate = null
  

}

