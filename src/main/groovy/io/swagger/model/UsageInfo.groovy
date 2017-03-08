package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UsageInfo {

  /* The number of requests within the range */
  Long count = null

  /* The date at the start of the range (see granularity) */
  Long date = null

  /* The http method */
  String method = null

  /* The url path */
  String url = null
  

}

