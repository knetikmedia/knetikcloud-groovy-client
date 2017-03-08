package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleReferenceResourcelong;
@Canonical
class ContributionResource {

  /* A reference to the contributing artist */
  SimpleReferenceResourcelong artist = null

  /* A reference to the media being contributed to */
  SimpleReferenceResourcelong media = null

  /* The nature of the contribution (role of the artist as in 'producer', 'performer', etc) */
  String role = null
  

}

