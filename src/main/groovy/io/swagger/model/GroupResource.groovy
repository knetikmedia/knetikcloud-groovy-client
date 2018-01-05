package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class GroupResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* A description of the group. Max 250 characters */
  String description = null

  /* The number of users in the group */
  Integer memberCount = null

  /* A message of the day for members of the group */
  String messageOfTheDay = null

  /* The name of the group. Max 50 characters */
  String name = null

  /* The unique name of another group that this group is a subset of */
  String parent = null

  /* The status which describes whether other users can freely join the group or not */
  String status = null

  /* The number of users in child groups */
  Integer subMemberCount = null

  /* Tags for search */
  List<String> tags = new ArrayList<String>()

  /* A group template this group is validated against. May be null and no validation of additional_properties will be done */
  String template = null

  /* Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created. Default: random UUID */
  String uniqueName = null
  

}

