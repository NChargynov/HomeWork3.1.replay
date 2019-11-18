public class User  {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName (String name) throws IllegalNameLengthException {
        if (name.length()>20){
            throw new IllegalNameLengthException("Имя юзера не должно быть больше 20 символов ");
        }
        System.out.println("__________________________");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age <1 || age >100){
            throw new IllegalAgeException("Возраст юзера не должен быть меньше 1го или больше 100 ");
        }
        System.out.println("___________________________");
        this.age = age;

    }
}
