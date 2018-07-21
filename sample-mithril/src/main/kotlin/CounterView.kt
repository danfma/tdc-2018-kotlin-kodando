import kodando.mithril.*
import kodando.mithril.elements.button
import kodando.mithril.elements.div
import kodando.mithril.elements.span

object CounterView : View<CounterView.Props> {

  var count = 0
    private set

  interface Props : kodando.mithril.Props {
    var initialCount: Int
  }

  fun decrement() {
    count--
  }

  fun increment() {
    count++
  }

  override fun view(vnode: VNode<Props>): VNode<*>? {
    return root {
      div {
        button {
          type = "button"
          onClick = {
            increment()
          }
          content("-")
        }

        span {
          content(count)
        }

        button {
          type = "button"
          onClick = {
            decrement()
          }
          content("+")
        }
      }
    }
  }
}

fun Props.counter(initialCount: Int = 0, applier: Applier<CounterView.Props>) {
  addChild(CounterView) {
    this.initialCount = initialCount
    applier()
  }
}
