package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UserNotificationResource {

  /* The data to send and fill templates */
  Object data = null

  /* The id of the notification */
  String notificationId = null

  /* The id of the notification type */
  String notificationTypeId = null

  /* The id of the recipient, dependent on the recipient_type. The user's id or the topic's id */
  String recipient = null

  /* The type of recipient for the notification. Either a user, or all users in a topic */
  String recipientType = null

  /* The date this notification was first retrieved */
  Long retrieveDate = null

  /* The date this notification was sent */
  Long sendDate = null

  /* The user's status for this notification */
  String status = null

  /* The id of the user */
  Integer userId = null
  

}

