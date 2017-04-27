package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.User;
@Canonical
class UserRelationship {

    User child = null

    String context = null

    Long id = null

    User parent = null
  

}

