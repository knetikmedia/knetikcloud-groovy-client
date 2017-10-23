package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DeviceResource;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class MobileDeviceResource {

  /* The authorization code for push notifications provided by the provider platform (APNS, GCM, etc). */
  String authorization = null

    String imei = null

  /* The platform used for push notifications. Only Apple and Android are supported at the moment. */
  String notificationPlatform = null

  /* The phone number associated with this device if applicable, in international format */
  String number = null
  

}

