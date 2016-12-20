package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceStoreItem
import io.swagger.model.PageResourceStoreItemTemplateResource
import io.swagger.model.StoreItem
import io.swagger.model.StoreItemTemplateResource
import io.swagger.model.StoreListRequest

import java.util.*;

@Mixin(ApiUtils)
class StoreApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createItemTemplateUsingPOST ( StoreItemTemplateResource itemTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    StoreItemTemplateResource.class )
                    
    }
    def createStoreItemExternalUsingPOST ( StoreItem storeItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    StoreItem.class )
                    
    }
    def deleteItemTemplateUsingDELETE ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteStoreItemUsingDELETE1 ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/{id}"

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
    def getItemTemplateUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    StoreItemTemplateResource.class )
                    
    }
    def getItemTemplatesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/templates"

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
                    PageResourceStoreItemTemplateResource.class )
                    
    }
    def getStoreItemUsingGET1 ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    StoreItem.class )
                    
    }
    def getStoreItemsUsingGET ( String filterNameSearch, String filterUniqueKey, Boolean filterPublished, Boolean filterDisplayable, String filterStart, String filterEnd, String filterStartDate, String filterStopDate, String filterSku, String filterPrice, String filterTag, String filterItemsByType, String filterBundledSkus, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterNameSearch)))
            queryParams.put("filterNameSearch", String.valueOf(filterNameSearch))
if (!"null".equals(String.valueOf(filterUniqueKey)))
            queryParams.put("filterUniqueKey", String.valueOf(filterUniqueKey))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterDisplayable)))
            queryParams.put("filterDisplayable", String.valueOf(filterDisplayable))
if (!"null".equals(String.valueOf(filterStart)))
            queryParams.put("filterStart", String.valueOf(filterStart))
if (!"null".equals(String.valueOf(filterEnd)))
            queryParams.put("filterEnd", String.valueOf(filterEnd))
if (!"null".equals(String.valueOf(filterStartDate)))
            queryParams.put("filterStartDate", String.valueOf(filterStartDate))
if (!"null".equals(String.valueOf(filterStopDate)))
            queryParams.put("filterStopDate", String.valueOf(filterStopDate))
if (!"null".equals(String.valueOf(filterSku)))
            queryParams.put("filterSku", String.valueOf(filterSku))
if (!"null".equals(String.valueOf(filterPrice)))
            queryParams.put("filterPrice", String.valueOf(filterPrice))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filterTag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterItemsByType)))
            queryParams.put("filterItemsByType", String.valueOf(filterItemsByType))
if (!"null".equals(String.valueOf(filterBundledSkus)))
            queryParams.put("filterBundledSkus", String.valueOf(filterBundledSkus))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceStoreItem.class )
                    
    }
    def getUsingGET2 ( StoreListRequest storeListRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceStoreItem.class )
                    
    }
    def updateItemTemplateUsingPUT ( String id, StoreItemTemplateResource itemTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/templates/{id}"

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
    def updateStoreItemExternalUsingPUT ( Integer id, StoreItem storeItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/items/{id}"

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
