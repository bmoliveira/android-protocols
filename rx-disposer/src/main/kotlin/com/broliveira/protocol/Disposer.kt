package com.broliveira.protocol

import io.reactivex.disposables.CompositeDisposable

interface Disposer {
  val disposeBag: CompositeDisposable

  fun clearDisposeBag() {
    disposeBag.clear()
  }

  fun dispose() {
    disposeBag.dispose()
  }
}