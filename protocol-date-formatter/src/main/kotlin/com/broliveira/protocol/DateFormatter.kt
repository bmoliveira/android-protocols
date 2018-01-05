package com.broliveira.protocol

import android.annotation.TargetApi
import android.os.Build
import java.text.SimpleDateFormat
import java.util.*

interface DateFormatter {
  val dateFormat: String
    get() = "MM/dd/yyyy HH:mm:ss"

  private fun supportDateFormatter(format: String = dateFormat) =
      SimpleDateFormat(format, Locale.getAvailableLocales().first())

  @TargetApi(24)
  private fun dateFormatter(format: String = dateFormat) =
      android.icu.text.SimpleDateFormat(format)

  fun dateToString(date: Date?): String {
    if (date == null) return ""

    if (Build.VERSION.SDK_INT >= 24) {
      return dateFormatter().format(date)
    } else {
      return supportDateFormatter().format(date)
    }
  }

  fun dateFromString(dateString: String?): Date? {
    return _dateFromString(dateString)
  }

  private fun _dateFromString(dateString: String?, format: String = dateFormat,
                              shouldRetry: Boolean = true): Date? {
    try {
      if (Build.VERSION.SDK_INT >= 24)
        return dateFormatter(format).parse(dateString)
      else
        return supportDateFormatter(format).parse(dateString)
    } catch (ignored: Throwable) {
      return if (shouldRetry) tryToGuessTheDateFormat(dateString, format) else null
    }
  }

  /**
   * This function is trying to parse with "-" when "/" fails because
   * the backend is sending the dates with "-" and expecting to receive
   * with "/", so we try our best to keep up with the server problems
   */
  private fun tryToGuessTheDateFormat(dateString: String?, format: String) : Date? {
    if (dateFormat.contains("/"))
      return _dateFromString(dateString = dateString, format = format.replace("/", "-"),
          shouldRetry =  false)
    return null
  }
}
