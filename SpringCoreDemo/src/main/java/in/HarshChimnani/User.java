package in.HarshChimnani;

import org.springframework.stereotype.Component;

//@Component // this can not be used because ioc cotainer can not provide values to beans
public class User {
    public String Name ;
    public int Age ;

    public User(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
