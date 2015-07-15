package io.swagger.client.api

import io.swagger.client.model.InputFile
import io.swagger.client.model.Error
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class InputApi(val defBasePath: String = "http://api2.online-convert.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get list of binary source files for the conversion.hhh
   * Description of the get for the inputs of a specific job.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List[InputFile]
   */
  def jobsJobIdInputGet (xOcToken: String, xOcApiKey: String, jobId: String) : Option[List[InputFile]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "X-Oc-Token" -> xOcToken
    headerParams += "X-Oc-Api-Key" -> xOcApiKey
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[InputFile]).asInstanceOf[List[InputFile]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Cretes a new input for the current job.
   * 
   * @param body 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return InputFile
   */
  def jobsJobIdInputPost (body: InputFile, xOcToken: String, xOcApiKey: String, jobId: String) : Option[InputFile] = {
    // create path and map variables
    val path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "X-Oc-Token" -> xOcToken
    headerParams += "X-Oc-Api-Key" -> xOcApiKey
    

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
           Some(ApiInvoker.deserialize(s, "", classOf[InputFile]).asInstanceOf[InputFile])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get list of conversions defined for the current job.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return InputFile
   */
  def jobsJobIdInputFileIdGet (xOcToken: String, xOcApiKey: String, jobId: String, fileId: String) : Option[InputFile] = {
    // create path and map variables
    val path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    .replaceAll("\\{" + "file_id" + "\\}",apiInvoker.escape(fileId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "X-Oc-Token" -> xOcToken
    headerParams += "X-Oc-Api-Key" -> xOcApiKey
    

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
           Some(ApiInvoker.deserialize(s, "", classOf[InputFile]).asInstanceOf[InputFile])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Removes the input for a job.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return InputFile
   */
  def jobsJobIdInputFileIdDelete (xOcToken: String, xOcApiKey: String, jobId: String, fileId: String) : Option[InputFile] = {
    // create path and map variables
    val path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    .replaceAll("\\{" + "file_id" + "\\}",apiInvoker.escape(fileId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    headerParams += "X-Oc-Token" -> xOcToken
    headerParams += "X-Oc-Api-Key" -> xOcApiKey
    

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
           Some(ApiInvoker.deserialize(s, "", classOf[InputFile]).asInstanceOf[InputFile])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
