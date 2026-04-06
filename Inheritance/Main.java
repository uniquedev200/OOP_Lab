
class Main{
    public static void main(String args[]){
        Dog d = new Dog();
        Lion l = new Lion();
        d.eat();
        d.bark();
        l.eat();
        l.growl();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Lion extends Animal{
    void growl(){
        System.out.println("Growling...");
    }
}