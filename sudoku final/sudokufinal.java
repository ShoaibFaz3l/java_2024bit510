import java.util.Scanner;

public class sudokufinal {
    static int missingCells = 0;
    static int[][] ansgen;
    static int[][] ans;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide grid size as argument.");
            return;
        }

        int size = Integer.parseInt(args[0]);
        ans = sudokoAnsGenerator(size);
        ansgen = quetionGenerater(ans, size);

        countMissing(ansgen);

        Scanner sc = new Scanner(System.in);
        while (missingCells > 0) {
            GridBOx(size);

            System.out.println("\nMissing cells left: " + missingCells);
            System.out.print("Enter row (1 to " + size + "): ");
            int row = sc.nextInt();
            System.out.print("Enter column (1 to " + size + "): ");
            int col = sc.nextInt();
            System.out.print("Enter number to place: ");
            int num = sc.nextInt();

            if (ansgen[row - 1][col - 1] == 0) {
                ansgen[row - 1][col - 1] = num;
                missingCells--;
            } else {
                System.out.println("That cell is already filled! Try again.");
            }

            System.out.print("Continue? (1: Yes / 0: No): ");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Thanks for playing!");
                return;
            }
        }

        if (checkWin(ansgen, ans)) {
            System.out.println("🎉 Congratulations! You solved the puzzle!");
        } else {
            System.out.println("❌ Incorrect solution. Better luck next time!");
        }

        System.out.println("Game Over.");
    }

    public static void countMissing(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 0) missingCells++;
            }
        }
    }

    public static boolean checkWin(int[][] user, int[][] solution) {
        int size = user.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (user[i][j] != solution[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void GridBOx(int size) {
        int i = 0;

        for (int row = 1; row <= 2 * size + 1; row++) {
            int j = 0;
            for (int col = 1; col <= size; col++) {
                if (row % 2 != 0) {
                    System.out.print(" ---- ");
                } else if (row % 2 == 0 && col < size) {
                    String l = ansgen[i][j] + "";
                    int Size = l.length();
                    if (ansgen[i][j] == 0) {
                        System.out.print("|" + "     ");
                    } else {
                        if (Size == 1) {
                            System.out.print("|" + "  " + ansgen[i][j] + "  ");
                        } else if (Size == 2) {
                            System.out.print("|" + " " + ansgen[i][j] + "  ");
                        } else {
                            System.out.print("|" + ansgen[i][j] + "  ");
                        }
                    }
                    j++;
                }

                if (col == size && row % 2 == 0) {
                    String l = ansgen[i][j] + "";
                    int Size = l.length();
                    if (ansgen[i][j] == 0) {
                        System.out.print("|" + "     " + "|");
                    } else {
                        if (Size == 1) {
                            System.out.print("|" + "  " + ansgen[i][j] + "  " + "|");
                        } else if (Size == 2) {
                            System.out.print("|" + " " + ansgen[i][j] + "  " + "|");
                        } else {
                            System.out.print("|" + ansgen[i][j] + "  " + "|");
                        }
                    }
                    j++;
                }
            }
            if (row % 2 == 0) {
                i++;
            }
            System.out.println();
        }
    }

    public static int[][] sudokoAnsGenerator(int size) {
        int[][] ansBox = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                ansBox[row][col] = (row + col) % size + 1;
            }
        }
        return ansBox;
    }

    public static int[][] quetionGenerater(int[][] arr, int size) {
        int[][] ans = sudokoAnsGenerator(size);
        int[][] que = setZero(arr);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (que[i][j] == 0) {
                    que[i][j] = ans[i][j];
                } else {
                    que[i][j] = 0;
                }
            }
        }
        return que;
    }

    public static int[][] setZero(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int totalElements = rows * cols;
        int elementsToZero = totalElements / 3;

        while (elementsToZero > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int var1 = (int) (System.nanoTime() % (rows + rows + 1));
                    int var2 = (int) (System.currentTimeMillis() % (rows + rows + 1));
                    if (i == var1 || j == var2) {
                        if (elementsToZero <= 0) {
                            break;
                        }
                        array[i][j] = 0;
                        elementsToZero--;
                    }
                }
            }
        }
        return array;
    }
}

