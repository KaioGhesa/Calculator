package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;
        char operador;
        //char é um tipo de dado que representa um caracter unico
        
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();
        
        System.out.println("Digite o operador (+ , -, *, /): ");
        operador = sc.next().charAt(0);
        /*scanner.next() lê a próxima entrada do usuário como uma string, 
        e charAt(0) retorna o primeiro caractere dessa string**/
        
        double result;
        
        switch(operador){
        
            case '+' -> result = num1 + num2;
                
            case '-' -> result = num1 - num2;
                
            case '*' -> result = num1 * num2;
            
            case '/' -> {
                if (num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("Não é possivel dividir por zero!");
                    return;
                }}
           
            default -> {
                System.out.println("Operador numero invalido! ");
                return;
            }
        }
        System.out.println("O resultado da operacao e: " + result);
    }
}
