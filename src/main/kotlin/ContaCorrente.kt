class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor * 1.01
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}