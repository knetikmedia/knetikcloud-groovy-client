package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Result;
@Canonical
class BatchReturn {

  /* The result body */
  Result body = null

  /* The HTTP response code */
  Integer code = null

  /* Full URI of REST call */
  String uri = null
  

}

