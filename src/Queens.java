import java.util.Arrays;

class Queens
{

    private static boolean isSafe(char[][] mat, int r, int c)
    {

        for (int i = 0; i < r; i++)
        {
            if (mat[i][c] == 'x') {
                return false;
            }
        }


        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
        {
            if (mat[i][j] == 'x') {
                return false;
            }
        }


        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++)
        {
            if (mat[i][j] == 'x') {
                return false;
            }
        }

        return true;
    }

    private static void printSolution(char[][] mat)
    {
        for (char[] chars: mat) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }

    private static void nQueen(char[][] mat, int r)
    {

        if (r == mat.length)
        {
            printSolution(mat);
            return;
        }


        for (int i = 0; i < mat.length; i++)
        {

            if (isSafe(mat, r, i))
            {

                mat[r][i] = 'x';


                nQueen(mat, r + 1);


                mat[r][i] = 'o';
            }
        }
    }

    public static void main(String[] args)
    {

        int N = 8;


        char[][] mat = new char[N][N];


        for (int i = 0; i < N; i++) {
            Arrays.fill(mat[i], 'o');
        }

        nQueen(mat, 0);
    }
}