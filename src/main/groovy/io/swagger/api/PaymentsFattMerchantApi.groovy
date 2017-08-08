package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FattMerchantPaymentMethodRequest
import io.swagger.model.PaymentMethodResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class PaymentsFattMerchantApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createOrUpdateFattMerchantPaymentMethod ( FattMerchantPaymentMethodRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/payment/provider/fattmerchant/payment-methods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    PaymentMethodResource.class )
                    
    }
}
