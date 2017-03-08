package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Group;
import io.swagger.model.User;
@Canonical
class GroupMember {

    Group group = null

    Boolean secondary = null

    String status = null

    User user = null
  

}

