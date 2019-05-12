import java.io.File
import java.util.Scanner

fun main(Args: Array<String>) = with(Scanner(System.`in`)){

    /*
    Dirección de relativa de mi archivo de prueba.
    val testFile = ".\\src\\kotlin-icpc\\UVA-272\\poem.txt"
    Lectura directa de consola.
    Leer del archivo de la ruta especificada al correr el ejecutable.
    val phrase = File(Args[0]).readText()
    */    
    while(hasNext()){
        val phrase = nextLine()

        var first = true
        val strbuilder = StringBuilder()
        for (c in phrase){
            when {
                c != '\"' -> strbuilder.append(c)
                first -> {
                    strbuilder.append('`')
                    strbuilder.append('`')
                    first = !first
                }
                else -> {
                    strbuilder.append('\'')
                    strbuilder.append('\'')
                    first = !first
                }
            }
        }
        println(strbuilder.toString())
    }
}
