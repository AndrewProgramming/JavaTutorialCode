package basic;

public class ShowCurrentTime {

  public static void main(String[] args) {
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;

    long totalMinutes = totalSeconds / 60;

    long currentMinute = totalMinutes % 60;

    System.out.println("totalMilliseconds:" + totalMilliseconds);
    System.out.println("totalSeconds:" + totalMilliseconds);
    System.out.println("totalMinutes:" + totalMinutes);
    System.out.println("currentMinute:" + currentMinute);


  }
}
