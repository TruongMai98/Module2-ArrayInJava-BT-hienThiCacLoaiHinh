import java.text.Format;

public class Main {
    public static void main(String[] args) {
        int i,j;
        for ( i = 0; i < 3; i++) {
          for (j = 0; j < 7; j++) {
              System.out.print("* ");
          }
            System.out.print("\n");
        }
// hinh chu nhat
        System.out.print("\n");

        for (i = 0; i < 6; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
// hinh tam gia vuong left
        System.out.print("\n");

        for (i = 0; i < 6; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
// hinh tam giac vuong left nguoc
        System.out.print("\n");

        for (i = 0; i < 6; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
//hinh tam giac can
        System.out.print("\n");

        for (i = 0; i < 6; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
// hinh tam giac vuong right
    }
}