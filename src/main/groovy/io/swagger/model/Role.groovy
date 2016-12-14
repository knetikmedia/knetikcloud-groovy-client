package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Permission;
import java.util.List;
@Canonical
class Role {

    Integer clientCount = null

    Long createdDate = null

    Integer id = null

    Boolean locked = null

    String name = null

    String role = null

    List<Permission> rolePermission = new ArrayList<Permission>()

    Integer userCount = null
  

}

