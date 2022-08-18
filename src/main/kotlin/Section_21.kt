class Section_21 {
    fun main(animal:String): String{
        val lifespan=getLifeSpan(animal)
        return "Lifespan for $animal is $lifespan"
    }
    fun getLifeSpan(animal:String):Int{
        val lifesapn= when(animal){
            "cat" -> 15
            "dog" -> 10
            "rabbit" -> 12
            else ->20
        }
        return lifesapn
    }
}