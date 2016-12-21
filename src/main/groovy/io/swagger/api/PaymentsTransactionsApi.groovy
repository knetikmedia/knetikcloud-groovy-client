package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceTransactionResource
import io.swagger.model.RefundRequest
import io.swagger.model.RefundResource
import io.swagger.model.TransactionResource

import java.util.*;

@Mixin(ApiUtils)
class PaymentsTransactionsApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getTransactionUsingGET ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TransactionResource.class )
                    
    }
    def getTransactionsUsingGET ( Integer filterInvoice, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterInvoice)))
            queryParams.put("filterInvoice", String.valueOf(filterInvoice))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceTransactionResource.class )
                    
    }
    def refundTransactionUsingPOST ( Integer id, RefundRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions/{id}/refunds"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    RefundResource.class )
                    
    }
}
