package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        
        Person person = new Person("Pablo", new Date(49,8,24));
        System.out.println(person.getName() + " tiene tantos " + person.getAge());
                
    }
    
}
