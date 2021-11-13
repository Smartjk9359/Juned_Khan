import java.util.Scanner;
class reverseno
{
    public static void main(String...s)
    {
        //REVERSE ANY NUMBER 
        //FOR NEGATIVE NUMBER EX -547 THEN PRINT THIS TYPE -7-4-5
      System.out.println("C_R_E_A_T_E_D B_Y J_U_N_E_D K_H_A_N ");
      int no1,no2,i,count=0;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter any No: ");
      no2= no1 = in.nextInt();
      if(no1==0)
      System.out.println("0");
      else
      {
        while (no1!= 0)
            {
             no1 = no1 / 10;
            ++count;
            }
        while(count!=0)
            {
            i=0;
            int arr[ ] = {no2%10};
             no2 = no2/10;
            System.out.print(arr[i]);
            i++;
            count=count-1;
            }
      }
      in.close();
      System.out.println( );
      System.out.println("T_H_A_N_K_S F_O_R U_S_E");
    }
}