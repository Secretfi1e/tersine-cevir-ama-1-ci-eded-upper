import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      String reversed = "";
        String a  = emin(sc);
        System.out.println(tersinecevir(a,reversed));
        
    }
    public static String emin(Scanner sc){
      return sc.nextLine();

    }
    public static String tersinecevir(String a,String reversed){
        for (int i = a.length() - 1; i >= 0; i--) {
           reversed += a.charAt(i);

    }
        return (reversed.substring(0,1).toUpperCase()+reversed.substring(1).toLowerCase());


    }}

