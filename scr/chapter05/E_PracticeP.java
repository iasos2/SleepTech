package chapter05;


class BaseballPlayer {
	// === 인스턴스 변수 ===
	String name;
	double battingAverage;
	int homeRuns;
	
	// === 정적(클래스) 변수 ===
	static int playerCount;
	
	// == 생성자==
	// +) 필드값 초기화 &  정적 변수 후위 증가
	BaseballPlayer(String name, double battingAverage, int homeRuns){
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		
		playerCount++;
	}
	// 1) 인스턴스 메서드
	void updateStatus(double newBattingAverage, int newHomeRuns) {
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}
	
	// 2) 정적 메서드
	// : 특정 홈런 수 이상인 선수률 평가
	static String evaluateHomeRun(int homeRunCount) {
		if (homeRunCount > 20) {
			return "홈런상 후보에 등록됩니다.";
		} else {
			return "홈런상 후보에 등록될 수 없습니다.";
		}
	}
}
public class E_PP {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		BaseballPlayer Player1 = new BaseballPlayer("조민지", 0.325, 12);
		BaseballPlayer Player2 = new BaseballPlayer("문창배", 0.315, 21);
		BaseballPlayer Player3 = new BaseballPlayer("윤영서", 0.285, 14);
		BaseballPlayer Player4 = new BaseballPlayer("고혁재", 0.301, 11);

		System.out.println("총 생성된 선수의 수: " + BaseballPlayer.playerCount);
		// 총 생성된 선수의 수: 4
		
		Player2.updateStatus(0.213, 22);
		System.out.println(Player2.battingAverage); // 0.213
		
		System.out.println(BaseballPlayer.evaluateHomeRun(Player3.homeRuns));
		System.out.println(BaseballPlayer.evaluateHomeRun(Player1.homeRuns));
	}

}
