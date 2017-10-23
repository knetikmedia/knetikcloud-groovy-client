package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DatabaseConfig;
import io.swagger.model.IOConfig;
import io.swagger.model.S3Config;
@Canonical
class CustomerConfig {

    String aliases = null

    DatabaseConfig database = null

    IOConfig io = null

    String name = null

    S3Config s3Config = null
  

}

