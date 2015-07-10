package io.swagger.client.api

import io.swagger.client.model.Job
import io.swagger.client.model.Number
import io.swagger.client.model.Error
import io.swagger.client.model.Thread
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class JobsApi(val defBasePath: String = "http://api2.online-convert.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * List of jobs active for the current user identified by the key.
   * It will return the list of jobs for the given user. In order to get the jobs a key or token must be provided:\n  - If the user key is provided all jobs for the current will be return.\n  - If one token is provided it will return the job assigned to that token if any.\n  \nThe request is paginated with an amount of 50 elements per page in any case.\n
   * @param status Filter the status of the job.
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param page Pagination for list of elements.
   * @return List[Job]
   */
  def jobsGet (status: String, token: String, key: String, page: Number /* = 1 */) : Option[List[Job]] = {
    // create path and map variables
    val path = "/jobs".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(status) != "null") queryParams += "status" -> status.toString
    if(String.valueOf(page) != "null") queryParams += "page" -> page.toString
    
    
    headerParams += "token" -> token
    headerParams += "key" -> key
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Job]).asInstanceOf[List[Job]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Creates a new Job with the user key.
   * 
   * @param key Api key for the user to filter.
   * @param body Content of the job.
   * @return Job
   */
  def jobsPost (key: String, body: Job) : Option[Job] = {
    // create path and map variables
    val path = "/jobs".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "key" -> key
    

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Job]).asInstanceOf[Job])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get information about a Job
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  def jobsJobIdGet (token: String, key: String, jobId: String) : Option[Job] = {
    // create path and map variables
    val path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "token" -> token
    headerParams += "key" -> key
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Job]).asInstanceOf[Job])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Cancels a job created that haven&#39;t been started. (Allow to cancel jobs in process.)
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  def jobsJobIdDelete (token: String, key: String, jobId: String) : Option[Job] = {
    // create path and map variables
    val path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "token" -> token
    headerParams += "key" -> key
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Job]).asInstanceOf[Job])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Modifies the job identified by the id, allows to start a created job.
   * 
   * @param body Content of the job.
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Job
   */
  def jobsJobIdPatch (body: Job, token: String, key: String, jobId: String) : Option[Job] = {
    // create path and map variables
    val path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "token" -> token
    headerParams += "key" -> key
    

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PATCH", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Job]).asInstanceOf[Job])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get list of threads defined for the current job.
   * 
   * @param token Token for authentication.
   * @param key Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List[Thread]
   */
  def jobsJobIdThreadsGet (token: String, key: String, jobId: String) : Option[List[Thread]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/threads".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "token" -> token
    headerParams += "key" -> key
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Thread]).asInstanceOf[List[Thread]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
