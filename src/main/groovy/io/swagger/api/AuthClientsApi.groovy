package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ClientResource
import io.swagger.model.GrantTypeResource
import io.swagger.model.PageClientResource

import java.util.*;

@Mixin(ApiUtils)
class AuthClientsApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def assignClientGrantTypesUsingPUT ( String clientKey, List<String> grantList, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/{client_key}/grant-types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def assignClientRedirectUrisUsingPUT ( String clientKey, List<String> redirectList, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/{client_key}/redirect-uris"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def createClientUsingPOST ( ClientResource clientResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ClientResource.class )
                    
    }
    def deleteClientUsingDELETE ( String clientKey, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/{client_key}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getClientUsingGET ( String clientKey, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/{client_key}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ClientResource.class )
                    
    }
    def getClientsUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageClientResource.class )
                    
    }
    def listAvailableGrantTypesUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/grant-types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    GrantTypeResource.class )
                    
    }
    def updateClientUsingPUT ( String clientKey, ClientResource clientResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/{client_key}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
