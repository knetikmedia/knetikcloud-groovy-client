package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DispositionResource;
import io.swagger.model.Sort;
import java.util.List;
@Canonical
class PageDispositionResource {

    List<DispositionResource> content = new ArrayList<DispositionResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    Sort sort = null

    Long totalElements = null

    Integer totalPages = null
  

}

