import java.io.File

fun main(Args: Array<String>){

    /*
    Dirección de relativa de mi archivo de prueba.
    val testFile = ".\\src\\kotlin-icpc\\UVA-272\\poem.txt"
    Lectura directa de consola.
    val phrase = readLine()!!
     */

    //Leer del archivo de la ruta especificada al correr el ejecutable.
    val phrase = File(Args[0]).readText()

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