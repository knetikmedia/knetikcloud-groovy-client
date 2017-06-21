package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Behavior;
@Canonical
class Spendable {

  /* The code of the currency */
  String currencyCode = null

  /* The spendable value */
  Integer value = null
  

}

