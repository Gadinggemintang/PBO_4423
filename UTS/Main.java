package UTS;

import UTS.myStack;

public class Main {
    public static void main(String[] args){
        myStack myStack = new myStack();
        String inputstr = myStack.Stack_input();

        String cek = myStack.StrToStack(inputstr);
        if (cek != "x"){
            myStack.checkInp(myStack.stackNumb,inputstr);
        }
    }
}