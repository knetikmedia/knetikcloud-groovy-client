package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class PriceOverridable {

  /* The maximum price allowed */
  Integer maxPrice = null

  /* The minimum price allowed */
  Integer minPrice = null
  

}

