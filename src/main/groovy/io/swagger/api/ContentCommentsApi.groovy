package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CommentResource
import io.swagger.model.CommentSearch
import io.swagger.model.PageResourceCommentResource

import java.util.*;

@Mixin(ApiUtils)
class ContentCommentsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addCommentUsingPOST ( CommentResource commentResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CommentResource.class )
                    
    }
    def deleteCommentUsingDELETE ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments/{id}"

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
    def getCommentUsingGET ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CommentResource.class )
                    
    }
    def getCommentsUsingGET ( String context, Integer contextId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (context == null) {
            throw new RuntimeException("missing required params context")
        }
        // verify required params are set
        if (contextId == null) {
            throw new RuntimeException("missing required params contextId")
        }

        if (!"null".equals(String.valueOf(context)))
            queryParams.put("context", String.valueOf(context))
if (!"null".equals(String.valueOf(contextId)))
            queryParams.put("contextId", String.valueOf(contextId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceCommentResource.class )
                    
    }
    def searchCommentsUsingPOST ( Object query, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments/search"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CommentSearch.class )
                    
    }
    def updateCommentUsingPUT ( Long id, String content, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/comments/{id}/content"

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
