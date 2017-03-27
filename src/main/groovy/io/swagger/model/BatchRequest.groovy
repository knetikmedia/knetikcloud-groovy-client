package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BatchRequest {

  /* The request body as would be passed to the URI */
  Object body = null

  /* Content type used, Ex:(application/json) */
  String contentType = null

  /* The HTTP method used, Ex: (GET) */
  String method = null

  /* Time in seconds before process will timeout.  Default is 60.  Range is 1-300 */
  Integer timeout = null

  /* The oauth token only */
  String token = null

  /* Full URI of REST call */
  String uri = null
  

}

