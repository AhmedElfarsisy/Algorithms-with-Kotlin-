

/**
 *
 * @author Elfarsisy
 */

fun main(args: Array<String>) {
    println("Enter Array Size !!")
    var arraySize: Int = readLine()!!.toInt()

    var array = Array<Int>(arraySize) { 0 }

    for (j in 0..array.size - 1) {
        // read array element
        println("Enter Element $j:")
        array[j] = readLine()!!.toInt()
    }
    var min: Int = 0
    var temp: Int = 0
    for (i in 0..arraySize - 2) {
        min = i
        for (j in i + 1..arraySize-1) {
            if (array[min] > array[j]) {
                min = j
            }
        }
        temp = array[min]
        array[min] = array[i]
        array[i] = temp


    }
    //print sorted array
    for (x in 0..arraySize-1){
        print("," + (array[x]) )
    }

}

