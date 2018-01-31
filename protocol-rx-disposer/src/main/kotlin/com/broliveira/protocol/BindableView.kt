package com.broliveira.protocol

import io.reactivex.disposables.CompositeDisposable

interface BindableView {
  val disposeBag: CompositeDisposable

  /**
   * Function to setup the views currentValues.
   */
  fun bindValues()

  /**
   * Bind the UIComponent streams to ViewModel.
   */
  fun bindUIComponents()
}
