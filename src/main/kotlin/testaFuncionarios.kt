fun testaFuncionarios() {
    val gustavo = Analista(
        nome = "Gustavo",
        cpf = "000.000.000-01",
        salario = 1000.0
    )

    println("nome: ${gustavo.nome}")
    println("cpf: ${gustavo.cpf}")
    println("salario: ${gustavo.salario}")
    println("bonicacao: ${gustavo.bonificacao}")
    println()

    val carol = Gerente(
        nome = "Carol",
        cpf = "000.000.000-02",
        salario = 3000.0,
        senha = 3000
    )

    println("nome: ${carol.nome}")
    println("cpf: ${carol.cpf}")
    println("salario: ${carol.salario}")
    println("bonificacao: ${carol.bonificacao}")

    if (carol.autentica(senha = 2000)) {
        println("autenticado com sucesso")
    } else {
        println("falha na autenticacao")
    }

    println()

    val rico = Diretor(
        nome = "Rico",
        cpf = "000.000.000-03",
        salario = 4000.0,
        senha = 4000,
        plr = 1000.0
    )

    println("nome: ${rico.nome}")
    println("cpf: ${rico.cpf}")
    println("salario: ${rico.salario}")
    println("bonificacao: ${rico.bonificacao}")
    println("plr: ${rico.plr}")

    if (rico.autentica(senha = 4000)) {
        println("autenticado com sucesso")
    } else {
        println("falha na autenticacao")
    }
    println()

    val thiago = Analista(
        nome = "Thiago",
        cpf = "000.000.000-04",
        salario = 2000.0
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(gustavo)
    calculadora.registra(carol)
    calculadora.registra(rico)
    calculadora.registra(thiago)

    println("O total de bonificacao: ${calculadora.total}")
}