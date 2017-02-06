package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class ItemBehaviorDefinitionResource {

  /* The default version of the behavior */
  Behavior behavior = null

  /* Whether the behavior's values can be modified */
  Boolean modifiable = null

  /* Whether the behavior can be removed */
  Boolean required = null
  

}

