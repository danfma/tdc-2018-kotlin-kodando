import kodando.react.dom.render
import kodando.react.root
import kotlin.browser.document

fun main(args: Array<String>) {
  val container = document.body?.querySelector("#application") ?: return

  val application = root {
    counter(0) {

    }
  }

  render(application, container)

  Module.hot?.accept()
}
