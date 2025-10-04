import java.util.*;
public class funQuestions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = "";
        System.out.print("Enter number for permutations: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            number+=i;
        }
             
        findPermutations(number, "");
        sc.close();
    }

    public static void findPermutations(String number, String permutations){
        if(number.length()==0){
            System.out.println(permutations);
            return;
        }

        for(int i=0; i<number.length(); i++) {
            char curr = number.charAt(i);
            String newStr = number.substring(0,i) + number.substring(i+1);
            findPermutations(newStr, permutations + curr);
        }
    }
}