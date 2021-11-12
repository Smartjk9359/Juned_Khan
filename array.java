import java.util.Scanner;
class array
{
 public static void main(String args[])
 {
      int ch,flag=0;
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER TOTAL EMPLOYEE");
      int empno = in.nextInt();
      employee ob[]= new employee[empno];
      do{
          System.out.println(" ");
          System.out.println(" ");
          System.out.println("************************************");
          System.out.println("PRESS 1 FOR ENTER EMPLOYEE DATA:");
          System.out.println("PRESS 2 FOR DISPLAY DATA:");
          System.out.println("PRESS 3 FOR REPLACE ANY PARTICULAR EMP DETAIL :");
          System.out.println("PRESS 4 FOR EXIT:");
          System.out.println("************************************");
          System.out.println("ENTER YOUR CHOOICE:");
             ch = in.nextInt();
          switch(ch)
          {
            case 1:
            {
                flag=1;
                for(int i = 0;i<empno;i++)
                {
                    ob[i] = new employee();
                    System.out.print("ENTER EMP ID :");
                    int no1 = in.nextInt();
                    System.out.print("ENTER EMP NAME :");
                    String name1 = in.next();
                    ob[i].seta(no1,name1);
                }
                break;
            }
            case 2:
            {
                if(flag==1)
                {
                for(int i=0; i<empno; i++)
                {
                ob[i].geta();
                }
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("P_L_E_A_S_E E_N_T_E_R E_M_P D_E_T_A_I_L_S");
                    System.out.println(" ");
                }    
                break;
            }
            case 3:
            {
                if(flag==1)
                {
                System.out.println("ENTER THE POSITION:");
                int i = in.nextInt();
                if(i<empno)
                {
                    System.out.print("ENTER EMP ID :");
                    int no1 = in.nextInt();
                    System.out.print("ENTER EMP NAME :");
                    String name1 = in.next();
                    ob[i-1].seta(no1,name1);
                }
                else 
                System.out.println("COMPANY DONT HAVE THE NO OF EMPLOYEE:");
                break;
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("P_L_E_A_S_E E_N_T_E_R E_M_P D_E_T_A_I_L_S");
                    System.out.println(" ");
                }   

            }
            case 4:
            {
            
                break;
            }
            default:
            System.out.println("YOU HAVE ENTERED WRONG CHOOICE");
          }
 }while(ch!=4);
 in.close();
}
}
class employee
{
 private int empid;
 private String empname;
 public void seta(int id,String name)
 {
 empid = id;
 empname = name;
 }
 public void geta()
 {
 System.out.println("EMP ID :"+empid);
 System.out.println("EMP NAME :"+empname);
 }

}