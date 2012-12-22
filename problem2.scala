
def isPrime(n: Int): Boolean = {
  if (n == 1) {
    return false
  } else if (n == 2) {
    return true
  }

  // 2 から n 未満の値ですべて割り切れない場合は true
  (2 until n).filter(x => n % x == 0).length == 0
}

def soinsu(n: Int): List[Int] = {
  List(1, 2, 3)
}

val m = soinsu(10).max

println((1 to 10).map(x => x.toString + " " + isPrime(x).toString))

