import java.time.LocalDate;
import java.time.Period;

import java.util.Date;

public class Person {
    private int id;
    private String firstName;
    private String secondName;
    private String familyName;
    private char gender;
    private LocalDate birthDate;
    private String idCard;

    public Person(int id, String firstName, String secondName, String familyName, char gender, LocalDate birthDate, String idCard) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.familyName = familyName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.idCard = idCard;
    }



    public void setName(String firstName, String secondName, String familyName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.familyName = familyName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public float getAge() {
        LocalDate currDate = LocalDate.now();
        return Period.between(this.birthDate, currDate).getYears();
    }

    public String getFullName() {
        return this.firstName + " " + this.secondName + " " + this.familyName;
    }

    public String getGenderDesc() {
       if(this.gender == 'M'){
           return "Male";
       }
       else{
           return "Female";
       }
    }

    public static void main(String[] args){
        Person Person1 = new Person(1,null,null,null,'M',null,null);
        Person1.setBirthDate(LocalDate.of(1984,02,19));
        Person1.setName("Moahammed","Dahesh","Ali");
        Person1.setGender('M');

        System.out.println(Person1.getAge());
        System.out.println(Person1.getFullName());
        System.out.println(Person1.getGenderDesc());

    }
}
