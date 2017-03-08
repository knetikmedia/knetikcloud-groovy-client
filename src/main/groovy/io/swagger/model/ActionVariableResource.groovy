package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ActionVariableResource {

  /* The name of the variable */
  String name = null

  /* Whether this variable is optional and can be left out/null */
  Boolean optional = null

  /* The type of the variable (see variable type endpoint for list) */
  String type = null
  

}

