package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Config
import io.swagger.model.PageConfig

import java.util.*;

@Mixin(ApiUtils)
class ConfigsApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createConfigUsingPOST ( Config config, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/configs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Config.class )
                    
    }
    def deleteConfigUsingDELETE ( String name, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/configs/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getConfigUsingGET ( String name, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/configs/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Config.class )
                    
    }
    def getConfigsUsingGET ( String filterSearch, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/configs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageConfig.class )
                    
    }
    def updateConfigUsingPUT ( String name, Config config, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/configs/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
