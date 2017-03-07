package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ClientResource
import io.swagger.model.GrantTypeResource
import io.swagger.model.PageResourceClientResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class AuthClientsApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createClient ( ClientResource clientResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ClientResource.class )
                    
    }
    def deleteClient ( String clientKey, Closure onSuccess, Closure onFailure)  {
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
    def getClient ( String clientKey, Closure onSuccess, Closure onFailure)  {
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
    def getClientGrantTypes ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/clients/grant-types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    GrantTypeResource.class )
                    
    }
    def getClients ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
                    PageResourceClientResource.class )
                    
    }
    def setClientGrantTypes ( String clientKey, List<String> grantList, Closure onSuccess, Closure onFailure)  {
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
    def setClientRedirectUris ( String clientKey, List<String> redirectList, Closure onSuccess, Closure onFailure)  {
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
    def updateClient ( String clientKey, ClientResource clientResource, Closure onSuccess, Closure onFailure)  {
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
                    ClientResource.class )
                    
    }
}
