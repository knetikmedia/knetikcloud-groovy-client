package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TemplatedEmail;
@Canonical
class MessageContentResource {

  /* The content of the email */
  String email = null

  /* The content of the mobile app push notification */
  String push = null

  /* The content of the sms */
  String sms = null

  /* The content of the templated email */
  TemplatedEmail templatedEmail = null

  /* The content of the websocket message */
  Object websocket = null
  

}

