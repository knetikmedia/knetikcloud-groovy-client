package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ChatMessageResource {

  /* The content of the message */
  Object content = null

  /* The date the chat message was created */
  Long createdDate = null

  /* Whether the message has been edited */
  Boolean edited = null

  /* The id for this message */
  String id = null

  /* The type of the message set by the client */
  String messageType = null

  /* The id of the recipient: user id or topic id */
  String recipientId = null

  /* The recipient type of the message */
  String recipientType = null

  /* The id of the sender */
  Integer senderId = null

  /* The id of the thread */
  String threadId = null

  /* The date the chat message was updated */
  Long updatedDate = null
  

}

