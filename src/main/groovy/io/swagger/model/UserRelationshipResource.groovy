package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class UserRelationshipResource {

  /* The child in the relationship */
  SimpleUserResource child = null

  /* Context about the relationship or its type */
  String context = null

  /* A generated unique id. Read-Only */
  Long id = null

  /* The parent in the relationship */
  SimpleUserResource parent = null
  

}

