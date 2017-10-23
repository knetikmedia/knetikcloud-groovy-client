package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class VariableTypeResource {

  /* The base class of the type */
  String base = null

  /* Whether the type comes from a set of valid values that the system can provided (such as users) */
  Boolean enumerable = null

  /* The name of the variable type. Used as the unique id */
  String name = null
  

}

