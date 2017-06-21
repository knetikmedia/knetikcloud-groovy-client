package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class ImagePropertyDefinitionResource {

  /* If provided, a file type that the property must match */
  String fileType = null

  /* If provided, the maximum height of the image */
  Integer maxHeight = null

  /* If provided, the maximum width of the image */
  Integer maxWidth = null

  /* If provided, the minimum height of the image */
  Integer minHeight = null

  /* If provided, the minimum width of the image */
  Integer minWidth = null
  

}

