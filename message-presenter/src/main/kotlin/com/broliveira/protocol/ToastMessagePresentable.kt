package com.broliveira.protocol

import android.content.Context
import android.widget.Toast

interface ToastMessagePresentable: MessagePresentable {
  override fun getContext(): Context?

  override fun showMessage(message: String) {
    Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show()
  }

  override fun showFailure(throwable: Throwable) {
    Toast.makeText(getContext(), throwable.localizedMessage, Toast.LENGTH_LONG).show()
  }
}
