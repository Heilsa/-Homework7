public class Main {
    public static void main(String[] args) {
        String phone = "9039521719";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79039521719";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("Задача 1");
        String name = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + name + " " + middleName;
        System.out.println(fullName);
        System.out.println("Задача 2");
        String fullname1 = fullName;
        System.out.println(fullname1.toUpperCase());
        System.out.println("Задача 3");
        String fullNameNew = "Иванов Семён Семёнович";
        fullNameNew = fullNameNew.replace("ё", "е");
        System.out.println(fullNameNew);
    }
}