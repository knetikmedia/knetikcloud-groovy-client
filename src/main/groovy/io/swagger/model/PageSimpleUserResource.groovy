package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SimpleUserResource;
import io.swagger.model.Sort;
import java.util.List;
@Canonical
class PageSimpleUserResource {

    List<SimpleUserResource> content = new ArrayList<SimpleUserResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    Sort sort = null

    Long totalElements = null

    Integer totalPages = null
  

}

