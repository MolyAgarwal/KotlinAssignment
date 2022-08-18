class Section_15 {
    fun numToGrade(num:Int): String{
        var grade =""
        if(num>=90 && num<=100)
            grade="A"
        else if(num>=80 && num<=89)
            grade="B"
        else if(num>=70 && num<=79)
            grade="C"
        else if(num>=60 && num<=69)
            grade="D"
        else if(num>=50&& num<=59)
            grade="E"
        else
            grade="F"
        return grade
    }
}