class Section_12{
    var customers= hashSetOf("payal","nitin","john")
    fun addUser(userName:String):String{
        customers.add(userName)
        return "Added"
    }
    fun removeUser(userName:String):String{
        customers.remove(userName)
        return "Removed"
    }
    fun displayUser(): String {
        return customers.toString()
    }
}
