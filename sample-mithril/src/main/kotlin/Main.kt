import kodando.mithril.mount
import kodando.mithril.root
import kotlin.browser.document

fun main(args: Array<String>) {
  val container = document.body?.querySelector("#application") ?: return

  val application = root {
    counter(0) {

    }
  }

  mount(container, CounterView)

  Module.hot?.accept()
}
