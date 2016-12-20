package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PermissionResource;
import java.util.List;
@Canonical
class RoleResource {

  /* The number of clients this role is assigned to */
  Integer clientCount = null

  /* The date the role was added. Unix timestamp in seconds */
  Long createdDate = null

  /* Whether a role is locked from being deleted */
  Boolean locked = null

  /* The name of the role used for display purposes */
  String name = null

  /* The keyword that defines the role */
  String role = null

  /* The list of permissions this role has */
  List<PermissionResource> rolePermission = new ArrayList<PermissionResource>()

  /* The number of users this role is assigned to */
  Integer userCount = null
  

}

