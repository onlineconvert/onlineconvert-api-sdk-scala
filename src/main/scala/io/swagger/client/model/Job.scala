package io.swagger.client.model

import io.swagger.client.model.Status
import org.joda.time.DateTime
import io.swagger.client.model.Conversion
import io.swagger.client.model.InputFile



case class Job (
  /* Unique identifier for the job. */
  id: String,
  /* Token to identify client allowed to run the job. */
  token: String,
  /* Type of the job created. */
  _type: String,
  /* Current status for the job */
  status: Status,
  /* Determine if the job must be processed as soon as it is ready. */
  process: Boolean,
  /* Determine if it is a test job. */
  test: Boolean,
  /* Type of conversion or conversions to be carried out. */
  conversion: List[Conversion],
  /* Source or sources of the files to be converted. */
  input: List[InputFile],
  /* Callback url to the the status updates */
  callback: String,
  /* Server assigned for file uploads and downloads */
  server: String,
  /* Date and time when the job was created. */
  created_at: DateTime,
  /* Date and time when the job was last modified. */
  modified_at: DateTime)
  
