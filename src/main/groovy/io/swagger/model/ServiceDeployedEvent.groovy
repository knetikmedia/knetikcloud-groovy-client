package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BreTriggerResource;
import io.swagger.model.BroadcastableEvent;
import io.swagger.model.ResourceTypeDescription;
import java.util.List;
@Canonical
class ServiceDeployedEvent {

  /* The events fired by this service */
  List<BreTriggerResource> events = new ArrayList<BreTriggerResource>()

  /* The resources managed by this service */
  List<ResourceTypeDescription> resources = new ArrayList<ResourceTypeDescription>()

  /* The unique name for the service. This serves as the unique identifier. Cannot be changed after creation */
  String serviceName = null

  /* The url of the swagger doc */
  String swaggerUrl = null
  

}

