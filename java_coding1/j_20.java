import java.util.Scanner;

public class j_20 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];

            int i;
            for(i=0; i<n; i++)
                A[i] = scan.nextInt();
            
            for(i=0; i<n; i++)
                B[i] = scan.nextInt();

            for(i=0; i<n; i++){
                if(A[i] == B[i])
                    System.out.println("D");
                else if(A[i] == 1){
                    if(B[i] == 2)
                        System.out.println("B");
                    else
                        System.out.println("A");
                }else if(A[i] == 2){
                    if(B[i] == 1)
                        System.out.println("A");
                    else
                        System.out.println("B");
                }else if(A[i] == 3){
                    if(B[i] == 1)
                        System.out.println("B");
                    else
                        System.out.println("A");
                }
            }

            scan.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
