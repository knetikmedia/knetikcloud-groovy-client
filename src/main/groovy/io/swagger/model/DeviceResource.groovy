package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class DeviceResource {

  /* The authorization code for the device */
  String authorization = null

  /* The current condition of the device (New, Defective, Reconditioned) */
  String condition = null

  /* The date the device log was created */
  Long createdDate = null

  /* The key/value pairs for extended data */
  Map<String, String> data = new HashMap<String, String>()

  /* The description of the device */
  String description = null

  /* The type of the device */
  String deviceType = null

  /* The unique ID for this device. Cannot be changed once created */
  Integer id = null

  /* The location of the device */
  String location = null

  /* The MAC (media access control) address of the device */
  String macAddress = null

  /* The make of the device */
  String make = null

  /* The model of the device */
  String model = null

  /* The name of the device */
  String name = null

  /* The OS (operating system) on the device */
  String os = null

  /* The serial number of the device */
  String serial = null

  /* The current status the device (Active, Pending Active, Inactive, Repair */
  String status = null

  /* The date the device log was updated */
  Long updatedDate = null

  /* The user that owns the device */
  SimpleUserResource user = null

  /* The users currently using the device */
  List<SimpleUserResource> users = new ArrayList<SimpleUserResource>()
  

}

