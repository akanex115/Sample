
public class Clock {

    public static void main(String[] args) {
        int seconds = getSecond(18, 32, 47);
        System.out.println(seconds);
    }
    public static int getSecond(int hour, int minuite, int second) {
        int result = hour*60*60 + minuite*60 + second;
        return result;
    }

}
