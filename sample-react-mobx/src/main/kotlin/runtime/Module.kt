package runtime

@JsName("module")
external object Module {
  val hot: HotConfiguration?
}

external interface HotConfiguration {
  fun accept()
}
