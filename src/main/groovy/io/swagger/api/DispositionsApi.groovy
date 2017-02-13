package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.DispositionCount
import io.swagger.model.DispositionResource
import io.swagger.model.PageResourceDispositionResource

import java.util.*;

@Mixin(ApiUtils)
class DispositionsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addDisposition ( DispositionResource disposition, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/dispositions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DispositionResource.class )
                    
    }
    def deleteDisposition ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/dispositions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getDisposition ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/dispositions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispositionResource.class )
                    
    }
    def getDispositionCounts ( String filterContext, String filterOwner, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/dispositions/count"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterContext)))
            queryParams.put("filterContext", String.valueOf(filterContext))
if (!"null".equals(String.valueOf(filterOwner)))
            queryParams.put("filterOwner", String.valueOf(filterOwner))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DispositionCount.class )
                    
    }
    def getDispositions ( String filterContext, String filterOwner, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/dispositions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterContext)))
            queryParams.put("filterContext", String.valueOf(filterContext))
if (!"null".equals(String.valueOf(filterOwner)))
            queryParams.put("filterOwner", String.valueOf(filterOwner))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceDispositionResource.class )
                    
    }
}
