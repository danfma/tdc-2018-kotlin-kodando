package sample.presenter

import sample.model.Counter

class CounterPresenter {
  private val model = Counter()
  private lateinit var screen: CounterScreen

  fun attach(screen: CounterScreen) {
    this.screen = screen
    screen.presenter = this
    updateCounter()
  }

  fun increment() {
    model.increment()
    updateCounter()
  }

  fun decrement() {
    model.decrement()
    updateCounter()
  }

  private fun updateCounter() {
    screen.updateCounter(model.count)
  }
}
