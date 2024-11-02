import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Получаем на вход числа
        System.out.println("Введите число 1: ");
        int number1=new Scanner(System.in).nextInt();
        System.out.println("Введите число 2: ");
        int number2=new Scanner(System.in).nextInt();

        //вычисляем
        int sum=number1+number2;
        int difference=(number1-number2);
        int product = number1*number2;
        double quotient=(double) number1 / number2;

        //выводим результат
        System.out.println("Сумма: " +sum);
        System.out.println("Разность: "+difference);
        System.out.println("Произведение: "+product);
        System.out.println("Частное: "+quotient);


           }
}
