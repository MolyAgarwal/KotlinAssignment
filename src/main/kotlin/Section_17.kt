class Section_17 {
    fun main(name:String): String{
        var msg=""
        when(name[0]){

            'A','B','C' -> msg="Hi, How are you"
            in 'D'..'F' -> msg="Are you ok"
            in 'G'..'Z' -> msg="Good Bye"
        }
        return msg
    }
}