package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class DeviceResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template if one is specified */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The date the device log was created */
  Long createdDate = null

  /* The description of the device */
  String description = null

  /* The type of device. Use mobile_device to specifically register mobile devices. This particular type will be used to send and receive notifications */
  String deviceType = null

  /* The unique ID for this device. Cannot be changed after creation. Default: random */
  String id = null

  /* The physical location of the device, coordinates or named place (office, living room, etc) */
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

  /* The user that owns the device */
  SimpleUserResource owner = null

  /* The serial number of the device */
  String serial = null

  /* Random tags to facilitate search */
  List<String> tags = new ArrayList<String>()

  /* Use to describe and validate custom properties (custom schema). May be null and no validation of additional_properties will be done */
  String template = null

  /* The date the device log was updated */
  Long updatedDate = null

  /* The users currently using the device */
  List<SimpleUserResource> users = new ArrayList<SimpleUserResource>()
  

}

