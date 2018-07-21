package sample.presenter

interface CounterScreen {
  var presenter: CounterPresenter

  fun updateCounter(count: Int)
}
