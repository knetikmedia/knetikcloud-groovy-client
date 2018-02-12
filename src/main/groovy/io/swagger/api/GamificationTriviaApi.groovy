package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AnswerResource
import io.swagger.model.DeltaResource
import io.swagger.model.ImportJobResource
import io.swagger.model.PageResourceImportJobResource
import io.swagger.model.PageResourceQuestionResource
import io.swagger.model.PageResourceQuestionTemplateResource
import io.swagger.model.QuestionResource
import io.swagger.model.QuestionTemplateResource
import io.swagger.model.Result
import io.swagger.model.StringWrapper

import java.util.*;

@Mixin(ApiUtils)
class GamificationTriviaApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def addQuestionAnswers ( String questionId, AnswerResource answer, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{question_id}/answers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AnswerResource.class )
                    
    }
    def addQuestionTag ( String id, StringWrapper tag, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def addTagToQuestionsBatch ( StringWrapper tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filter_idset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filter_tag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filter_tagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filter_published", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filter_import_id", String.valueOf(filterImportId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Integer.class )
                    
    }
    def createImportJob ( ImportJobResource request, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ImportJobResource.class )
                    
    }
    def createQuestion ( QuestionResource question, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    QuestionResource.class )
                    
    }
    def createQuestionTemplate ( QuestionTemplateResource questionTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    QuestionTemplateResource.class )
                    
    }
    def deleteImportJob ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteQuestion ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteQuestionAnswers ( String questionId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{question_id}/answers/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteQuestionTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getImportJob ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ImportJobResource.class )
                    
    }
    def getImportJobs ( String filterVendor, String filterCategory, String filterName, String filterStatus, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterVendor)))
            queryParams.put("filter_vendor", String.valueOf(filterVendor))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterStatus)))
            queryParams.put("filter_status", String.valueOf(filterStatus))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceImportJobResource.class )
                    
    }
    def getQuestion ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    QuestionResource.class )
                    
    }
    def getQuestionAnswer ( String questionId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{question_id}/answers/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AnswerResource.class )
                    
    }
    def getQuestionAnswers ( String questionId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{question_id}/answers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    AnswerResource.class )
                    
    }
    def getQuestionDeltas ( Long since, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/delta"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(since)))
            queryParams.put("since", String.valueOf(since))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DeltaResource.class )
                    
    }
    def getQuestionTags ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def getQuestionTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    QuestionTemplateResource.class )
                    
    }
    def getQuestionTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceQuestionTemplateResource.class )
                    
    }
    def getQuestions ( Integer size, Integer page, String order, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterTag, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))
if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filter_idset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filter_tagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filter_tag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filter_published", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filter_import_id", String.valueOf(filterImportId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceQuestionResource.class )
                    
    }
    def getQuestionsCount ( String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/count"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filter_idset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filter_tag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filter_tagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filter_published", String.valueOf(filterPublished))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Long.class )
                    
    }
    def processImportJob ( Long id, Boolean publishNow, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import/{id}/process"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (publishNow == null) {
            throw new RuntimeException("missing required params publishNow")
        }

        if (!"null".equals(String.valueOf(publishNow)))
            queryParams.put("publish_now", String.valueOf(publishNow))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ImportJobResource.class )
                    
    }
    def removeQuestionTag ( String id, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}/tags/{tag}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (tag == null) {
            throw new RuntimeException("missing required params tag")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def removeTagToQuestionsBatch ( String tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/tags/{tag}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (tag == null) {
            throw new RuntimeException("missing required params tag")
        }

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filter_idset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filter_tag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filter_tagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filter_published", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filter_import_id", String.valueOf(filterImportId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    Integer.class )
                    
    }
    def searchQuestionTags ( String filterSearch, String filterCategory, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filter_import_id", String.valueOf(filterImportId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def updateImportJob ( Long id, ImportJobResource request, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/import/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ImportJobResource.class )
                    
    }
    def updateQuestion ( String id, QuestionResource question, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    QuestionResource.class )
                    
    }
    def updateQuestionAnswer ( String questionId, String id, AnswerResource answer, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/{question_id}/answers/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateQuestionTemplate ( String id, QuestionTemplateResource questionTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    QuestionTemplateResource.class )
                    
    }
    def updateQuestionsInBulk ( QuestionResource question, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/trivia/questions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filter_idset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filter_tagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filter_published", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filter_import_id", String.valueOf(filterImportId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Integer.class )
                    
    }
}
