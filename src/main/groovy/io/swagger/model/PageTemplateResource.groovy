package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Sort;
import io.swagger.model.TemplateResource;
import java.util.List;
@Canonical
class PageTemplateResource {

    List<TemplateResource> content = new ArrayList<TemplateResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    Sort sort = null

    Long totalElements = null

    Integer totalPages = null
  

}

