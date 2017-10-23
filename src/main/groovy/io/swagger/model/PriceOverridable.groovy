package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
import io.swagger.model.BigDecimal;
@Canonical
class PriceOverridable {

  /* The maximum price allowed */
  BigDecimal maxPrice = null

  /* The minimum price allowed */
  BigDecimal minPrice = null
  

}

