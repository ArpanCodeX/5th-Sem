// OS to Acive Absratction.Abstraction is a Process of hiding the implementation Details and showing only the functionality to the user.There are two ways to 1.Using Abstract Class 2.Using Interface
//An Abstract Class must be Declare with a achive and 
//It can have Abstract and Non-Abstract Method
//It can not be intenstantiated
//It can have final method
//It can have constructors and static methods also

//Write a Abstract Class shape to Abstract Method area and Perimeter .Make another two class Rectangle and triangle that inherits same class .Create objects to show the concept of abstraction.
abstract class Shape {
    abstract void area(int a,int b);
    abstract void perimeter();
    public void display(){
        System.out.println("Inside ");
    }
}
