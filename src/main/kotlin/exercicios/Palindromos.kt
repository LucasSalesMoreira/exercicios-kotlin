package exercicios

/*
* Faça um programa que leia uma string do teclado e diga se ela é palíndromo.
* Uma string é palíndromo quando pode ser lida tanto de trás pra frente quanto
* de frente para trás e possui exatamente a mesma sequência de caracteres.
* Considere no desenvolvimento apenas palavras palíndromos.
*/

fun main() {
    println("Palavra:")
    val p: String = readLine().toString()
    println(p.lowercase().equals(reverce(p.lowercase())))
}

fun reverce(str: String): String {
    var newStr = ""
    var count = str.length - 1
    while (count >= 0) {
        newStr += str[count]
        count--
    }
    return newStr
}