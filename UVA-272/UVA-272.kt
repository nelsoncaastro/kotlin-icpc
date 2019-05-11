fun main(Args: Array<String>){
    val phrase = readLine()!!
    var first = true
    val strbuilder = StringBuilder()
    for (c in phrase){
        if (c != '\"') {
            strbuilder.append(c)
        } else if (first){
            strbuilder.append('`')
            strbuilder.append('`')
            first = !first
        } else {
            strbuilder.append('\'')
            strbuilder.append('\'')
            first = !first
        }
    }
    println(strbuilder.toString())
}