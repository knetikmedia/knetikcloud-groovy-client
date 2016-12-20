package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MongoDatabaseConfig;
import io.swagger.model.SqlDatabaseConfig;
@Canonical
class DatabaseConfig {

    MongoDatabaseConfig mongo = null

    SqlDatabaseConfig sql = null
  

}

