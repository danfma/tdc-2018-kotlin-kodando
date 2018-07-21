package sample.model

class Counter {
  var count = 0
    private set

  fun increment() {
    count++
  }

  fun decrement() {
    count--
  }
}
