package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class UtilHealthApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getHealth ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/health"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
}
