
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       int data , ano , idade ;
       
        System.out.println("Nasceu em que ano? :");
        data = scanner.nextInt();
        System.out.println("Qual é o ano atual");
        ano = scanner.nextInt();
        
        if( data > ano){
            System.out.println("ERROW!");
        }else{
            idade = ano - data ;
            System.out.println("tua idade é :"+ idade);
        }
       
    }
}
