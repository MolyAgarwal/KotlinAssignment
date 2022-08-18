class Section_20 {
    fun main(input:String):String{
       var msg=""
        while (true) {
            if (input == "stop") {
                msg = "Program Stopped"
                break
            }
            val age = input.toInt()
            if (age < 18) {
                msg = "Sorry you are not allowed"
                break
            }
        }
        return msg
    }
}