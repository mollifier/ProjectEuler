
// 素数なら true
def isPrime(n: Int): Boolean = {
  if (n == 1) {
    return false
  }

  // 2 から n 未満の値ですべて割り切れない場合は true
  (2 until n).filter(x => n % x == 0).length == 0
}
// テスト
//println((1 to 10).map(x => x.toString + " " + isPrime(x).toString))

// n の素因数を返す
//def soinsu(n: Int): List[Int] = {
def soinsu(n: Int) = {
  (2 to n).filter(x => isPrime(x)).filter(x => n % x == 0)
  //(2 to n).filter(x => isPrime(x))
  //(2 to n)
}
// テスト
//println(soinsu(14))
//println(soinsu(13195))

val m = soinsu(13195).max

println(m)


