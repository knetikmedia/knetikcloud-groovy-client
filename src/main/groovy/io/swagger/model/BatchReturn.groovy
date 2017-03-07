package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BatchReturn {

  /* The result body */
  Object body = null

  /* The HTTP response code */
  Integer code = null

  /* Full URI of REST call */
  String uri = null
  

}

