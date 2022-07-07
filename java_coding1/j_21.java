import java.util.Scanner;

public class j_21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A_sum=0, B_sum=0;
        int[] a = new int[10];
        int[] b = new int[10];

        int tmp=-1;
        for(int i=0; i<10; i++)
            a[i] = scan.nextInt();
              
        for(int i=0; i<10; i++)
            b[i] = scan.nextInt();
        
        for(int i=0; i<10; i++){
            if(a[i] > b[i]){
                A_sum += 3;
                tmp = i;
            }
            else if(a[i] < b[i]){
                B_sum += 3;
                tmp = i;
            }
            else{
                A_sum++;
                B_sum++;
            }  
        }

        System.out.println(A_sum + " " + B_sum);

        if(A_sum > B_sum)
            System.out.println("A");
        else if(A_sum < B_sum)
            System.out.println("B");
        else{
            if(tmp == -1)
                System.out.println("D");
            else if(a[tmp] > b[tmp])
                System.out.println("A");
            else if(a[tmp] < b[tmp])
                System.out.println("B");
        }

        scan.close();
    }
}
