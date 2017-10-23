package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class FilePropertyDefinitionResource {

  /* If provided, a file type that the property must match */
  String fileType = null

  /* If provided, the maximum allowed file size in bytes */
  Long maxFileSize = null
  

}

