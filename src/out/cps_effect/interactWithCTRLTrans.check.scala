class Snippet extends (Int => Int) {
  def apply(x1: Int): Int = {
    def x7(x5: Int): Int = {
      val x6 = println("B")
      1
    }
    val x10 = {
      val x3 = println("A")
      val x8 = x7(x1)
      val x9 = x7(x8)
      x9
    }
    val x11 = x10 + 5
    x11 /*exit: x11 */
  }
}
// output:
