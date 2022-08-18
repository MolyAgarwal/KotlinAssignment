class Section_7 {
    fun interest(initialAmount:Double) :String{
        var interest=1.055
        var finalAmount= initialAmount*interest*interest*interest*interest*interest
        return "Your amount after 5 years with 5.5% of interest per year: $finalAmount"
    }

    fun fundingResult():String{
        val animals=3
        val prodAnimal=1
        val child=2
        val members=child+1
        val fundingResult=((animals<=5)&&(prodAnimal>=1))||(members>=3)
        return "Does the farmer recieve funding? $fundingResult"
    }
}