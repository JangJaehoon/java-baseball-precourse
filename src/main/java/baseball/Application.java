package baseball;

import java.util.ArrayList;
import java.util.Vector;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현




    }

    public void RandomNum(){
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        while(randomNum.size() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if(!randomNum.contains(num)){
                randomNum.add(num);
            } // end of if
        } // end of while
    } // end of RandomNum()

    public ArrayList<Integer> InputNum(){

        System.out.println("숫자를 입력해 주세요.");
        String input1 = Console.readLine();
        String input2 = Console.readLine();
        String input3 = Console.readLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.valueOf(input1);
        int num3 = Integer.parseInt(input1);

        ArrayList<Integer> inputNum = new ArrayList<Integer>();
        inputNum.add(num1);
        inputNum.add(num2);
        inputNum.add(num3);

        return inputNum;

    }


}
