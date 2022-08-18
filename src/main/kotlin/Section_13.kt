class Section_13 {
    var attendance= hashMapOf(Pair("23 Sept",2837),Pair("24 Sept",3726),Pair("25 Sept",6253))
    constructor(){
        attendance["26 Sept"]=1000
    }
    fun total(): Int {
        val a=attendance["26 Sept"]?:0
        val b=attendance["25 Sept"]?:0
        return a+b
    }
}