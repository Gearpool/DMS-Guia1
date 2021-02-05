fun main(args: Array<String>) {
    //var array: DoubleArray = DoubleArray(10) { 0.0 }
    var i = 0
    var j = 0
    var n = 0
    var p = 0
    var m = 0

    print("Cantidad de numeros a ingresar?")
    j = readLine()!!.toInt()
    for (i: Int in 0 until j) {
        print("Ingrese numero ${i + 1}: ")
        n = readLine()!!.toInt()
        if (n %2 == 0){
       p += 1
        }
        else{
            m += 1
        }
    }

    println("Hay ${p} pares")
    println("Hay ${m} impares")
}