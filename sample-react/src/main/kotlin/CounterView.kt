import kodando.react.*
import kodando.react.dom.MouseEventHandler
import kodando.react.dom.button
import kodando.react.dom.div
import kodando.react.dom.span
import org.w3c.dom.HTMLButtonElement

class CounterView : Component<CounterView.Props, CounterView.State>() {

  interface Props : ReactProps {
    var initialCount: Int
  }

  class State(
    val count: Int
  )

  init {
    state = State(0)
  }

  private val decrement: MouseEventHandler<HTMLButtonElement> = {
    setState { state, _ ->
      State(state.count - 1)
    }
  }

  private val increment: MouseEventHandler<HTMLButtonElement> = {
    setState { state, _ ->
      State(state.count + 1)
    }
  }

  override fun componentWillReceiveProps(nextProps: Props) {
    setState(State(nextProps.initialCount))
  }

  override fun render(): ReactNode? {
    return root {
      div {
        button {
          type = "button"
          onClick = increment
          add("-")
        }

        span {
          add(state.count)
        }

        button {
          type = "button"
          onClick = decrement
          add("+")
        }
      }
    }
  }
}

fun ReactProps.counter(initialCount: Int = 0, configurer: Configurer<CounterView.Props>) {
  addComponent(CounterView::class) {
    this.initialCount = initialCount
    configurer()
  }
}
