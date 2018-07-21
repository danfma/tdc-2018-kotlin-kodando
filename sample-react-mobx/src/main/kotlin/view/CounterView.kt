package view

import kodando.mobx.react.makeObserver
import kodando.react.*
import kodando.react.dom.*
import org.w3c.dom.HTMLButtonElement
import viewmodel.Counter

class CounterView : Component<CounterView.Props, Unit>() {

  interface Props : ReactProps {
    var counter: Counter
  }

  private val decrement: MouseEventHandler<HTMLButtonElement> = {
    props.counter.decrement()
  }

  private val increment: MouseEventHandler<HTMLButtonElement> = {
    props.counter.increment()
  }

  override fun render(): ReactNode? {
    return root {
      div {
        h1 {
          add("React + Mobx")
        }

        button {
          type = "button"
          onClick = increment
          add("-")
        }

        span {
          add(props.counter.count)
        }

        button {
          type = "button"
          onClick = decrement
          add("+")
        }
      }
    }
  }

  companion object {
    val type = makeObserver(CounterView::class)
  }

}

fun ReactProps.counter(counter: Counter, configurer: Configurer<CounterView.Props>) {
  addComponent(CounterView.type) {
    this.counter = counter
    configurer()
  }
}
