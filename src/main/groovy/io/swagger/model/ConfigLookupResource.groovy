package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ExpressionResource;
@Canonical
class ConfigLookupResource {

    String definition = null

    ExpressionResource lookupKey = null

    String requiredKeyType = null

    String type = null

    String valueType = null
  

}

