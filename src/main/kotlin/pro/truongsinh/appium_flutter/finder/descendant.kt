@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package pro.truongsinh.appium_flutter.finder

fun descendant(of: FlutterElement, matching: FlutterElement, matchRoot: Boolean = false, firstMatchOnly: Boolean = false): FlutterElement {
  val m = mutableMapOf(
    "finderType" to "Descendant",
    "matchRoot" to matchRoot,
    "firstMatchOnly" to firstMatchOnly
  )
  of.getRawMap().forEach {
    m["of_${it.key}"] = it.value!! as String
  }
  matching.getRawMap().forEach {
    m["matching_${it.key}"] = it.value!! as String
  }
  return FlutterElement(m)
}
