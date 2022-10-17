package from_Short_Videos.custom_class;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.gender ='F';
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.color ="White";
        
        Dog dog2 = new Dog();
        dog2.name = "Max";
        dog2.gender ='M';
        dog2.breed = "German Shepherd";
        dog2.age = 1;
        dog2.color ="Black";


        System.out.println(dog1);
        System.out.println(dog2);

        dog1.eat();
        dog2.play();

    }
}
