package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CountryTaxResource
import io.swagger.model.PageCountryTaxResource
import io.swagger.model.PageStateTaxResource
import io.swagger.model.StateTaxResource

import java.util.*;

@Mixin(ApiUtils)
class TaxesApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createTaxUsingPOST ( String countryCodeIso3, StateTaxResource taxResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}/states"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def deleteTaxUsingDELETE ( String countryCodeIso3, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteTaxUsingDELETE1 ( String countryCodeIso3, String stateCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}/states/{state_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }
        // verify required params are set
        if (stateCode == null) {
            throw new RuntimeException("missing required params stateCode")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getAllTaxesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/states"

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
                    PageStateTaxResource.class )
                    
    }
    def getTaxUsingGET ( String countryCodeIso3, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CountryTaxResource.class )
                    
    }
    def getTaxUsingGET1 ( String countryCodeIso3, String stateCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}/states/{state_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }
        // verify required params are set
        if (stateCode == null) {
            throw new RuntimeException("missing required params stateCode")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    StateTaxResource.class )
                    
    }
    def getTaxesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries"

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
                    PageCountryTaxResource.class )
                    
    }
    def getTaxesUsingGET1 ( String countryCodeIso3, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}/states"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageStateTaxResource.class )
                    
    }
    def updateTaxUsingPOST ( CountryTaxResource taxResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def updateTaxUsingPUT ( String countryCodeIso3, CountryTaxResource taxResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateTaxUsingPUT1 ( String countryCodeIso3, String stateCode, StateTaxResource taxResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/tax/countries/{country_code_iso3}/states/{state_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }
        // verify required params are set
        if (stateCode == null) {
            throw new RuntimeException("missing required params stateCode")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
