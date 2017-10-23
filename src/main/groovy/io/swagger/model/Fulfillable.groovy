package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class Fulfillable {

  /* The name of the fulfillment type that describes how the item should be fulfilled.  Examples: inventory, wallet, amazon */
  String typeName = null
  

}

