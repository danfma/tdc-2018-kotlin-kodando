import kodando.react.dom.render
import kodando.react.root
import runtime.Module
import view.counter
import viewmodel.Counter
import kotlin.browser.document

fun main(args: Array<String>) {
  val container = document.body?.querySelector("#application") ?: return

  val counter = Counter(0)

  val application = root {
    counter(counter) {

    }
  }

  render(application, container)

  Module.hot?.accept()
}
