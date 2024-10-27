# 🚘 자동차 경주
**간단한 자동차 경주 게임을 구현한다.**
## 🔧 구현할 기능 목록
#### 1. 경주할 자동차 입력 받기
- 쉼표(,) 기준으로 나눈다.
  - 나누었을 때 토큰에 공백이 있을 경우 예외 발생 (```IllegalArgumentException``` 발생)
  - 자동차 이름이 6글자 이상이면 예외 발생 (```IllegalArgumentException``` 발생)
- 자동차 이름별로 맵 형태로 저장 (이름이 키, 경주 진행 사항이 StringBuilder 형태로 저장)

#### 2. 시도할 횟수 n 입력 받기
- 횟수가 0일 경우 예외 발생 (```IllegalArgumentException``` 발생)

#### 3. for문으로 n번 반복
- 자동차 이름별로 랜덤값 받아서 전진 또는 정지 정하기
  - 0 ~ 9 사이의 무작위 값을 구한 후, 무작위 값이 4 이상일 경우 전진.
  - 0 ~ 9 사이의 무작위 값을 구한 후, 무작위 값이 3 이하일 경우 정지.
- 전진일 경우, 리스트에 - 추가. 정지일 경우 그대로.
- 횟수 진행될 때마다 결과 출력

#### 4. 맵을 돌면서 리스트 길이를 통해 우승자 정하기
- 각 리스트의 길이 저장 후 비교를 통해 우승자 정하기
- 단독 우승자의 경우 쉼표(,)없이 단독 출력
- 공동 우승자의 경우 쉼표(,)를 통해 구분해서 출력

#### 5. 자바 코드 컨벤션에 맞게 수정
- 기본적으로 [Java Style Guide](https://github.com/woowacourse/woowacourse-docs/blob/main/styleguide/java)를 원칙으로 한다.

#### 6. 프로그래밍 요구사항에 맞게 캡슐화

#### 7. JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인

#### 8. 1주차 공통 피드백 반영 여부 확인