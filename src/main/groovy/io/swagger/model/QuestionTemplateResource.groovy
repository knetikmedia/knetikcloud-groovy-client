package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PropertyDefinitionResource;
import java.util.List;
@Canonical
class QuestionTemplateResource {

  /* A property definition for all answers. If included each answer must match this definition's type and be valid */
  PropertyDefinitionResource answerProperty = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The id of the template */
  String id = null

  /* The name of the template */
  String name = null

  /* The customized properties that are present */
  List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>()

  /* A property definition for the question itself. If included the answer must match this definition's type and be valid */
  PropertyDefinitionResource questionProperty = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

