package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class ListPropertyDefinitionResource {

  /* If provided, the maximum number of files in the group */
  Integer maxCount = null

  /* If provided, the minimum number of files in the group */
  Integer minCount = null

  /* If provided, a property definition for validating values within list */
  PropertyDefinitionResource valueDefinition = null
  

}

