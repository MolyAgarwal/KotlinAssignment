class varAndStr{
    fun bunny(): String{
        var var1="("
        var var2="\\"
        var var3="-"
        var var4="."
        var var5="_"
        var var6="\""
        var var7 =")"
        var line1 =var1+var2+var1+var2
        var line2 =var1+var3+var4+var3+var7
        var line3 ="O"+var5+var1+var6+var7+var1+var6+var7
        val bunny = line1 +"\n" + line2 +"\n" + line3 +"\n"
        return bunny
    }
}
class stringsFunction{
     fun check(myFavourite:String): Boolean{
//         var myFavourite="HowAreYou"
//         println("This function compare two strings if equal then give true else false: "+myFavourite.equals("How Are You"))
         return myFavourite.equals("How Are You")
     }

    fun totalAmount() : String {
        val client="Mary"
        val products=3
        val price=30
        return "Hello $client your total amount is: ${products*price}"
//        println("Hello ${client} your total amount is: ${products*price}")
    }
}