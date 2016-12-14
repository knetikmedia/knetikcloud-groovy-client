package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.OauthAccessTokenResource
import io.swagger.model.PageOauthAccessTokenResource

import java.util.*;

@Mixin(ApiUtils)
class AuthTokensApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def deleteTokenUsingDELETE ( String username, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/tokens/{username}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteTokenWithClientIdUsingDELETE ( String username, String clientId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/tokens/{username}/{client_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (clientId == null) {
            throw new RuntimeException("missing required params clientId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getTokenByUserUsingGET ( String username, String clientId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/tokens/{username}/{client_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (clientId == null) {
            throw new RuntimeException("missing required params clientId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    OauthAccessTokenResource.class )
                    
    }
    def getTokensUsingGET ( String filterClientId, String filterUsername, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/tokens"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterClientId)))
            queryParams.put("filterClientId", String.valueOf(filterClientId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filterUsername", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageOauthAccessTokenResource.class )
                    
    }
}
