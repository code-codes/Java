import java.util.*;
class LaunchSer14 {
    public static void main(String[] args) {
        StringTokenizer stk = new StringTokenizer("sachin$ramesh$tendulkar","$");

        System.out.println(stk);
        int tokenCount = stk.countTokens();
        System.out.println(tokenCount);
        while (stk.hasMoreTokens()) {
            String data = stk.nextToken();
            System.out.println(data);
        }
    }
}
