package ru.mirea.task4;

public class AuthorTest{
    static public void main(String[] args){
        Author a1 = new Author("А.С. Пушкин", "pushkin@mail.ru", 'M');
        System.out.println(a1.toString());
        a1.setEmail("ASPush@yandex.ru");
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.getEmail());
    }
}

class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
