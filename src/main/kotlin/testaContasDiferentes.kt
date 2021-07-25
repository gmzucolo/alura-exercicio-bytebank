fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Gustavo",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Carol",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("salco poupanca: ${contaPoupanca.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após transacao corrente: ${contaCorrente.saldo}")
    println("salco após transacao poupanca: ${contaPoupanca.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo após transacao corrente: ${contaCorrente.saldo}")
    println("salco após transacao poupanca: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo após transacao corrente: ${contaCorrente.saldo}")
    println("salco após transacao poupanca: ${contaPoupanca.saldo}")
    println()
}