package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.OauthAccessTokenResource
import io.swagger.model.PageResourceOauthAccessTokenResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class AuthTokensApi {
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def deleteTokens ( String username, String clientId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/tokens"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(username)))
            queryParams.put("username", String.valueOf(username))
if (!"null".equals(String.valueOf(clientId)))
            queryParams.put("client_id", String.valueOf(clientId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getToken ( String username, String clientId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    OauthAccessTokenResource.class )
                    
    }
    def getTokens ( String filterClientId, String filterUsername, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/tokens"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterClientId)))
            queryParams.put("filter_client_id", String.valueOf(filterClientId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filter_username", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceOauthAccessTokenResource.class )
                    
    }
}
