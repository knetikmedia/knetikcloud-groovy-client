package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleReferenceResourcelong;
@Canonical
class VideoRelationshipResource {

  /* The owner of the relationship */
  SimpleReferenceResourcelong from = null

  /* The id of the relationship */
  Long id = null

  /* Details about the relationship such as type or other information. Max length 10 characters */
  String relationshipDetails = null

  /* The target of the relationship. */
  SimpleReferenceResourcelong to = null
  

}

