package kata1;

import java.util.Date;

public class Person {
    private final String name;   

    
    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    private final Date birthdate;

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
    
    
}