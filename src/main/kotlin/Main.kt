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

    for (i in 1..12) {
        if (a[i] < a[min]) {
            min = i
        } else if (a[i] > a[max]) {
            max = i
        }
    }
    println("${a[min]}, ${a[max]}")

    if (min > max) {
        var i = 1
        i = min
        min = max
        max = i
    }

    for (i in min + 1..max - 1) {
        sum += a[i]
    }
    print(sum)
}