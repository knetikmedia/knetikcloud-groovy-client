package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import java.util.List;
@Canonical
class ObjectResource {

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

  /* A category for filtering items */
  String category = null

  /* The date the item was created, unix timestamp in seconds */
  Long createdDate = null

  /* A map of additional data. The template will define requirements for the object */
  Object data = null

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

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated, unix timestamp in seconds */
  Long updatedDate = null
  

}

