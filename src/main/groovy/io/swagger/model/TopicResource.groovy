package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class TopicResource {

  /* The created date of the topic */
  Long createdDate = null

  /* The display name of the topic */
  String displayName = null

  /* The unique ID for this topic */
  String id = null

  /* Whether this topic is locked or not. */
  Boolean locked = null

  /* Random tags to facilitate search */
  List<String> tags = new ArrayList<String>()

  /* The last time the topic was updated */
  Long updatedDate = null

  /* The subscribed user count of the topic */
  Integer userCount = null
  

}

