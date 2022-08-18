class totalAmount{
    fun total(name:String, n:Int) : String {
        val total = n * 9.99
        try{

            return "$name's total cost : $total"
        }catch (e:Exception){
            return "Exception Occur"
        }
    }
}