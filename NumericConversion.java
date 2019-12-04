import java.util.Scanner;

public class NumericConversion {

    public static long hexStringDecode(String hex) {

        long totalDecimalOfHex = 0;
        double decEquivToHex;
        double base16Exponentiation;

        if (hex.charAt(0) == '0' && hex.charAt(1) == 'x')
            hex = hex.substring(2);

        for (int i = 0; i < hex.length(); i++) {
            decEquivToHex = hexCharDecode(hex.charAt(i));
            base16Exponentiation = decEquivToHex * Math.pow(16, hex.length()-1-i);
            totalDecimalOfHex += base16Exponentiation;
        }

        return totalDecimalOfHex;
    }

    public static short hexCharDecode(char digit) {

        short hexCharDecimalValue = 0;

        if (digit == '0')
            hexCharDecimalValue = 0;
        else if (digit == '1')
            hexCharDecimalValue = 1;
        else if (digit == '2')
            hexCharDecimalValue = 2;
        else if (digit == '3')
            hexCharDecimalValue = 3;
        else if (digit == '4')
            hexCharDecimalValue = 4;
        else if (digit == '5')
            hexCharDecimalValue = 5;
        else if (digit == '6')
            hexCharDecimalValue = 6;
        else if (digit == '7')
            hexCharDecimalValue = 7;
        else if (digit == '8')
            hexCharDecimalValue = 8;
        else if (digit == '9')
            hexCharDecimalValue = 9;
        else if (digit == 'A' || digit == 'a')
            hexCharDecimalValue = 10;
        else if (digit == 'B' || digit == 'b')
            hexCharDecimalValue = 11;
        else if (digit == 'C' || digit == 'c')
            hexCharDecimalValue = 12;
        else if (digit == 'D' || digit == 'd')
            hexCharDecimalValue = 13;
        else if (digit == 'E' || digit == 'e')
            hexCharDecimalValue = 14;
        else if (digit == 'F' || digit == 'f')
            hexCharDecimalValue = 15;

        return (hexCharDecimalValue);
    }

    public static short binaryStringDecode(String binary) {

        short totalDecimalOfBinary = 0;

        if (binary.charAt(0) == '0' && binary.charAt(1) == 'b')
            binary = binary.substring(2);

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1')
                totalDecimalOfBinary += (short)(Math.pow(2, binary.length()-1-i));
        }

        return totalDecimalOfBinary;
    }

    public static String binaryToHex(String binary) {

        short totalDecimalOfBinary = 0;
        int x = 4;
        String totalBinary = "";
        String finalTotalBinary = "";

        if (binary.charAt(0) == '0' && binary.charAt(1) == 'b')
            binary = binary.substring(2);

        for (int i = 0; i < binary.length(); i += 4) {

            binary = binary.substring(i, i + 3);

            if (binary.length() < 4)
                x = binary.length();

            for (int j = 0; j < x; j++) {
                if (binary.charAt(j) == '1')
                    totalDecimalOfBinary += (short) (Math.pow(2, x - 1 - j));
            }

            if (totalDecimalOfBinary == 0)
                totalBinary = "0";
            else if (totalDecimalOfBinary == 1)
                totalBinary = "1";
            else if (totalDecimalOfBinary == 2)
                totalBinary = "2";
            else if (totalDecimalOfBinary == 3)
                totalBinary = "3";
            else if (totalDecimalOfBinary == 4)
                totalBinary = "4";
            else if (totalDecimalOfBinary == 5)
                totalBinary = "5";
            else if (totalDecimalOfBinary == 6)
                totalBinary = "6";
            else if (totalDecimalOfBinary == 7)
                totalBinary = "7";
            else if (totalDecimalOfBinary == 8)
                totalBinary = "8";
            else if (totalDecimalOfBinary == 9)
                totalBinary = "9";
            else if (totalDecimalOfBinary == 10)
                totalBinary = "A";
            else if (totalDecimalOfBinary == 11)
                totalBinary = "B";
            else if (totalDecimalOfBinary == 12)
                totalBinary = "C";
            else if (totalDecimalOfBinary == 13)
                totalBinary = "D";
            else if (totalDecimalOfBinary == 14)
                totalBinary = "E";
            else if (totalDecimalOfBinary == 15)
                totalBinary = "F";

            finalTotalBinary += totalBinary;
        }

        return finalTotalBinary;


         /* short totalDecimalOfBinary = 0;
        String totalBinary = "";
        String finalTotalBinary = "";

        if (binary.charAt(0) == '0' && binary.charAt(1) == 'b')
            binary = binary.substring(2);

        for (int i = 0; i < (binary.length() + 3);) {

            binary = binary.substring(i);

            for (int j = 0; j < 4 && j < binary.length(); j++) {
                if (binary.charAt(j) == '1')
                    totalDecimalOfBinary += (short) (Math.pow(2, binary.length() - 1 - j));
            }

            if (totalDecimalOfBinary == 0)
                totalBinary = "0";
            else if (totalDecimalOfBinary == 1)
                totalBinary = "1";
            else if (totalDecimalOfBinary == 2)
                totalBinary = "2";
            else if (totalDecimalOfBinary == 3)
                totalBinary = "3";
            else if (totalDecimalOfBinary == 4)
                totalBinary = "4";
            else if (totalDecimalOfBinary == 5)
                totalBinary = "5";
            else if (totalDecimalOfBinary == 6)
                totalBinary = "6";
            else if (totalDecimalOfBinary == 7)
                totalBinary = "7";
            else if (totalDecimalOfBinary == 8)
                totalBinary = "8";
            else if (totalDecimalOfBinary == 9)
                totalBinary = "9";
            else if (totalDecimalOfBinary == 10)
                totalBinary = "A";
            else if (totalDecimalOfBinary == 11)
                totalBinary = "B";
            else if (totalDecimalOfBinary == 12)
                totalBinary = "C";
            else if (totalDecimalOfBinary == 13)
                totalBinary = "D";
            else if (totalDecimalOfBinary == 14)
                totalBinary = "E";
            else if (totalDecimalOfBinary == 15)
                totalBinary = "F";

            finalTotalBinary += totalBinary;

            i += 4;
        }

        return finalTotalBinary; */
    }

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int userOption;
        boolean killLoop = false;

        while (killLoop != true) {
            System.out.print("Decoding Menu" +
                    "\n-------------" +
                    "\n1. Decode hexadecimal" +
                    "\n2. Decode binary" +
                    "\n3. Convert binary to hexadecimal" +
                    "\n4. Quit" +
                    "\n" +
                    "\nPlease enter an option: ");
            userOption = scan.nextInt();

            if (userOption == 1) {
                System.out.print("Please enter the numeric string to convert: ");
                String decodeHex = scan.next();
                long hexDecoded = hexStringDecode(decodeHex);
                System.out.println("Result: " + hexDecoded + "\n");
            }

            else if (userOption == 2) {
                System.out.print("Please enter the numeric string to convert: ");
                String decodeBinary = scan.next();
                short binaryDecoded = binaryStringDecode(decodeBinary);
                System.out.println("Result: " + binaryDecoded + "\n");
            }

            else if (userOption == 3) {
                System.out.print("Please enter the numeric string to convert: ");
                String decodeBinaryToHex = scan.next();
                String binaryDecodedToHex = binaryToHex(decodeBinaryToHex);
                System.out.println("Result: " + binaryDecodedToHex + "\n");
            }

            else if (userOption == 4)
                killLoop = true;

            else
                System.out.println("Invalid Entry! Please enter a menu option between 1 and 4" +
                        "\n");
        }
    }
}

