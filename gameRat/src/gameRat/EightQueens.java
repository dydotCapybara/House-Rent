package gameRat;

public class EightQueens {

    public static void main(String[] args) {
        // ʹ��һά�����ʾ����
        int[] board = new int[8];
        // ��ʼ������
        for (int i = 0; i < 8; i++) {
            board[i] = -1;
        }
        System.out.println("��ʼ����");
        P p = new P();
        p.print(board);
        System.out.println("====================");
        // ��ʼ���ûʺ�
        placeQueens(board, 0);
    }

    // �ݹ麯���������ڵ� row �з��ûʺ�
    public static void placeQueens(int[] board, int row) {
        if (row == 8) {
            // �����ж�������ϣ���ӡ����
            P p = new P();
            p.print(board);
            System.out.println("====================");
            return;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col; // ���ûʺ�
                placeQueens(board, row + 1); // �ݹ������һ�еĻʺ�
                board[row] = -1; // ����
            }
        }
    }

    // ��ȫ�Լ�麯������� (row, col) �Ƿ���֮ǰ�Ļʺ��г�ͻ
    public static boolean isSafe(int[] board, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            if (board[prevRow] == col ||  // ͬ�г�ͻ
                board[prevRow] - prevRow == col - row ||  // ���Խ��߳�ͻ
                board[prevRow] + prevRow == col + row) {  // ���Խ��߳�ͻ
                return false;
            }
        }
        return true;
    }
}

class P {
    // ��ӡһά��������̱�ʾ
    public void print(int[] board) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
