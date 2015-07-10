package io.swagger.client.model

import io.swagger.client.model.Any



case class Conversion (
  /* Identifier for the job conversion. */
  id: String,
  /* Identifier for the job conversion type. */
  target: String,
  /* Category for the conveted file. */
  category: String,
  /* Type of conversion to perform with the file. */
  options: Any)
  
