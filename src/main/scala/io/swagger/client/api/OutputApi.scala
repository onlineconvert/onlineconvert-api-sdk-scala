package io.swagger.client.api

import io.swagger.client.model.OutputFile
import io.swagger.client.model.Error
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class OutputApi(val defBasePath: String = "http://api2.online-convert.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get list of converted.
   * 
   * @param conversionId 
   * @param inputId 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List[OutputFile]
   */
  def jobsJobIdOutputGet (conversionId: String, inputId: String, xOcToken: String, xOcApiKey: String, jobId: String) : Option[List[OutputFile]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/output".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(conversionId) != "null") queryParams += "conversion_id" -> conversionId.toString
    if(String.valueOf(inputId) != "null") queryParams += "input_id" -> inputId.toString
    
    
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
           Some(ApiInvoker.deserialize(s, "array", classOf[OutputFile]).asInstanceOf[List[OutputFile]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get information about an output file source.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return List[OutputFile]
   */
  def jobsJobIdOutputFileIdGet (xOcToken: String, xOcApiKey: String, jobId: String, fileId: String) : Option[List[OutputFile]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

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
           Some(ApiInvoker.deserialize(s, "array", classOf[OutputFile]).asInstanceOf[List[OutputFile]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Deletes a file from the output.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @return List[OutputFile]
   */
  def jobsJobIdOutputFileIdDelete (xOcToken: String, xOcApiKey: String, jobId: String, fileId: String) : Option[List[OutputFile]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

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
           Some(ApiInvoker.deserialize(s, "array", classOf[OutputFile]).asInstanceOf[List[OutputFile]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
