package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CommentResource;
import io.swagger.model.ContributionResource;
import io.swagger.model.SimpleReferenceResourcelong;
import io.swagger.model.SimpleReferenceResourcestring;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class VideoResource {

  /* Whether the video is available, based on various factors */
  Boolean active = null

  /* The original artist of the media */
  SimpleReferenceResourcelong author = null

  /* The date the media was created as a unix timestamp in seconds */
  Long authored = null

  /* Whether the video has been banned or not */
  Boolean banned = null

  /* The category of the video */
  SimpleReferenceResourcestring category = null

  /* The comments of the video */
  List<CommentResource> comments = new ArrayList<CommentResource>()

  /* Artists that contributed to the creation. See separate endpoint to add to list */
  List<ContributionResource> contributors = new ArrayList<ContributionResource>()

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The country of an embedable version */
  String embed = null

  /* The file extension of the media file. 1-5 characters */
  String extension = null

  /* The height of the video in px */
  Integer height = null

  /* The unique ID for that resource */
  Long id = null

  /* The length of the video in seconds */
  Integer length = null

  /* The country of the media. Typically a url. Cannot be blank */
  String location = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The mime-type of the media */
  String mimeType = null

  /* The user friendly name of that resource */
  String name = null

  /* The sort order of the video. default: 100 */
  Integer priority = null

  /* The privacy setting. default: private */
  String privacy = null

  /* Whether the video has been made public. Default true */
  Boolean published = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* The size of the media. Minimum 0 if supplied */
  Long size = null

  /* The tags for the video */
  List<String> tags = new ArrayList<String>()

  /* The country of a thumbnail version. Typically a url */
  String thumbnail = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null

  /* The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null */
  SimpleUserResource uploader = null

  /* The view count of the video */
  Long views = null

  /* The width of the video in px */
  Integer width = null
  

}

