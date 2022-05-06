package exercicios

/*
1001	5,32
1324	6,45
6548	2,37
0987	5,32
7623	6,45
*/

fun main() {
    var exit = false
    var value = 0.0
    do {
        val products = mapOf(
            "1001" to 5.32,
            "1324" to 6.45,
            "6548" to 2.37,
            "0987" to 5.32,
            "7623" to 6.45
        )

        println("Codigo do produto:")
        val code: String = readLine().toString()
        println("Quantidade de produtos:")
        val number: Int = readLine().toString().toInt()

        val p: Double = products[code].toString().toDouble()
        value += p * number

        println("Add outro produto?\n1 -> SIM\n2 -> NAO")
        when (readLine().toString().toInt()) {
            1 -> exit = false
            2 -> exit = true
        }
    } while (!exit)

    println(value)
}