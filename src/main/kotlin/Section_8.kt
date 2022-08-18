class Section_8 {
    fun getLength(num:Int):String{
        val num2 = num.toDouble()
        val result = num2*7
        return "The length of $result is ${result.toString().length}"
    }
    fun total(n:Int):Double{
        val products = n?:1
        return products*29.99
    }
}