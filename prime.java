import java.util.*;
class prime{
    public static void main(String args[]){
        int a=5;
        int flag=0;
        for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0)
                  {
                    flag=1;
                    break;
                  }
         }
        if(flag!=0){
            System.out.println(a+"not a prime number");
        }
        else
            System.out.println(a+"is a prime number");
    }
}