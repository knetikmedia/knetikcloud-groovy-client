package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AnswerResource
import io.swagger.model.Collectionstring
import io.swagger.model.DeltaResource
import io.swagger.model.ImportJobResource
import io.swagger.model.PageResourceImportJobResource
import io.swagger.model.PageResourceQuestionResource
import io.swagger.model.PageResourceQuestionTemplateResource
import io.swagger.model.QuestionResource
import io.swagger.model.QuestionTemplateResource

import java.util.*;

@Mixin(ApiUtils)
class GamificationTriviaApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def addQuestionAnswers ( String questionId, AnswerResource answer, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{question_id}/answers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AnswerResource.class )
                    
    }
    def addQuestionTag ( String id, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{id}/tags"

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
    def addTagToQuestionsBatch ( String tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filterIdset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filterTag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filterImportId", String.valueOf(filterImportId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Integer.class )
                    
    }
    def createImportJob ( ImportJobResource request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/import"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ImportJobResource.class )
                    
    }
    def createQuestion ( QuestionResource question, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    QuestionResource.class )
                    
    }
    def createQuestionTemplate ( QuestionTemplateResource questionTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    QuestionTemplateResource.class )
                    
    }
    def deleteImportJob ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/import/{id}"

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
    def deleteQuestion ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{id}"

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
    def deleteQuestionAnswers ( String questionId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteQuestionTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getImportJob ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/import/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ImportJobResource.class )
                    
    }
    def getImportJobs ( String filterVendor, String filterCategory, String filterName, String filterStatus, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/import"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterVendor)))
            queryParams.put("filterVendor", String.valueOf(filterVendor))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterStatus)))
            queryParams.put("filterStatus", String.valueOf(filterStatus))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceImportJobResource.class )
                    
    }
    def getQuestion ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    QuestionResource.class )
                    
    }
    def getQuestionAnswer ( String questionId, String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AnswerResource.class )
                    
    }
    def getQuestionAnswers ( String questionId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{question_id}/answers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (questionId == null) {
            throw new RuntimeException("missing required params questionId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    AnswerResource.class )
                    
    }
    def getQuestionDeltas ( Long since, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/delta"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(since)))
            queryParams.put("since", String.valueOf(since))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DeltaResource.class )
                    
    }
    def getQuestionTags ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{id}/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def getQuestionTags1 ( String filterSearch, String filterCategory, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filterImportId", String.valueOf(filterImportId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Collectionstring.class )
                    
    }
    def getQuestionTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    QuestionTemplateResource.class )
                    
    }
    def getQuestionTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceQuestionTemplateResource.class )
                    
    }
    def getQuestions ( Integer size, Integer page, String order, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filterIdset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filterImportId", String.valueOf(filterImportId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceQuestionResource.class )
                    
    }
    def getQuestionsCount ( String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/count"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filterIdset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filterTag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Long.class )
                    
    }
    def processImportJob ( Long id, Boolean publishNow, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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
            queryParams.put("publishNow", String.valueOf(publishNow))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ImportJobResource.class )
                    
    }
    def removeQuestionTag ( String id, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def removeTagToQuestionsBatch ( String tag, String filterSearch, String filterIdset, String filterCategory, String filterTag, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/tags/{tag}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (tag == null) {
            throw new RuntimeException("missing required params tag")
        }

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filterIdset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filterTag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filterImportId", String.valueOf(filterImportId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    Integer.class )
                    
    }
    def updateImportJob ( Long id, ImportJobResource request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/import/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ImportJobResource.class )
                    
    }
    def updateQuestion ( String id, QuestionResource question, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    QuestionResource.class )
                    
    }
    def updateQuestionAnswer ( String questionId, String id, AnswerResource answer, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateQuestionTemplate ( String id, QuestionTemplateResource questionTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions/templates/{id}"

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
    def updateQuestionsInBulk ( QuestionResource question, String filterSearch, String filterIdset, String filterCategory, String filterTagset, String filterType, Boolean filterPublished, Long filterImportId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/trivia/questions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(filterIdset)))
            queryParams.put("filterIdset", String.valueOf(filterIdset))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterPublished)))
            queryParams.put("filterPublished", String.valueOf(filterPublished))
if (!"null".equals(String.valueOf(filterImportId)))
            queryParams.put("filterImportId", String.valueOf(filterImportId))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Integer.class )
                    
    }
}
