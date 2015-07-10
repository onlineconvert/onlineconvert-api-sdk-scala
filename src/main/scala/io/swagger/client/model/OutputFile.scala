package io.swagger.client.model

import io.swagger.client.model.Any
import org.joda.time.DateTime



case class OutputFile (
  /* Unique identifier for the file. */
  id: String,
  /* Sources for the files including the input files and conversion used. */
  source: Any,
  /* Url for downloading the file. */
  uri: String,
  /* Filename of the file. */
  filename: String,
  /* Size of the file in bytes. */
  size: Integer,
  /* Date and time when the job was created. */
  created_at: DateTime)
  
