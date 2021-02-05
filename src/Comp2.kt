fun main(args: Array<String>) {
    var array: DoubleArray = DoubleArray(10) { 0.0 }
    //var i = 0
    var n: Double = 0.0;

    for (i: Int in 0 until 10) {

        do {
            print("Ingrese nota ${i + 1}: ")
            try {

                n = readLine()!!.toDouble()
                if (n < 0 || n > 10)
                    println("\nDebe ser entre 0 y 10 ")
            } catch (e: Exception) {
                println("\nNumero no valido")
                n = -1.0
            }
        } while (0 > n)

        array[i] = n

    }
    println("Hay ${array.filter { x -> x >= 7 }.size} aprobados ")
    println("Hay ${array.filter { x -> x < 7 }.size} reprobadas ")
}