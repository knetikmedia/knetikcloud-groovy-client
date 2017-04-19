package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PropertyFieldResource;
import java.util.List;
@Canonical
class PropertyFieldResource {

  /* A description of the field */
  String description = null

  /* The type of values within a 'list' type field */
  String innerType = null

  /* A description of fields within objects within a 'list' type field, when inner_type is 'object' */
  List<PropertyFieldResource> innerTypeFields = new ArrayList<PropertyFieldResource>()

  /* The name of the field */
  String name = null

  /* Whether the field is required */
  Boolean required = null

  /* The type of the field */
  String type = null

  /* A list of valid values for 'enum' type fields */
  List<String> validValues = new ArrayList<String>()
  

}

