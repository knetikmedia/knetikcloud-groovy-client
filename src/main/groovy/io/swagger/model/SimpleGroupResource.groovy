package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SimpleGroupResource {

  /* The name of the group. Max 50 characters */
  String name = null

  /* Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created. Default: random UUID */
  String uniqueName = null
  

}

