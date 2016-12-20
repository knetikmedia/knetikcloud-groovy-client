package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PollAnswerResource {

  /* The number of uesrs that selected this answer */
  Integer count = null

  /* The key to the answer (for code reference) */
  String key = null

  /* The text of the answer (for user display) */
  String text = null
  

}

