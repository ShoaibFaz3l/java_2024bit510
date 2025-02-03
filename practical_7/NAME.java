public class NAME {
    public static void main(String[] args) {
        printF();
        printA();
        printZ();
        printA();
        printL();
    }

    // Print letter 'F' (5x5 grid)
    public static void printF() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == 0 || i == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Print letter 'A' (5x5 grid)
    public static void printA() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == 0 || i == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Print letter 'Z' (5x5 grid)
    public static void printZ() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Print letter 'L' (5x5 grid)
    public static void printL() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}



// horizontal-----





public class Main {
    public static void main(String[] args) {
        // Loop to print the letters horizontally with spacing
        for (int i = 0; i < 5; i++) {
            printF(i);
            System.out.print(" "); // Space after F
            printA(i);
            System.out.print(" "); // Space after A
            printZ(i);
            System.out.print(" "); // Space after Z
            printA(i);
            System.out.print(" "); // Space after A
            printL(i);
            System.out.println(); // Newline after all letters
        }
    }

    // Print letter 'F' horizontally (5x5 grid)
    public static void printF(int i) {
        int size = 5;
        for (int j = 0; j < size; j++) {
            System.out.print((j == 0 || i == 0 || i == size / 2) ? "*" : " ");
        }
    }

    // Print letter 'A' horizontally (5x5 grid)
    public static void printA(int i) {
        int size = 5;
        for (int j = 0; j < size; j++) {
            System.out.print((j == 0 || j == size - 1 || i == 0 || i == size / 2) ? "*" : " ");
        }
    }

    // Print letter 'Z' horizontally (5x5 grid)
    public static void printZ(int i) {
        int size = 5;
        for (int j = 0; j < size; j++) {
            System.out.print((i == 0 || i == size - 1 || i + j == size - 1) ? "*" : " ");
        }
    }

    // Print letter 'L' horizontally (5x5 grid)
    public static void printL(int i) {
        int size = 5;
        for (int j = 0; j < size; j++) {
            System.out.print((j == 0 || i == size - 1) ? "*" : " ");
        }
    }
}
