package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PropertyFieldResource;
import java.util.List;
@Canonical
class PropertyFieldListResource {

  /* A list of fields for the property definition. */
  List<PropertyFieldResource> propertyDefinitionFields = new ArrayList<PropertyFieldResource>()

  /* A list of fields for the property. */
  List<PropertyFieldResource> propertyFields = new ArrayList<PropertyFieldResource>()

  /* The type for the property this describes. */
  String propertyType = null
  

}

