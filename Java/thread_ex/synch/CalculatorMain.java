package thread_ex.synch;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1(); //User1 스레드 생성
		user1.setCalculator(calculator); //공유 객체 설정
		user1.start(); //User1 스레드 시작
		
		User2 user2 = new User2(); //User2스레드 생성
		user2.setCalculator(calculator); //공유 객체 설정
		user2.start(); //User2 스레드 시작
	}
}
