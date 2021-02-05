fun main(args: Array<String>) {
    var a: Int = 0
    var b: Int = 0
    var r: Int

    print("Ingrese el primer numero:")
    a = readLine()!!.toInt()

    print("Ingrese el primer numero:")
    b = readLine()!!.toInt()

    r = a % b
    if (r==0)
        println(" $a es divisible entre $b ")
    else
        println("$a NO ES divisible entre $b")
}