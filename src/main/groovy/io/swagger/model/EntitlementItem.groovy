package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import java.util.List;
@Canonical
class EntitlementItem {

  /* The behaviors linked to the item, describing various options and interactions. May not be included in item lists */
  List<Behavior> behaviors = new ArrayList<Behavior>()

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

  /* The type of the item */
  String typeHint = null

  /* The unique key for the item */
  String uniqueKey = null

  /* The date the item was last updated, unix timestamp in seconds */
  Long updatedDate = null
  

}

