package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MessageContentResource;
@Canonical
class MessageResource {

  /* The content of the message in various formats */
  MessageContentResource content = null

  /* The id of the recipient, dependent on the recipient_type. The user's id or the topic's id. Required if sending directly to messaging service */
  String recipient = null

  /* The type of recipient for the message. Either a user, or all users in a topic. Required if sending directly to messaging service */
  String recipientType = null

  /* The subject of the message. Required for email messages */
  String subject = null

  /* The type of message for websocket type hinting. will be added to the payload with the key _type */
  String type = null
  

}

