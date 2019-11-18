import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя юзера.");
            User user = new User();
            try {
                user.setName(sc.nextLine());
            } catch (IllegalNameLengthException ie) {
                System.out.println(ie.getMessage());
            }

            System.out.println("Введите возраст юзера. ");
            Scanner sc2 = new Scanner(System.in);
            try {
                user.setAge(sc2.nextInt());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            } catch (Exception e){
                System.out.println("Некорректные данные. Вы ввели цифры. Надо вводить буквы.");
                e.printStackTrace();

            }
            System.out.println(user.getName() + " " + user.getAge());
        }
    }
}
