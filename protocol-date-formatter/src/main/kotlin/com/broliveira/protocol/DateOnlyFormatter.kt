package com.broliveira.protocol

interface DateOnlyFormatter : DateFormatter {
  override val dateFormat: String
      get() = "yyyy/MM/dd"
}
