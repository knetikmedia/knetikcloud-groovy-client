package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChatThreadResource;
@Canonical
class ChatUserThreadResource {

  /* The date the user thread was created */
  Long createdDate = null

  /* The number of messages read in the thread */
  Integer readCount = null

  /* The details about the thread */
  ChatThreadResource thread = null

  /* The id of the thread */
  String threadId = null

  /* The date the user thread was updated */
  Long updatedDate = null

  /* The id of the user */
  Integer userId = null
  

}

