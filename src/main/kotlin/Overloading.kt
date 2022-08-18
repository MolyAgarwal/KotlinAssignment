class Overloading {
    fun main(){
        cost("coffee",5.6)
        val products = mapOf(Pair("biscuit",12.5), Pair("brownie",45.8))
        cost (products)
    }
    fun cost(product:String, price:Double?):String{
        return "A $product costs ${price?.times(1.2)}"
    }
    fun cost(products: Map<String,Double>){
        for (product in products.keys){
            cost(product, products[product])
        }
    }
}