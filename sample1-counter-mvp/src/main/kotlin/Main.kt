import sample.presenter.CounterPresenter
import sample.view.CounterView
import kotlin.browser.document

fun main(args: Array<String>) {
  val container = document.body ?: return
  val view = CounterView(container)
  val presenter = CounterPresenter()

  presenter.attach(view)
}
