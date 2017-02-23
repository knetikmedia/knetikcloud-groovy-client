package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Schedule {

  /* The duration of the repeatable events */
  Integer duration = null

  /* The unit of time for the duration field */
  String durationUnit = null

  /* How often the event is scheduled */
  String repeat = null
  

}

