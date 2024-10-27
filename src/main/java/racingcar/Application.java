package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        // 맵 형태로 자동차 상황 기록
        HashMap<String, StringBuilder> carStates = new HashMap<>();

        // 자동차 입력 받고 쉼표 기준으로 나누기
        String inputCarNames = Console.readLine();
        String[] carNamesList = inputCarNames.split(",");

        for (String carName : carNamesList) {
            // 나눌 때 앞뒤로 있을 수 있는 공백 제거
            carName = carName.trim();
            // 공백이 있거나 자동차 이름이 6글자 이상이면 예외 발생
            if (carName == null || carName.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 공백입니다.");
            } else if (carName.length() >= 6) {
                throw new IllegalArgumentException("자동차 이름이 6글자 이상입니다.");
            }
            carStates.put(carName, new StringBuilder());
        }

        // 시도할 횟수 입력 받기
        String tryNumStr = Console.readLine();
        // String을 숫자로 변경
        if(tryNumStr.matches("^[0-9]+$")) {
            int tryNum = Integer.parseInt(tryNumStr);
            if(tryNum == 0){
                throw new IllegalArgumentException("1 이상의 숫자를 입력하세요");
            }
        } else {
            // 숫자가 아닐 경우 예외 발생
            throw new IllegalArgumentException("숫자가 아닙니다. 다시 입력하세요.");
        }
    }
}
