package sample.view

import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

fun Element.div(configurer: HTMLDivElement.() -> Unit): HTMLDivElement {
  return (document.createElement("div") as HTMLDivElement)
    .also(configurer)
    .also {
      appendChild(it)
    }
}

fun Element.span(configurer: HTMLSpanElement.() -> Unit): HTMLSpanElement {
  return (document.createElement("span") as HTMLSpanElement)
    .also(configurer)
    .also {
      appendChild(it)
    }
}

fun Element.button(configurer: HTMLButtonElement.() -> Unit): HTMLButtonElement {
  return (document.createElement("button") as HTMLButtonElement)
    .also(configurer)
    .also {
      appendChild(it)
    }
}
