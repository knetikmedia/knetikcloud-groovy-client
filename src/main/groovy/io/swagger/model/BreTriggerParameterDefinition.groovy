package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BreTriggerParameterDefinition {

  /* The name of the parameter. This is used as the unique identifier of this parameter */
  String name = null

  /* The variable type of this parameter. See Bre Variables endpoint for list */
  String type = null
  

}

