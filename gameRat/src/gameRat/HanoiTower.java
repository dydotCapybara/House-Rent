package gameRat;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        // ����һ�� Scanner ��������ȡ�û�����
        Scanner scanner = new Scanner(System.in);

        // ��ʾ�û��������ӵ�����
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        // ���� solveHanoi ���������ŵ������
        solveHanoi(n, 'A', 'B', 'C');
    }

    // �ݹ�����ŵ������ķ���
    public static void solveHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            // �������������ֻ��һ�����ӣ�ֱ�Ӵ�Դ���ƶ���Ŀ���
            System.out.println("Move disk 1 from " + source + " to " + target);
        } else {
            // ��ǰ n-1 �����Ӵ�Դ���ƶ���������
            solveHanoi(n - 1, source, target, auxiliary);
            // ���� n �����Ӵ�Դ���ƶ���Ŀ���
            System.out.println("Move disk " + n + " from " + source + " to " + target);
            // ��ǰ n-1 �����ӴӸ������ƶ���Ŀ���
            solveHanoi(n - 1, auxiliary, source, target);
        }
    }
}
