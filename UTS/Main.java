package UTS;

public class Main {
    public static void main(String[] args){
        myStack = new myStack();
        String inputstr = myStack.Stack_input();
        String cekstr = myStack.StrToStack(inputstr);
        if (cekstr != "x"){
            myStack.checkInp(myStack.stackNumb,inputstr);
        }
    }
}