import java.util.Scanner;

class Ex7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int nFac = 1;
        int nMinusRFac = 1;
        int perm;

        System.out.println("FORMULA FOR N PERMUTATIONS OF R");
        System.out.println("N! / (N - R)!");
        System.out.println("-------------------------------");
        System.out.println("Input N: ");
        int N = scan.nextInt();

        System.out.println("Input R:");
        int R = scan.nextInt();

        if(N < 0 || R < 0){
            System.out.println("R and N must be positive integers or 0");
        }else if(!(R<=N)){
            System.out.println("N must be greater than R");
        } else {
            //N!
            while(i <= N){
                nFac = nFac * i;
                i++;
            }
            i = 1;
            System.out.println("nFac = " + nFac);

            while(i <= (N-R)){
                nMinusRFac = nMinusRFac * i;
                i++;
            }
            System.out.println("nMinusRFac = " + nMinusRFac);
            perm = (nFac) / nMinusRFac;
            System.out.println(perm);
        }
    }
}