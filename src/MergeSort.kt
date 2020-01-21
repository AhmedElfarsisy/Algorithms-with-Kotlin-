/**
 *
 * @author Elfarsisy
 */
fun main(args: Array<String>) {
    //Merge sort with Kotlin
    print(" enter array size")
    var arraySize: Int = readLine()!!.toInt()
    var array = Array<Int>(arraySize) {0}


    for (j in 0..array.size - 1) {
        // read array element
        println("Enter Element $j:")
        array[j] = readLine()!!.toInt()
    }

    //pass array & start index & last index to mergeSort funcation
    mergeSort(array, 0, array.size-1)

    //print sorted array
    for (x in 0..array.size - 1) {
        print("," + (array[x]))
    }


}

//Algorithm implementation
fun mergeSort(A: Array<Int>, p: Int, r: Int) {
    if (p < r) {
        var q: Int = (p + r) / 2
        mergeSort(A, p, q)
        mergeSort(A, q + 1, r)
        merge(A, p, q, r)
    }

}

fun merge(A: Array<Int>, p: Int, q: Int, r: Int) {
    var n1: Int = q - p + 1
    var n2: Int = r - q
    var L = Array<Int>(n1 + 1) {0}
    var R = Array<Int>(n2 + 1) {0}
    for (i in 0..n1 - 1) {
        L[i] = A[p + i]
    }
    for (j in 0..n2 - 1) {
        R[j] = A[q + j + 1]
    }

    //             L[n1+1]=∞
    L[n1] = 2147483647
//              R[n2+1]=∞
    R[n2] = 2147483647

    var i = 0
    var j = 0
    var k = p
    for (k in k..r) {
        if (L[i] <= R[j]) {
            A[k] = L[i]
            i++
        } else {
            A[k] = R[j]
            j++
        }

    }

}



