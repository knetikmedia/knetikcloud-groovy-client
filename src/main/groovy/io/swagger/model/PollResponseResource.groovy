package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class PollResponseResource {

  /* The answer to the poll */
  String answer = null

  /* The date the poll was answered, in seconds since unix epoc */
  Long answeredDate = null

  /* The id of the poll response */
  String id = null

  /* The id of the poll */
  String pollId = null

  /* The user */
  SimpleUserResource user = null
  

}

