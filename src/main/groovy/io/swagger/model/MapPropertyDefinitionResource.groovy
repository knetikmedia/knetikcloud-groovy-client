package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
import java.util.List;
@Canonical
class MapPropertyDefinitionResource {

  /* Whether to allow additional properties beyond those specified or not */
  Boolean allowAdditional = null

  /* If provided, a list of property definitions for each map entry */
  List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>()
  

}

