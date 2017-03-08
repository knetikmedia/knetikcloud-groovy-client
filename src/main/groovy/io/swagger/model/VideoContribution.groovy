package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Artist;
import io.swagger.model.Video;
@Canonical
class VideoContribution {

    Artist artist = null

    Integer id = null

    Video media = null

    String role = null
  

}

