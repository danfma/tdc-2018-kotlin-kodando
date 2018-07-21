package viewmodel

import kodando.mobx.action
import kodando.mobx.observable

class Counter(count: Int = 0) {
  var count by observable(count)
    private set

  val decrement by action {
    this.count--
  }

  val increment by action {
    this.count++
  }
}
