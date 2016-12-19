package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PropertyDefinitionResource {

  /* The name of the property */
  String name = null

  /* Whether the property is required */
  Boolean required = null

  /* The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. */
  String type = null
  

}

