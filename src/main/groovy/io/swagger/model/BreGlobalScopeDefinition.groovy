package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BreGlobalScopeDefinition {

  /* The name of the scoping parameter. This is used as the unique identifier of this scope */
  String name = null

  /* The variable type of this scoping parameter. See Bre Variables endpoint for list */
  String type = null
  

}

