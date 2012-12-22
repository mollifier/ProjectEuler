
/*
// 1000未満の3または5の倍数になっている数値の合計
var sum = 0
for (x <- 1 to 999) {
  if (x % 3 == 0 || x % 5 == 0) {
    sum += x
  }
}

println(sum)
//*/

val sum = (1 to 999).filter(x => x % 3 == 0 || x % 5 == 0).reduce((x, y) => x + y)
println(sum)

