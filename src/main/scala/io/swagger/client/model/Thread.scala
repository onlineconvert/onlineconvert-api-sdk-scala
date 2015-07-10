package io.swagger.client.model

import org.joda.time.DateTime



case class Thread (
  /* Unique identifier of the thread. */
  hash: String,
  /* Status of the thread. */
  status: Integer,
  /* Extra information. */
  info: String,
  /* Date and time when the job was created. */
  created_at: DateTime,
  /* Date and time when the job was last modified. */
  modified_at: DateTime)
  
