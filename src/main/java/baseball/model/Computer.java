package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> numeralList;
    public Computer() {
        generateComputerNumber();
    }

    private void generateComputerNumber(){
        numeralList = new ArrayList<>();
        while (numeralList.size() < Game.ANSWER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numeralList.contains(randomNumber)) {
                numeralList.add(randomNumber);
            }
        }
    }

    public List<Integer> getNumeralList(){
        return numeralList;
    }

}
