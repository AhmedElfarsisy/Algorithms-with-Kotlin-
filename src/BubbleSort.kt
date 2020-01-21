/**
 *
 * @author Elfarsisy
 */

fun main(args: Array<String>) {
    //Bubble sort with Kotlin


    println("Enter Array !!")
    var arraySize: Int = readLine()!!.toInt()

    var array = Array<Int>(arraySize) { 0 }

    for (j in 0..array.size - 1) {
        // read array element
        println("Enter Element $j:")
        array[j] = readLine()!!.toInt()
    }
//Algorithm implementation
    var temp: Int = 0
    for (i in 0..arraySize - 2) {
        for (j in arraySize - 1 downTo (i + 1)) {
            if (array[j - 1] > array[j]) {
                temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
        }
    }
    //print sorted array
    for (x in 0..arraySize - 1) {
        print("," + (array[x]))
    }
}