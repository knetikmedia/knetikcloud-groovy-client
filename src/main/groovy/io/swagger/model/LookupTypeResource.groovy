package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LookupTypeResource {

  /* The description of the expression type */
  String description = null

  /* The variable type the key expression must be, or null if it's dependent (see description for explanation in this case) */
  String keyType = null

  /* The name of the expression type */
  String name = null

  /* The variable type of the value this expression returns, or null if it's dependent (see description for explanation in this case) */
  String valueType = null
  

}

