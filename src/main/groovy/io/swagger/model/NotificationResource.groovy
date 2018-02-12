package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class NotificationResource {

  /* The data to send to websockets. Also used to fill in the templates */
  Object data = null

  /* The id of this individual notification. Default: random */
  String notificationId = null

  /* The id of the notification type which will define message templates */
  String notificationTypeId = null

  /* The id of the recipient, dependent on the recipient_type. The user's id or the topic's id */
  String recipient = null

  /* The type of recipient for the notification. Either a user, or all users in a topic */
  String recipientType = null

  /* The date this notification was sent */
  Long sendDate = null
  

}

