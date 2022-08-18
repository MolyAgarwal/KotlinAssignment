class Section_16 {
    fun main(age:Int):String{
        var status=""
        var a=age
        if (a==0) a=1
       if(a in 1..12)
           status="a child"
        else if (a in 13..17)
            status="a teen"
        else
            status="adult"
         return status
    }
}