class PatternsExample {
    static void drawDiamond(int size) {
        // Top part of the pattern
        for (int row = 1; row <= size; row++) {
            for (int spaces = 0; spaces < size - row; spaces++) {
                System.out.print("  ");
            }
            for (int symbols = 0; symbols < row * 2 - 1; symbols++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        // Bottom part of the pattern
        for (int row = size - 1; row > 0; row--) {
            for (int spaces = 0; spaces < size - row; spaces++) {
                System.out.print("  ");
            }
            for (int symbols = 0; symbols < row * 2 - 1; symbols++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    static void drawMixedDiamond(int size) {
        // Top part of the pattern
        for (int row = 1; row <= size; row++) {
            for (int spaces = 0; spaces < size - row; spaces++) {
                System.out.print("  ");
            }
            for (int symbols = 0; symbols < row * 2 - 1; symbols++) {
                if ((row + symbols) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

        // Bottom part of the pattern
        for (int row = size - 1; row > 0; row--) {
            for (int spaces = 0; spaces < size - row; spaces++) {
                System.out.print("  ");
            }
            for (int symbols = 0; symbols < row * 2 - 1; symbols++) {
                if ((row + symbols) % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void drawAlternatingDiamond(int size) {
        for (int row = 1; row < size * 2; row++) {
            int currentRow = (row <= size) ? row : size * 2 - row;

            for (int spaces = 0; spaces < size - currentRow; spaces++) {
                System.out.print("  ");
            }

            for (int symbols = 1; symbols <= currentRow * 2 - 1; symbols++) {
                if (row <= size) {
                    System.out.print((symbols % 2 != 0) ? "+ " : "  ");
                } else {
                    System.out.print((symbols % 2 != 0) ? "* " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5; // Example size, you can take input if needed
        System.out.println("Diamond Pattern:");
        drawDiamond(size);
        System.out.println("\nMixed Diamond Pattern:");
        drawMixedDiamond(size);
        System.out.println("\nAlternating Diamond Pattern:");
        drawAlternatingDiamond(size);
    }
}

