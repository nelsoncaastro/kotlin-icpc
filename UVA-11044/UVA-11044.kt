import kotlin.math.ceil

fun main(args: Array<String>) {
    val currys = ArrayList<Pair<Int, Int>>()
    val response = ArrayList<Int>()
    val cases = readLine()!!.toInt()
    for(i in 0 until cases){
        val (a,b) = readLine()!!.split(' ').map(String::toInt)
        currys.add(Pair(a,b))
    }
    for(i in 0 until currys.size){
        val region = ((currys[i].first/3)*(currys[i].second/3)).toFloat()
        response.add(ceil(region).toInt())
        println("${response[i]}")
    }
}
