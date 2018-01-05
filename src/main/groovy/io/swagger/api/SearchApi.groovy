package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceMapstringobject
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class SearchApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def searchIndex ( String type, Object query, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/search/index/{type}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PageResourceMapstringobject.class )
                    
    }
    def searchIndexWithTemplate ( String type, String template, Object query, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/search/index/{type}/{template}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (template == null) {
            throw new RuntimeException("missing required params template")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PageResourceMapstringobject.class )
                    
    }
}
