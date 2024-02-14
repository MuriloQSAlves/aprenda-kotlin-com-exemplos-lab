// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class ConteudoEducacional(val nome: String, val nivel: Nivel)

data class Usuario(var nome: String, var idade: Int, var função: String) {
  constructor() : this("", 0, "")
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
      println("Um novo aluno ${usuario.nome} foi matriculado.")
      
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

val Formacao.conteudosEducaicionaisNomes: String
get() = conteudos.joinToString { it.nome }

fun main() {
  val formacao = Formacao("Formação Kotlin", listOf(ConteudoEducacional("Utilizando keyword Object", Nivel.AVANCADO), ConteudoEducacional("Explorando mapas", Nivel.INTERMEDIARIO), ConteudoEducacional("Conhecendo o Kotlin", Nivel.BASICO)))

  println("Conteúdos do curso: ${formacao.conteudosEducaicionaisNomes}")

  val mario = Usuario("Mário", 30, "Android developer")
  .also{
    formacao.inscritos.add(it)
  }
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}