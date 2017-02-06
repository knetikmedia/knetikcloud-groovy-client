package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Role;
import java.util.List;
@Canonical
class Permission {

    Long createdDate = null

    String description = null

    Integer id = null

    Boolean locked = null

    String name = null

    String parent = null

    String permission = null

    List<Role> permissionRole = new ArrayList<Role>()

    Long updatedDate = null
  

}

