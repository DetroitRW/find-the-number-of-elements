import java.util.*

fun main(args: Array<String>) {
    val array = makeArrae()
    minMaxIndex(array)
}

fun printSum(min: Int, max: Int, array: IntArray) {
    var sum = 0
    for (i in min + 1..max - 1) {
        sum += array[i]
    }
    print(sum)
}

fun minMaxIndex(array: IntArray): IntArray {
    var min = 0
    var max = 0
    for (i in 0..array.size -1) {
        if (array[i] < array[min]) {
            min = i
        } else if (array[i] > array[max]) {
            max = i
        }
    }
    println()
    println("${array[min]}, ${array[max]}")
    if (min > max) {
        val i = min
        min = max
        max = i
    }
    printSum(min, max, array)
    return array
}

fun makeArrae(): IntArray {
    val array = IntArray(13)
    for (i in 0..array.size -1) {
        array[i] = Random(System.nanoTime()).nextInt(0, 101)
        print("${array[i]}, ")
    }
    return array
}
