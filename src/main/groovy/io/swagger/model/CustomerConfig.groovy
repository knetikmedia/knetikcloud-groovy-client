package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DatabaseConfig;
@Canonical
class CustomerConfig {

    String aliases = null

    DatabaseConfig database = null

    String name = null

    String uploadBucket = null
  

}

