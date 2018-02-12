package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class NotificationTypeResource {

  /* The date the type was created, as a unix timestamp in seconds */
  Long createdDate = null

  /* Whether the email body should be resolved. If true, the external email delivery system will be expected to handle the templating (Mandrill/Mailchimp). default: false */
  Boolean emailBodyTemplateExternal = null

  /* The id of a message template to resolve the email body. If null, no websocket message wil be sent */
  String emailBodyTemplateId = null

  /* The id of a message template to resolve the email subject. If null, no websocket message wil be sent */
  String emailSubjectTemplateId = null

  /* The id of the notification type. Default: random */
  String id = null

  /* The name of the notification type */
  String name = null

  /* The id of a message template to resolve the SMS message. If null, no sms message wil be sent */
  String smsTemplateId = null

  /* The date the type was last updated, as a unix timestamp in seconds */
  Long updatedDate = null
  

}

