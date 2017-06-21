package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class S3Config {

    String bucketName = null

    String cdnUrl = null

    String region = null

    String uploadPrefix = null
  

}

