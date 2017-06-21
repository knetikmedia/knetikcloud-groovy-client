package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class TimePeriodUsable {

  /* The amount of times it can be used */
  Integer maxUse = null

  /* The length of time */
  Integer timeLength = null

  /* The unit of time */
  String unitOfTime = null
  

}

