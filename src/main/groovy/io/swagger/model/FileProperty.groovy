package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Property;
@Canonical
class FileProperty {

  /* A crc value for file integrity verification */
  String crc = null

  /* A description of the file */
  String description = null

  /* The type of file such as txt, mp3, mov or csv */
  String fileType = null

  /* The url of the file */
  String url = null
  

}

