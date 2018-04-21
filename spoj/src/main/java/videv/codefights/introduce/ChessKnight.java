package videv.codefights.introduce;

public class ChessKnight {
    int chessKnight(String cell) {
        int[][] moves = new int[][] {
                {2, 1}, {1, 2},
                {-2, 1}, {-1, 2},
                {-2, -1}, {-1, -2},
                {2, -1}, {1, -2}
        };
        int[] pos = convert(cell);
        int[] t = new int[] {0,0};
        int ans = 0;
        for (int i = 0; i < moves.length; i++) {
            t[0] = pos[0] + moves[i][0];
            t[1] = pos[1] + moves[i][1];
            if (check(t)) {
                ans++;
            }
        }
        return ans;
    }
    int[] convert(String cell) {
        return new int[] {7 - (cell.charAt(0) - 'a'), cell.charAt(1) - '1'};
    }
    boolean check(int[] pos) {
        if (pos[0] < 0 || pos[0] > 7) {
            return false;
        }
        if (pos[1] < 0 || pos[1] > 7) {
            return false;
        }
        return true;
    }

}
