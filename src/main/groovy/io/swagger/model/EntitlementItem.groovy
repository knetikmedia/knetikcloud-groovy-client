package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class EntitlementItem {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* A category for filtering items */
  String category = null

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* The id of the item */
  Integer id = null

  /* A long description of the item */
  String longDescription = null

  /* The name of the item */
  String name = null

  /* A short description of the item, max 255 chars */
  String shortDescription = null

  /* A number to use in sorting items.  Default 500 */
  Integer sort = null

  /* List of tags used for filtering items */
  List<String> tags = new ArrayList<String>()

  /* An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null */
  String template = null

  /* The type of the item */
  String typeHint = null

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated, unix timestamp in seconds */
  Long updatedDate = null
  

}

