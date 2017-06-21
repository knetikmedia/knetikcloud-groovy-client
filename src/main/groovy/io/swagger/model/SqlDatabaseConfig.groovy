package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SqlDatabaseConfig {

    Integer connectionPoolSize = null

    String dbName = null

    String hostname = null

    String password = null

    Integer port = null

    String username = null
  

}

