package com.broliveira.protocol

import android.content.Context
import android.widget.Toast

interface MessagePresentable {
  fun getContext(): Context?
  fun showMessage(message: String)
  fun showFailure(throwable: Throwable)
}
