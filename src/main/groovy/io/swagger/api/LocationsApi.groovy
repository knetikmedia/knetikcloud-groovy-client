package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CityResource
import io.swagger.model.CountryResource
import io.swagger.model.CurrencyResource
import io.swagger.model.StateResource

import java.util.*;

@Mixin(ApiUtils)
class LocationsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def citiesUsingGET ( String countryCodeIso3, String stateCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/location/countries/{country_code_iso3}/states/{state_code}/cities"

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
                    "GET", "array",
                    CityResource.class )
                    
    }
    def countriesUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/location/countries"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    CountryResource.class )
                    
    }
    def getCurrencyByGeoLocationUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/location/geolocation/currency"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CurrencyResource.class )
                    
    }
    def getGeoLocationCountryUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/location/geolocation/country"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def statesUsingGET ( String countryCodeIso3, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/location/countries/{country_code_iso3}/states"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (countryCodeIso3 == null) {
            throw new RuntimeException("missing required params countryCodeIso3")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    StateResource.class )
                    
    }
}
