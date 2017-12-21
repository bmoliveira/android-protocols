package com.broliveira.protocol

interface DateMillisecondsFormatter : DateFormatter {
  override val dateFormat: String
    get() = "MM/dd/yyyy HH:mm:ss.SSS"
}