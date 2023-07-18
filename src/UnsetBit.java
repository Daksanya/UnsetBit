import java.util.Scanner;

public class UnsetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        if((a&1<<b)!=0){
            a=(a&~(1<<b));
        }
        System.out.println(a);
    }
}
