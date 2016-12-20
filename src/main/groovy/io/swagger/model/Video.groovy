package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Artist;
import io.swagger.model.CollectionVideoContribution;
import io.swagger.model.User;
import io.swagger.model.VideoTag;
import java.util.List;
@Canonical
class Video {

    Boolean active = null

    Artist author = null

    Long authored = null

    Boolean banned = null

    String categoryId = null

    String categoryName = null

    CollectionVideoContribution contributors = null

    Long created = null

    String embed = null

    String extension = null

    Integer height = null

    Long id = null

    Integer length = null

    String location = null

    String longDescription = null

    String mimeType = null

    String name = null

    Integer priority = null

    String privacy = null

    Boolean published = null

    String shortDescription = null

    Long size = null

    List<VideoTag> tags = new ArrayList<VideoTag>()

    String thumbnail = null

    Long updated = null

    User uploader = null

    Long views = null

    List<User> whitelist = new ArrayList<User>()

    Integer width = null
  

}

