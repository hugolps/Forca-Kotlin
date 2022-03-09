fun main() {

    // Instanciando o Objeto
    val word1 = Jogo("abacate", "Fruta favorita da Vovó Juju")

    //Começando o jogo
    while (!word1.endGame) {
        println("------- JOGO DA FORCA -------")
        println("Você tem ${word1.chances} tentativas")
        println("Dica: ${word1.hint}")
        println(word1.size())
        println(word1.distinctChar())
        println("Palavra Secreta: ${word1.printSecretWord()}")
        word1.askLetter(word1.secretWord)
    }
}