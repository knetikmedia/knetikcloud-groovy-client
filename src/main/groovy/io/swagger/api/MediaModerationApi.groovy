package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FlagReportResource
import io.swagger.model.PageFlagReportResource

import java.util.*;

@Mixin(ApiUtils)
class MediaModerationApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getFlagReportUsingGET ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/moderation/reports/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def getFlagsReportUsingGET ( Boolean excludeResolved, String filterContext, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/moderation/reports"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(excludeResolved)))
            queryParams.put("excludeResolved", String.valueOf(excludeResolved))
if (!"null".equals(String.valueOf(filterContext)))
            queryParams.put("filterContext", String.valueOf(filterContext))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageFlagReportResource.class )
                    
    }
    def setFlagResolutionUsingPUT ( Long id, FlagReportResource flagReportResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/moderation/reports/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
