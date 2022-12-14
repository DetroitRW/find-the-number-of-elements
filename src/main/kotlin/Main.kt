import java.util.*

fun main(args: Array<String>) {

    val a = IntArray(13)
    var min = 0
    var max = 0
    var sum = 0

    for (i in 0..12) {
        a[i] = Random(System.nanoTime()).nextInt(0, 101)
        print("${a[i]}, ")
    }
    println()
}