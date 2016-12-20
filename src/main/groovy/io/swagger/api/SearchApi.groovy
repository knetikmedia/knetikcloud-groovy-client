package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageMapstringobject
import io.swagger.model.SearchReferenceMapping

import java.util.*;

@Mixin(ApiUtils)
class SearchApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def externalAddUsingPOST ( String type, String id, Object object, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/search/index/{type}/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def externalDeleteAllUsingDELETE ( String type, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/search/index/{type}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def externalDeleteUsingDELETE ( String type, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/search/index/{type}/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def externalRegisterUsingPOST ( List<SearchReferenceMapping> mappings, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/search/mappings"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def searchUsingPOST ( String type, Object query, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PageMapstringobject.class )
                    
    }
}
