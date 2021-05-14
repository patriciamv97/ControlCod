import java.util.*
import kotlin.random.nextInt

fun main(args: Array<String>) {
    /**
     * No me importa import kotlin.random.nextInt, no se por que no funciona

     */

    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }
    for (numero in Ejercicio2(10,Random.nextInt(50..250)).tabla6)
        println(numero)

    val array = Ejercicio2(10){ Random.nextInt(50, 250)}


}