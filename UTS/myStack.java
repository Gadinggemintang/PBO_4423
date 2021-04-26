package UTS;
import java.util.Scanner;
import java.util.Stack;

public class myStack {
    Stack<Character> stackNumb = new Stack<>();
    Stack<Character> kiri = new Stack<>();
    Stack<Character> kanan = new Stack<>();
    public String Stack_input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Persamaan :");
        String inputstr = input.next();
        return inputstr;
    }
    public String StrToStack(String inputstr){
        String cekInput = "y";
        int index1 = inputstr.indexOf("=");
        int index2 = inputstr.indexOf("1");
        if (index1 == -1 || index2 == -1){
            System.out.println(inputstr + " adalah persamaan yang tidak valid");
            cekInput = "x";
        }
        String p = "+";
        char plus = p.charAt(0);
        String o = "=1";
        char equal = o.charAt(0);
        char one = o.charAt(1);
        for (int i = 0; i < inputstr.length(); i ++){
            if (inputstr.charAt(i) != plus){
                this.stackNumb.push(inputstr.charAt(i));
                if (inputstr.charAt(i) != one && inputstr.charAt(i) != equal){
                    System.out.println(inputstr + " tidak valid karena karakter yang diijinkan hanya 1,+,dan=");
                    cekInput = "x";
                }

            }
        }
        return cekInput;
    }
    public void checkInp(Stack stack,String inputstr){
        String o = "=1";
        char equal = o.charAt(0);
        char one = o.charAt(1);
        int counter = 0;
        String cek = "t";
        kiri = stackNumb;
        for (int j = 0; j < stackNumb.size();j++){
            if (kiri.peek() == one){
                kanan.push(kiri.pop());
            }
            if (kiri.peek() == equal){
                kiri.pop();
                counter ++;
                if (counter == 2) {
                    System.out.println(inputstr + " tidak valid,karena hanya satu tanda sama dengan yang diijinkan.");
                    cek = "s";
                    break;
                }
            }
        }
        if (cek == "t"){
            if (kiri.size() == kanan.size()){
                System.out.println(inputstr + " adalah persamaan yang valid");
            }
            if (kiri.size() != kanan.size()){
                System.out.println(inputstr + " adalah persamaan yang tidak valid");
            }
        }
    }
}