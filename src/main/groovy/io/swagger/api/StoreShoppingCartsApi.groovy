package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Cart
import io.swagger.model.CartItemRequest
import io.swagger.model.CartShippableResponse
import io.swagger.model.CartShippingAddressRequest
import io.swagger.model.PageResourceCartSummary
import io.swagger.model.SampleCountriesResponse
import io.swagger.model.SkuRequest

import java.util.*;

@Mixin(ApiUtils)
class StoreShoppingCartsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addDiscountUsingPOST ( String id, SkuRequest skuRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/discounts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def addItemUsingPOST ( String id, CartItemRequest cartItemRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/items"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def assignCartUsingPUT ( String id, Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/owner"

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
    def checkShippableUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/shippable"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CartShippableResponse.class )
                    
    }
    def createCartUsingPOST ( Integer owner, String currencyCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(owner)))
            queryParams.put("owner", String.valueOf(owner))
if (!"null".equals(String.valueOf(currencyCode)))
            queryParams.put("currencyCode", String.valueOf(currencyCode))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def getCartUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Cart.class )
                    
    }
    def getCountriesUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/countries"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SampleCountriesResponse.class )
                    
    }
    def modifyShippingAddressUsingPUT ( String id, CartShippingAddressRequest cartShippingAddressRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/shipping-address"

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
    def removeDiscountUsingDELETE ( String id, String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/discounts/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def searchCartsUsingGET ( Integer filterOwnerId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterOwnerId)))
            queryParams.put("filterOwnerId", String.valueOf(filterOwnerId))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceCartSummary.class )
                    
    }
    def setCartCurrencyUsingPUT ( String id, String currencyCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/currency"

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
    def updateItemUsingPUT ( String id, CartItemRequest cartItemRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/items"

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
