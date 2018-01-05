package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class PropertyDefinitionResource {

  /* The description of the property */
  String description = null

  /* A list of the fields on both the property definition and property of this type */
  PropertyFieldListResource fieldList = null

  /* The friendly front-facing name of the property */
  String friendlyName = null

  /* The name of the property */
  String name = null

  /* The JSON path to the option label */
  String optionLabelPath = null

  /* The JSON path to the option value */
  String optionValuePath = null

  /* URL of service containing the property options (assumed JSON array) */
  String optionsUrl = null

  /* Whether the property is required */
  Boolean required = null

  /* The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties. */
  String type = null
  

}

