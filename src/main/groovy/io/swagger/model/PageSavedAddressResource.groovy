package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SavedAddressResource;
import io.swagger.model.Sort;
import java.util.List;
@Canonical
class PageSavedAddressResource {

    List<SavedAddressResource> content = new ArrayList<SavedAddressResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    Sort sort = null

    Long totalElements = null

    Integer totalPages = null
  

}

