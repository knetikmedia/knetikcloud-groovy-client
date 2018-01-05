package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.SimpleGroupResource;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class GroupMemberResource {

  /* A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The group. Id is the unique name */
  SimpleGroupResource group = null

  /* Whether this membership is explicit (the user was added directly to the group) or implicit (the user was added only to one or more child groups) */
  Boolean implicit = null

  /* The id of the membership entry */
  Long membershipId = null

  /* The position of the member in the group if applicable. Read notes for details */
  String order = null

  /* The member's access level. Default: member */
  String status = null

  /* A template this member additional properties are validated against (private). May be null and no validation of properties will be done */
  String template = null

  /* The user */
  SimpleUserResource user = null
  

}

