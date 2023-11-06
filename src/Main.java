public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    String firstName = "Семён";
    String middleName = "Семёнович";
    String lastName = "Иванов";
    String fullName = lastName +  " " + firstName + " " + middleName;
    System.out.println("Ф.И.О. сотрудника — " + fullName);
    System.out.println();

    System.out.println("Задача №2");
    fullName = fullName.toUpperCase();
    System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName);
    System.out.println();

    System.out.println("Задача №3");
    fullName = fullName.replace("Ё", "Е");
    System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
  }
}