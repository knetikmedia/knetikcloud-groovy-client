package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Config {

  /* The name of the config */
  String name = null

  /* Whether the config is public for viewing. True means that it can be publicly viewed by all. Default: false */
  Boolean publicRead = null

  /* The value of the config */
  String value = null
  

}

