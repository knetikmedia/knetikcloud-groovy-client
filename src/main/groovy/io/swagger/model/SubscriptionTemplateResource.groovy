package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.TemplateResource;
import java.util.List;
@Canonical
class SubscriptionTemplateResource {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The id of the template */
  String id = null

  /* The name of the template */
  String name = null

  /* A template to apply to all plans on a subscription using this template */
  TemplateResource planTemplate = null

  /* The customized properties that are present */
  List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>()

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

