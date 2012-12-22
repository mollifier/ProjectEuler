
def isWarikireru(n: Int, max: Int): Boolean = {
  (1 to max).forall(x => n % x == 0)
}

println(isWarikireru(2521, 10))

