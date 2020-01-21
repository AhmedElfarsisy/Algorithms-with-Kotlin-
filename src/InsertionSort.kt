

/**
 *
 * @author Elfarsisy
 */

fun main (args: Array<String>){
    //Insertion sort with Kotlin

    println("Enter Array Size !!")
    var arraySize: Int = readLine()!!.toInt()

    var array = Array<Int>(arraySize) { 0 }

    for (j in 0..array.size - 1) {
    // read array element
        println("Enter Element $j:")
        array[j] = readLine()!!.toInt()
    }

    var key: Int = 0
    for (j in 1..arraySize - 1) {
        key = array[j]
        var i = j - 1
        while (i >= 0 && key < array[i]) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = key
    }

    //print sorted array
        for (x in 0..arraySize-1){
            print("," + (array[x]) )
        }


    }
