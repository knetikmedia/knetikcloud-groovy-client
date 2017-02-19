package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Result
import io.swagger.model.Version

import java.util.*;

@Mixin(ApiUtils)
class UtilVersionApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getVersion ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/version"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Version.class )
                    
    }
}
