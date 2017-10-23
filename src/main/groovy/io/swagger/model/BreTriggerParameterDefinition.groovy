package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BreTriggerParameterDefinition {

  /* Whether this parameter is implicitely derived from another. Internal use only. */
  Boolean implicit = null

  /* The name of the parameter. This is used as the unique identifier of this parameter */
  String name = null

  /* Whether this parameter can be left off when firing the event. Default false */
  Boolean optional = null

  /* The variable type of this parameter. See Bre Variables endpoint for list */
  String type = null
  

}

