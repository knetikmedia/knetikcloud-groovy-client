package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ChatThreadResource {

  /* The number of active users in the thread */
  Integer activeUsers = null

  /* The number of messages in the thread */
  Integer count = null

  /* The date the thread was created */
  Long createdDate = null

  /* The id for this thread */
  String id = null

  /* The id of the recipient */
  String recipientId = null

  /* The recipient type of the thread */
  String recipientType = null

  /* The subject of the thread */
  String subject = null

  /* The date the thread was updated */
  Long updatedDate = null
  

}

