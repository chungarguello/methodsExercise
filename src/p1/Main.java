package p1;
 /*
 Chungsing Arguello
 CSC164
 Method Exercise
  */
public class Main {

    public static void main(String[] args) {
	    int a = 4;
        int b = 9;
        int c = -5;

        System.out.println("The biggest number = " + biggest(a, b, c));
    }
     private static int biggest (int n1, int n2, int n3){
         return biggest(biggest(n1, n2), n3);
     }

     static int biggest(int n1, int n2){
         return (n1 > n2) ? n1 : n2;
     }
}
