public class DiagonalSumSolution {

    public static void main(String[] args) {

        Integer[][] values = {
                {11, 2, 4},
                {4, -5, 6},
                {10, 8, 12}
        };
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        int startIndex = 0;
        int backIndex = values.length - 1;

        for (int i = 0; i < values.length; i++) {
            rightDiagonal += values[i][startIndex++];
            leftDiagonal += values[i][backIndex--];
        }

        System.out.println(rightDiagonal);
        System.out.println(leftDiagonal);

        System.out.println(rightDiagonal+leftDiagonal);

    }

    public static void tryOne() {
        Integer[][] values = {
                {11, 2, 4},
                {4, -5, 6},
                {10, 8, 12}
        };
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        for (int i = 0; i < values.length; i++) {
            rightDiagonal += values[i][i];
        }
        int i = 0;
        for (int j = values.length - 1; j >= 0; j--) {
            leftDiagonal += values[i++][j];
        }
        System.out.println(rightDiagonal);
        System.out.println(leftDiagonal);
        System.out.println(rightDiagonal + leftDiagonal);
    }
}
