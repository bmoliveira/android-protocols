package com.broliveira.protocol

interface BackableFragment {
  /**
   * @return True if was successfully handled and there is no need to call super
   */
  fun onBackPress(): Boolean
}