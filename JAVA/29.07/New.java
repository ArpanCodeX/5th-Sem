// Wap in java to define a class car with instance variable speedLimit and method race().
// Define another class BMW ,that inherit class car,
    // 1. Set speedLimit as final and try to change it
    // 2.set race method as final and try to overRide it
    // 3.Set car class as final and try to inherit it

    // When a variable is declare as final it is known as final variable.Its value can not be changed once it is initialized.
    // It reacts like a constant
    // Syntax:final datatype varibleName=value
    // A method declare as final this known as a final method.Subclasses can not overide final methos.
    // A class when declare as final this known as a final class.A final class cannot be inherited by any other Subclasses.

    // Can you inherit final Method?-->Yes.But we cannot over write it.
// final class Car{
//     final int speedLimit=60;
//     void race(){
//         System.out.println("In side Car Class");
//     }

//     public static void main(String[] args) {
//         Car ob=new Car();
//         ob.speedLimit=100;
//     }
// }

// class BMW extends Car{
//     void race(){
//         System.out.println("In side BMW Class");
//     }
//     public static void main(String[] args) {
//         BMW ob=new BMW();
//         ob.race();
//     }
// }
// class Car {
//     final int speedLimit = 60; 
//     public static void main(String[] args) {
//         Car ob = new Car();
//         ob.speedLimit = 100; 
//     }
// }

class Car {
    final void race() { // final method - cannot be overridden
        System.out.println("Inside Car class");
    }
}

class BMW extends Car {
    void race() { 
        System.out.println("Inside BMW class");
    }

    public static void main(String[] args) {
        BMW ob = new BMW();
        ob.race();
    }
}
