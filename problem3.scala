
// 素数なら true
def isPrime(n: Long): Boolean = {
//def isPrime(n: Int): Boolean = {
  if (n == 1) {
    return false
  }

  // 2 から n 未満の値ですべて割り切れない場合は true
  // 2 から n 未満の値で一つでも割り切れた場合は false

  var i = 2
  while (i < n) {
    if (n % i == 0) {
      return false
    }

    i += 1
  }

  return true
}
// テスト
//println((1 to 20).map(x => x.toString + " " + isPrime(x).toString))
//println((1L to 600851475143L).map(x => x.toString + " " + isPrime(x).toString))


// n の最大の素因数を返す
def maxSoinsu(n: Long): Long = {

  var m = 1

  var i = 2
  while (i <= n) {
    if (n % i == 0 && isPrime(i)) {
      m = i
    }

    i += 1
  }

  m
}

//val m = maxSoinsu(34)
//val m = maxSoinsu(13195)
val m = maxSoinsu(600851475143L)

println(m)

