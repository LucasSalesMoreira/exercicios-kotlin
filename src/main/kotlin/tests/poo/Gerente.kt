package tests.poo

class Gerente (
    nome: String,
    idade: Int,
    genero: Char,
    val setor: String,
    val anosDeGerencia: Int,
    val codigoDeGerencia: Int
) : Pessoa(nome, idade, genero) {
    val salario = 15000.00
}
