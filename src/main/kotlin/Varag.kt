class Varag {
    fun main(count:Int,vararg names: String): String{
        var msg=""
        for (name in names){
            for (i in 1..count){
                msg+="Hello $name -- "
            }
            msg+="\n"
        }
        return msg
    }}