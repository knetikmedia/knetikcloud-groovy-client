package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PermissionResource {

  /* The date the permission was added. Unix timestamp in seconds */
  Long createdDate = null

  /* The description of the permission */
  String description = null

  /* Whether a permission is locked from being deleted */
  Boolean locked = null

  /* The name of the permission used for display purposes */
  String name = null

  /* The name of the parent of the permission */
  String parent = null

  /* The keyword that defines the permission */
  String permission = null

  /* The date the permission was updated. Unix timestamp in seconds */
  Long updatedDate = null
  

}

