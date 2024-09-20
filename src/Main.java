public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //Задача 2
        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);
        //Задача 3
        System.out.println("Задача 3");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + ' ' + firstName + ' ' + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }

}