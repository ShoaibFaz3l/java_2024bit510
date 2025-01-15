import java.util.HashMap;

public class Practical4 {

    // Convert number from one system to another
    static String convertNumber(String num, String targetBase) {
        if (num.startsWith("0b")) {
            int decimalValue = binaryToDecimal(num.substring(2));
            return convertFromDecimal(decimalValue, targetBase);
        } else if (num.startsWith("0x")) {
            int decimalValue = hexToDecimal(num.substring(2));
            return convertFromDecimal(decimalValue, targetBase);
        } else if (num.startsWith("00")) {
            if (num.charAt(2) != '0') {
                int decimalValue = octalToDecimal(num.substring(1));
                return convertFromDecimal(decimalValue, targetBase);
            }
        } else {
            return "Invalid input"; // Error message for invalid format
        }
        return "";
    }

    // Decimal to binary conve
    static String decimalToBinary(int dec) {
        StringBuilder binary = new StringBuilder();
        int temp = dec;
        while (temp > 0) {
            binary.insert(0, temp % 2);
            temp /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    // Decimal to octal conversion
    static String decimalToOctal(int dec) {
        StringBuilder octal = new StringBuilder();
        int temp = dec;
        while (temp > 0) {
            octal.insert(0, temp % 8);
            temp /= 8;
        }
        return octal.length() > 0 ? octal.toString() : "0";
    }

    // Decimal to hexadecimal conversion
    static String decimalToHexadecimal(int dec) {
        StringBuilder hex = new StringBuilder();
        int temp = dec;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (temp > 0) {
            hex.insert(0, hexChars[temp % 16]);
            temp /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }

    // Octal to decimal conversion
    static int octalToDecimal(String octal) {
        int decimal = 0, power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * Math.pow(8, power++);
        }
        return decimal;
    }

    // Hexadecimal to decimal conversion
    static int hexToDecimal(String hex) {
        int decimal = 0, power = 0;
        HashMap<Character, Integer> hexMap = createHexMap();
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int value = Character.isDigit(c) ? c - '0' : hexMap.getOrDefault(c, -1);
            decimal += value * Math.pow(16, power++);
        }
        return decimal;
    }

    // Binary to decimal conversion
    static int binaryToDecimal(String binary) {
        int decimal = 0, power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power++);
        }
        return decimal;
    }

    // Helper method to create hex map
    private static HashMap<Character, Integer> createHexMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) map.put((char) ('0' + i), i);
        for (char c = 'A'; c <= 'F'; c++) map.put(c, 10 + (c - 'A'));
        for (char c = 'a'; c <= 'f'; c++) map.put(c, 10 + (c - 'a')); // Support lowercase hex digits
        return map;
    }

    // Convert from decimal to any target base
    static String convertFromDecimal(int decimal, String targetBase) {
        switch (targetBase.toLowerCase()) {
            case "binary":
                return decimalToBinary(decimal);
            case "octal":
                return decimalToOctal(decimal);
            case "hexadecimal":
                return decimalToHexadecimal(decimal);
            default:
                return "Invalid target base";
        }
    }

    // Convert int to byte within range
    static int toByte(int num) {
        int result = num % 256;
        if (result < -128) return result + 256;
        if (result > 127) return result - 256;
        return result;
    }

    // Convert int to short within range
    static int toShort(int num) {
        int result = num % 65536;
        if (result < -32768) return result + 65536;
        if (result > 32767) return result - 65536;
        return result;
    }

    // Get number within specific range (byte or short)
    static int intGetNumber(int num, String type) {
        type = type.toLowerCase();
        if (type.equals("byte")) return toByte(num);
        if (type.equals("short")) return toShort(num);
        return 0; // Invalid type
    }
}

