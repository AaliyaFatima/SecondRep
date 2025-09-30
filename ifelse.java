import java.util.Scanner;

public class ifelse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter if the meghana is alive or dead");
        String meghana=sc.nextLine();

        if(meghana.equals("dead")||meghana.equals("DEAD")){
            System.out.println("Surya meets divya");
        }
        else{
            System.out.println("Surya weds meghana");
        }
        sc.close();
    }
}


