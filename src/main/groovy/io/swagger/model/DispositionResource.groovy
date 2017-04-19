package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class DispositionResource {

  /* The context of that resource. Required when passed to /dispositions rather than context specific endpoint */
  String context = null

  /* The context_id of that resource. Required when passed to /dispositions rather than context specific endpoint */
  String contextId = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The name of the disposition, 1-20 characters. (ex: like/dislike/favorite, etc) */
  String name = null

  /* The user */
  SimpleUserResource user = null
  

}

