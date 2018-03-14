package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ForwardLog {

  /* The end date of the forward log entry */
  Long endDate = null

    String errorMsg = null

    String eventId = null

    String headers = null

  /* The http status code the forward log entry */
  Integer httpStatusCode = null

  /* The id of the forward log entry */
  String id = null

    String method = null

  /* The payload of the forward log entry */
  Object payload = null

  /* The response string of the forward log entry */
  String response = null

  /* The retry count of the forward log entry */
  Integer retryCount = null

    Boolean retryable = null

    String ruleId = null

  /* The start date of the forward log entry */
  Long startDate = null

    Boolean success = null

  /* The endpoint url of the forward log entry */
  String url = null
  

}

