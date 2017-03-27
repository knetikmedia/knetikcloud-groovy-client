package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.PropertyDefinitionResource;
import java.util.List;
@Canonical
class BehaviorDefinitionResource {

  /* Description of the behavior */
  String description = null

  /* Pre-requisite behaviors that an item must have in order to also have this behavior */
  List<Behavior> prerequisiteBehaviors = new ArrayList<Behavior>()

  /* Configurable properties of the behavior */
  List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>()

  /* The behavior type */
  String typeHint = null
  

}

