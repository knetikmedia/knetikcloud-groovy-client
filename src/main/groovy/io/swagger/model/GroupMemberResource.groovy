package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class GroupMemberResource {

  /* A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The url of the user's avatar image */
  String avatarUrl = null

  /* The public username of the user */
  String displayName = null

  /* The id of the user */
  Integer id = null

  /* The position of the member in the group if applicable. Read notes for details */
  String order = null

  /* The member's access level. Default: member */
  String status = null

  /* A template this member additional properties are validated against (private). May be null and no validation of properties will be done */
  String template = null

  /* The username of the user */
  String username = null
  

}

