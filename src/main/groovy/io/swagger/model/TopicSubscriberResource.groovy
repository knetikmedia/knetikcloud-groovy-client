package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TopicSubscriberResource {

  /* Whether the user has disabled messages from the topic */
  Boolean disabled = null

  /* The ID for this topic */
  String topicId = null

  /* The user ID subscribed to the topic */
  Integer userId = null

  /* The username subscribed to the topic */
  String username = null
  

}

