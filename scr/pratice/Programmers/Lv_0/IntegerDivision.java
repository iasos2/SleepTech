// 실수 -> 정수 후 1000 곱하기
class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }
}
