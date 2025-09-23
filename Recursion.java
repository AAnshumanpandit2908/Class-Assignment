package Class;

public class Recursion {
     static void XYZ(int N){
//        if(n==N){
//            System.out.print(n+" ");
//            return;
//        }
//        System.out.print(n+" ");
//        XYZ(n+1,N);
         if(N==1){
             System.out.print(N+" ");
             return;
         }
         XYZ(N-1);
         System.out.print(N+" ");

    }

    public static void main(String[] args) {
         XYZ(9);


    }
}
