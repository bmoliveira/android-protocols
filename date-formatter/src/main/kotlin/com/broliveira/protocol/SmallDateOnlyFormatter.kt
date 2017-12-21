package com.broliveira.protocol

interface SmallDateOnlyFormatter : DateFormatter {
  override val dateFormat: String
      get() = "dd/MM/yy"
}
