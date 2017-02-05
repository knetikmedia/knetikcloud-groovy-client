package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.VariableTypeResource

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineVariablesApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getListUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/variable-types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    VariableTypeResource.class )
                    
    }
}
