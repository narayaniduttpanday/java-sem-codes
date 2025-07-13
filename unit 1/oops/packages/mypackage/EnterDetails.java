package mypackage;


public class EnterDetails{
    public int age;
    public String gender;
    public String nationality;
    public String languages;

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setLanguages(String languages){
        this.languages = languages;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getLanguages() {
        return languages;
    }
}