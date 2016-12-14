package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ItemBehaviorDefinitionResource;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.TemplateResource;
import java.util.List;
@Canonical
class ItemTemplateResource {

  /* The customized behaviors that are required or default for this type of item */
  List<ItemBehaviorDefinitionResource> behaviors = new ArrayList<ItemBehaviorDefinitionResource>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The id of the template */
  String id = null

  /* The name of the template */
  String name = null

  /* The customized properties that are present */
  List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>()

  /* A template to apply to all skus on an item using this template */
  TemplateResource skuTemplate = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

