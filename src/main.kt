fun main(){
 var car=Car("wagon","Benz","Blue",4)
    car.carry(4)
    car.identity("black","jeep","legacy")
    car.calculateParkingFees(5)
    var bus=Bus("Toyota","nissan","White",60)
    bus.maxTripFare(200)
    bus.calculateParkingFees(10)

}
class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int) {
        var n=people-capacity
        if (people<=capacity){
            println("Carrying $people passengers")
        }else {
            print("overcapacity by $m people")
        }
    }
}   fun identity(color:String,make:String,model:String){
    println("She is a $color $make $model")

}
open fun calculateParkingFees(hours:Int):Int{
    var l=20*hours
    println(l)
    return(l)
  }
}
class Bus(make:String,model:String,color:String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var t=300*fare
        println(t)
        return(t)
    }
    override fun calculateParkingFees(hours:Int): Int{
        var z=capacity*hours
        println(z)
        return(z)
    }
}