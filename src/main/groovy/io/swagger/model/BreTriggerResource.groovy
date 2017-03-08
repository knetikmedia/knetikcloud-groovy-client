package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BreTriggerParameterDefinition;
import java.util.List;
@Canonical
class BreTriggerResource {

  /* The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom' */
  String category = null

  /* The unique name for the event. This serves as the unique identifier. Cannot be changed after creation */
  String eventName = null

  /* A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types */
  List<BreTriggerParameterDefinition> parameters = new ArrayList<BreTriggerParameterDefinition>()

  /* Where this trigger came from. System triggers cannot be removed or updated */
  Boolean systemTrigger = null

  /* A description of the trigger */
  String triggerDescription = null

  /* A human readable name for this trigger */
  String triggerName = null
  

}

