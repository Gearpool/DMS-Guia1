fun main(args: Array<String>) {
    //var array: DoubleArray = DoubleArray(10) { 0.0 }
    var i = 0
    var j = 0
    var x = 0
    var y = 0
    var n = 0
    var numero = 0
    var primero = 0
    var segundo = 0
    var tercero = 0
    var cuarto = 0

    print("Cantidad de puntos a ingresar?")
    n = readLine()!!.toInt()
    for (i: Int in 0 until n) {
        print("Ingrese valor de X:")
        x = readLine()!!.toInt()
        print("Ingrese valor de Y:" )
        y = readLine()!!.toInt()

        if(x > 0 && y > 0){
            primero =+1;
        }

        else if (x < 0 && y > 0) {
            segundo =+1;
        }

        else if (x < 0 && y < 0){
            tercero =+1;
        }

        else if(x > 0 && y < 0){
            cuarto =+1;
        }
        println("La coordenada ingresada es: ${x},${y}" )
    }
    println("La coordenada ingresada en primer cuadrante: ${primero}")
    println("La coordenada ingresada en segundo cuadrante: ${segundo}")
    println("La coordenada ingresada en tercero cuadrante: ${tercero}")
    println("La coordenada ingresada en cuarto cuadrante: ${cuarto}")
}