package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CurrencyResource
import io.swagger.model.PageResourceCurrencyResource

import java.util.*;

@Mixin(ApiUtils)
class CurrenciesApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createCurrencyUsingPOST ( CurrencyResource currency, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/currencies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CurrencyResource.class )
                    
    }
    def deleteCurrencyUsingDELETE ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/currencies/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getCurrenciesUsingGET ( Boolean filterEnabledCurrencies, String filterType, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/currencies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterEnabledCurrencies)))
            queryParams.put("filterEnabledCurrencies", String.valueOf(filterEnabledCurrencies))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceCurrencyResource.class )
                    
    }
    def getCurrencyUsingGET ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/currencies/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CurrencyResource.class )
                    
    }
    def updateCurrencyUsingPUT ( String code, CurrencyResource currency, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/currencies/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
