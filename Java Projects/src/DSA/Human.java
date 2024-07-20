package DSA;

public class Human {

    //constructor
    public Human(String name, int age)
    {
        System.out.println(name+" "+age);
    }

    //method
    public void Read()
    {
        System.out.println("Human can Speak!");
    }

    public static void main(String[] args) {
        //normal
        Human ram = new Human("Ram",25);
        ram.Read();

        //polymorphism
        Human rahul = new Student("Rahul",19);
        rahul.Read();


        //default constructor of child class
        child sam = new child();
        sam.hello();
        sam.details("Sam",12);//method overloading example

        //object of abstract class which has extended it
        abstract_extend_use obj = new abstract_extend_use();
        obj.hello();

        //object of horse class for testing interface
        Horse h1 = new Horse();
        h1.run();
        h1.speak();
        h1.running_spead(64.76);

    }

}

class Student extends Human{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void Read()
    {
        System.out.println("Student can Read and Write!");
    }

}

class child{

    //Method Overloading | Compile Time Polymorphism
    public void details(String name){
        System.out.println("Name : "+name);
    }

    public void details(String name,int age)
    {
        System.out.println("Name : "+name+"\nAge : "+age);
    }

    public void details(String name , int age , String location)
    {
        System.out.println("Name : "+name+"\nAge : "+age+"\nLocation : "+location);
    }

    //another method to be called with default constructor

    public void hello(){
        System.out.println("Hello !");
    }

    //1. Polymorphism (Method Overloading , Method Overriding)
        //1.Method Overloading(Compile time polymorphism) - having multiple methods within the same name but different parameters.
        //2.Method Overriding(Run time polymorphism) - redefining method that exists in parent class , for specific implementation.
    //2. Encapsulation(default , public , private , protected)
        //1. Default - can be accessed within the same package
        //2. public - can be accessed from outside the package also
        //3. private - can be accessed within the declared class itself
        //4. protected - can be accessed within the package or via subclass
    //3. Abstraction - used to hide complex implementation details and show only the essential feature
        //1. to create an abstract class you have to add abstract keyword in front of class
        //2. same goes with methods also but here you just have to define the method not its body.
        //3. once done you have to create a normal class to extend and use the abstract methods of abstract class
        //4. you can create regular methods also in abstract class
    //4. Inheritance (single level, multi level, hierarchical, Multiple(N.S) , Hybrid(N.S) )
        // 1. Single Inheritance(Dog extends animal class)
        // 2. Multi level Inheritance(puppy extends dog , dog extends animal)
        // 3. hierarchical Inheritance(dog extends animal , cat extends animal)
        // 4. Multiple Inheritance (here it is implemented using interfaces)
        // 5. Hybrid Inheritance ( here it is also implemented using interface)


}

abstract class abstraction_example{
    //abstract method (does not have body)
    public abstract void hello();

    //regular method
    public void display_message(){
        System.out.println("Hello friend , How are you ?");
    }

}

//providing implementation for abstract method
//so abstract class methods can be accessed with class extending the abstract class
// so once you have extended the abstract class , you have to include the abstract methods also in this class
 class abstract_extend_use extends abstraction_example{

    //now here I can give the body to this method
    @Override
    public void hello() {
        System.out.println("Hello! from the extended class of abstract class!");
    }
}

//here im creating main method to use the methods
// above already the main exists so i'll use it their
// i have to make an object of abstract_extend_use class and then i will be able to use its methods



//Interfaces
// it is nothing but collection of defined methods that extends the functionality of a class

interface animal{
    void run();
    void speak();
    void running_spead(double speed);
}

//note if you are implementing the interface in class then you have to use all the abstract methods defined in  the interface or else you have to make class abstract
class Horse implements animal{

    @Override
    public void run() {
        System.out.println("Horse are good in running!");
    }

    @Override
    public void speak() {
        System.out.println("Horse make hh hhhh sound!");

    }

    @Override
    public void running_spead(double speed) {
        System.out.println("Speed of horse while running is "+speed);
    }
}