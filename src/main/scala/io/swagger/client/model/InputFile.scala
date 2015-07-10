package io.swagger.client.model

import org.joda.time.DateTime



case class InputFile (
  /* Unique identifier for the file. */
  id: String,
  /* How the file has been generated. */
  _type: String,
  /* The source of the file to be used that can be either, an external url. An identifier for an uploaded file to the server or an identifier for another job. */
  source: String,
  /* Filename of the file. */
  filename: String,
  /* Size of the file in bytes. */
  size: Integer,
  /* Date and time when the job was created. */
  created_at: DateTime,
  /* Date and time when the job was last modified. */
  modified_at: DateTime)
  
