
//def reverseValue(n: Int): Int = {
def reverseValue(n: Int) = {
  val orgString = n.toString
  val ketasu = orgString.length
  val reverseString = (0 until ketasu).map(i => orgString.charAt(i).toString()).reverse.reduce((x, y) => x + y)

  reverseString
}
//println(reverseValue(123))

def isKaibun(n: Int): Boolean = {
  n.toString == reverseValue(n)
}
//println(isKaibun(123))
//println(isKaibun(123321))

//val m = (10 to 99).map(x => {(10 to 99).map(y => x * y)} ).flatten.filter(x => isKaibun(x)).max
//val m = (100 to 999).map(x => {(100 to 999).map(y => x * y)} ).filter(x => isKaibun(x)).max

var m = 0
for (x <- (100 to 999)) {
  var tmpList = (100 to 999).map(y => x * y).filter(z => isKaibun(z))
  if (tmpList.length > 0) {
    var tmpMax = tmpList.max
    if (tmpMax > m) {
      m = tmpMax
    }
  }
}

println(m)

