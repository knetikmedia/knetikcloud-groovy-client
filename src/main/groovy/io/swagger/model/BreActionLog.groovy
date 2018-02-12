package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BreActionLog {

  /* The name of the action */
  String name = null

  /* The runtime of the action in milliseconds */
  Long runtime = null

  /* The status of the action (ran, failed) */
  String status = null
  

}

