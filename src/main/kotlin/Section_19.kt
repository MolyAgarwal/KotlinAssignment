class Section_19 {
    fun main(number:Int):String{
        var res=""
        var i=1
        while(i < number){
            if(i%7==0){

                res+=i.toString()+" "
            }
            i++
        }
        return res
    }

    var nameList = hashSetOf("payal","john","hina")
//    var temp = false

    fun execute(name:String):String{
        var temp=0
        do{
            if(name in nameList)
                return "$name You are already here"
            else{
                nameList.add(name)
                temp=1
            }
        } while (temp==0)

        return "$name Welcome to the community"
    }
}
