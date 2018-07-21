package sample.view

import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import sample.presenter.CounterPresenter
import sample.presenter.CounterScreen

class CounterView(private val container: Element) : CounterScreen {
  private lateinit var spanElement: HTMLSpanElement

  override lateinit var presenter: CounterPresenter

  init {
    container.apply {
      div {
        button {
          type = "button"
          textContent = "-"
          onclick = {
            presenter.decrement()
          }
        }

        spanElement = span {
          textContent = ""
        }

        button {
          type = "button"
          textContent = "+"
          onclick = {
            presenter.increment()
          }
        }
      }
    }
  }

  override fun updateCounter(count: Int) {
    spanElement.textContent = "$count"
  }
}
