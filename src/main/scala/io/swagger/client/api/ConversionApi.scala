package io.swagger.client.api

import io.swagger.client.model.Conversion
import io.swagger.client.model.Error
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ConversionApi(val defBasePath: String = "http://api2.online-convert.com/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get list of conversions defined for the current job.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return List[Conversion]
   */
  def jobsJobIdConversionsGet (xOcToken: String, xOcApiKey: String, jobId: String) : Option[List[Conversion]] = {
    // create path and map variables
    val path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Conversion]).asInstanceOf[List[Conversion]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Adds a new conversion to the given job.
   * 
   * @param body information for the conversion.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @return Conversion
   */
  def jobsJobIdConversionsPost (body: Conversion, xOcToken: String, xOcApiKey: String, jobId: String) : Option[Conversion] = {
    // create path and map variables
    val path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    

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
           Some(ApiInvoker.deserialize(s, "", classOf[Conversion]).asInstanceOf[Conversion])
         
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
   * @param conversionId Identifier for the job conversion.
   * @return Conversion
   */
  def jobsJobIdConversionsConversionIdGet (xOcToken: String, xOcApiKey: String, jobId: String, conversionId: String) : Option[Conversion] = {
    // create path and map variables
    val path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    .replaceAll("\\{" + "conversion_id" + "\\}",apiInvoker.escape(conversionId))

    

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
           Some(ApiInvoker.deserialize(s, "", classOf[Conversion]).asInstanceOf[Conversion])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Removes the conversion for a job.
   * 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param jobId ID of job that needs to be fetched
   * @param conversionId Identifier for the job conversion.
   * @return Conversion
   */
  def jobsJobIdConversionsConversionIdDelete (xOcToken: String, xOcApiKey: String, jobId: String, conversionId: String) : Option[Conversion] = {
    // create path and map variables
    val path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}",apiInvoker.escape(jobId))

    .replaceAll("\\{" + "conversion_id" + "\\}",apiInvoker.escape(conversionId))

    

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
           Some(ApiInvoker.deserialize(s, "", classOf[Conversion]).asInstanceOf[Conversion])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
