package baseball;

import java.util.ArrayList;
import java.util.Vector;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //RandomNum r = new RandomNum();
        //InputNum i = new InputNum();

        // ArrayList<Integer>[] stbal = new ArrayList[100]; // 스트라이크 볼 횟수 담음
        int[] stbal = {0,0};   // 스트라이크 볼 횟수 담음

        for(int i = 0; i<3; i++){

            if(RandomNum().get(i) == InputNum().get(i))
                stbal[1]++;  // 위치, 값이 일치할 때 스트라이크
            else{
                for(int y = 0; y<3; y++){
                    if(InputNum().get(i) == RandomNum().get(y))
                        stbal[0]++;
                }

            }

        }

    }

    public static ArrayList<Integer> RandomNum(){
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        while(randomNum.size() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if(!randomNum.contains(num)){
                randomNum.add(num);
            } // end of if
        } // end of while

        return randomNum;
    } // end of RandomNum()



    public static ArrayList<Integer> InputNum(){

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
