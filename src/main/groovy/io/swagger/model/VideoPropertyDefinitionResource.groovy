package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class VideoPropertyDefinitionResource {

  /* If provided, a file type that teh property must match */
  String fileType = null

  /* If provided, the maximum height of the video */
  Integer maxHeight = null

  /* If provided, the maximum length of the video */
  Integer maxLength = null

  /* If provided, the maximum width of the video */
  Integer maxWidth = null

  /* If provided, the minimum height of the video */
  Integer minHeight = null

  /* If provided, the minimum length of the video */
  Integer minLength = null

  /* If provided, the minimum width of the video */
  Integer minWidth = null
  

}

