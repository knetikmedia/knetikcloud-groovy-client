package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Property;
@Canonical
class AnswerResource {

  /* The answer to the question. Different 'type' values indicate different structures as the answer may be test, image, etc. See information on additional properties for the list and their structures */
  Property answer = null

  /* Whether the answer is correct or not */
  Boolean correct = null

  /* The unique ID for that resource */
  String id = null
  

}

