package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FlagReportResource
import io.swagger.model.FlagResource
import io.swagger.model.PageResourceFlagReportResource
import io.swagger.model.PageResourceFlagResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class MediaModerationApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def addFlag ( FlagResource flagResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/flags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    FlagResource.class )
                    
    }
    def deleteFlag ( String contextName, String contextId, Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/flags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(contextName)))
            queryParams.put("context_name", String.valueOf(contextName))
if (!"null".equals(String.valueOf(contextId)))
            queryParams.put("context_id", String.valueOf(contextId))
if (!"null".equals(String.valueOf(userId)))
            queryParams.put("user_id", String.valueOf(userId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getFlags ( String filterContext, String filterContextId, Integer filterUserId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/flags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterContext)))
            queryParams.put("filter_context", String.valueOf(filterContext))
if (!"null".equals(String.valueOf(filterContextId)))
            queryParams.put("filter_context_id", String.valueOf(filterContextId))
if (!"null".equals(String.valueOf(filterUserId)))
            queryParams.put("filter_user_id", String.valueOf(filterUserId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceFlagResource.class )
                    
    }
    def getModerationReport ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/reports/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FlagReportResource.class )
                    
    }
    def getModerationReports ( Boolean excludeResolved, String filterContext, String filterContextId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/reports"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(excludeResolved)))
            queryParams.put("exclude_resolved", String.valueOf(excludeResolved))
if (!"null".equals(String.valueOf(filterContext)))
            queryParams.put("filter_context", String.valueOf(filterContext))
if (!"null".equals(String.valueOf(filterContextId)))
            queryParams.put("filter_context_id", String.valueOf(filterContextId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceFlagReportResource.class )
                    
    }
    def updateModerationReport ( Long id, FlagReportResource flagReportResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/moderation/reports/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
