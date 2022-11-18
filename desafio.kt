// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun printUsuarios(){
        println("Lista de Inscritos")
        for (usuario in inscritos){
            println("${usuario.nome} - ${usuario.email}")
        }
    }

    fun printMaterias(){
        println("Lista de Materias")
        for (materias in conteudos){
            println("${materias.nome} - ${materias.duracao} - ${materias.nivel} ")
        }
    }

}

fun main() {

    val listaConteudos = mutableListOf<ConteudoEducacional>()
    listaConteudos.add(ConteudoEducacional("Kotlin - Basico", 40, Nivel.BASICO))
    listaConteudos.add(ConteudoEducacional("Kotlin - Intermediario", 60, Nivel.INTERMEDIARIO))
    listaConteudos.add(ConteudoEducacional("Kotlin - Avançado", 120, Nivel.AVANCADO))
    val DesafioDIO = Formacao("Formação Android Developer", listaConteudos)

    DesafioDIO.matricular(Usuario("Leonardo", "leonardo@gmail.com"))
    DesafioDIO.matricular(Usuario("Pedro", "pedro@gmail.com"))
    DesafioDIO.matricular(Usuario("Guilherme", "guilherme@gmail.com"))


    DesafioDIO.printMaterias()
    println("-------------------------")
    DesafioDIO.printUsuarios()
}
