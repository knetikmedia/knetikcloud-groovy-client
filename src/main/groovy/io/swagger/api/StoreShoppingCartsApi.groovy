package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Cart
import io.swagger.model.CartItemRequest
import io.swagger.model.CartShippableResponse
import io.swagger.model.CartShippingAddressRequest
import io.swagger.model.CouponDefinition
import io.swagger.model.PageResourceCartSummary
import io.swagger.model.Result
import io.swagger.model.SampleCountriesResponse
import io.swagger.model.SkuRequest

import java.util.*;

@Mixin(ApiUtils)
class StoreShoppingCartsApi {
    String basePath = "https://sandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addCustomDiscount ( String id, CouponDefinition customDiscount, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/carts/{id}/custom-discounts"

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
    def addDiscountToCart ( String id, SkuRequest skuRequest, Closure onSuccess, Closure onFailure)  {
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
    def addItemToCart ( String id, CartItemRequest cartItemRequest, Closure onSuccess, Closure onFailure)  {
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
    def createCart ( Integer owner, String currencyCode, Closure onSuccess, Closure onFailure)  {
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
    def getCart ( String id, Closure onSuccess, Closure onFailure)  {
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
    def getCarts ( Integer filterOwnerId, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
    def getShippable ( String id, Closure onSuccess, Closure onFailure)  {
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
    def getShippingCountries ( String id, Closure onSuccess, Closure onFailure)  {
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
    def removeDiscountFromCart ( String id, String code, Closure onSuccess, Closure onFailure)  {
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
    def setCartCurrency ( String id, String currencyCode, Closure onSuccess, Closure onFailure)  {
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
    def setCartOwner ( String id, Integer userId, Closure onSuccess, Closure onFailure)  {
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
    def updateItemInCart ( String id, CartItemRequest cartItemRequest, Closure onSuccess, Closure onFailure)  {
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
    def updateShippingAddress ( String id, CartShippingAddressRequest cartShippingAddressRequest, Closure onSuccess, Closure onFailure)  {
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
}
