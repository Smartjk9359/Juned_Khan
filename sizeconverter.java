import java.util.Scanner;
public class sizeconverter {
    public static void main(String...s)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter The Size of One Object (In BYTE) :");
     int obj_size = in.nextInt();
     System.out.println("Enter Total Object :");
     int total_obj = in.nextInt();

     float kb = (float)obj_size/1024;
     float mb = (float)kb/1024;
     System.out.println("***********************************************");
     System.out.println("1 OBJECT SIZE IN KB :"+kb+"KB");
     System.out.println("1 OBJECT SIZE IN MB :"+mb+"MB");
     System.out.println("TOTAL SIZE OF OBJECT IN KB :"+(total_obj*kb)+"KB");
     System.out.println("TOTAL SIZE OF OBJECT IN MB :"+(total_obj*mb)+"MB");
     System.out.println("***********************************************");
     in.close();
     System.err.print("Scanner class closed:");
    }
    
}
