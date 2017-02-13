package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceLocationLogResource
import io.swagger.model.TokenDetailsResource

import java.util.*;

@Mixin(ApiUtils)
class UtilSecurityApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getUserLocationLog ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/security/country-log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(userId)))
            queryParams.put("userId", String.valueOf(userId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceLocationLogResource.class )
                    
    }
    def getUserTokenDetails ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TokenDetailsResource.class )
                    
    }
}
