package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class AudioPropertyDefinitionResource {

  /* If provided, a file type the property must match */
  String fileType = null

  /* If provided, the maximum length of the audio */
  Integer maxLength = null

  /* If provided, the minimum length of the audio */
  Integer minLength = null
  

}

