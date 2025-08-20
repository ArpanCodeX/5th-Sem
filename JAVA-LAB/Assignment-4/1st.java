// 1. wap in java to define a class car with speedlimit (instance variable) and a method race(). Define another class BMW that inherits class car.
// (i) set speedlimit as final and try to change it.
// (ii) set race() method as final and try to override it.
// (iii) set car class as final and try to inherit it.


// 1.

// class Car {
//     final int speedlimit = 60;

//     final void race() {
//         System.out.println("This is race!");
//     }

//     public static void main(String[] args) {
//     Car ob1 = new Car();
//     ob1.speedlimit = 100;
//     }
// }


// 2.
// class Car {
//     final int speedlimit = 60;

//     final void race() {
//         System.out.println("This is race!");
//     }

//     // public static void main(String[] args) {
//     //     Car ob1 = new Car();
//     //     ob1.speedlimit = 100;
//     // }
// }

// class BMW extends Car{
//      void race(){
//         System.out.println("This is BMW!");
//      }
//      public static void main(String[] args) {
//         BMW ob1 = new BMW();
//         ob1.race();
//      }
// }



// 3.
final class Car {
    final int speedlimit = 60;

    final void race() {
        System.out.println("This is race!");
    }
}

class BMW extends Car {
    void race() {
        System.out.println("This is BMW!");
    }

    public static void main(String[] args) {
        BMW ob1 = new BMW();
        ob1.race();
    }
}

// Note:

// 1. when a variable is declared as final it's known as a final variable. It's value cann't be changed once declared. It behaves like a constant
// syntax: final dtype variableName = value;

// 2. java final method : a method declared as final is known as a final method. Sub classes cannot override the final method.

// 3. java final class : a class when declared as final is known as a final class. A final class cannot be  inherited by any other sub classes

// Q1: can we inherit final method? 
// Ans: Yes, it can be inherited but we cannot override it.



