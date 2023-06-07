@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package pro.truongsinh.appium_flutter.finder

fun ancestor(of: FlutterElement, matching: FlutterElement, matchRoot: Boolean = false, firstMatchOnly: Boolean = false): FlutterElement {
  val m = mutableMapOf(
    "finderType" to "Ancestor",
    "matchRoot" to matchRoot,
    "firstMatchOnly" to firstMatchOnly
  )
  of.getRawMap().forEach {
    m.put("of_${it.key}", it.value!! as String)
  }
  matching.getRawMap().forEach {
    m.put("matching_${it.key}", it.value!! as String)
  }
  return FlutterElement(m)
}
