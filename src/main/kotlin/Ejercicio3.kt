class Ejercicio3 {


        val listaFiltrada = { array: Array<Int> ->
            array.filter {
                it % 2 != 0
            }.forEach(){
                println(it)
            }
        }
}