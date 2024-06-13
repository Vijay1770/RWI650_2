//CHECKED EXCEPTION...
public class Exception_Handling {
/*
        public static void E_H() throws Exception {
            throw new Exception("An error occurred in E_H()!");
        }

        public static void main(String[] args) {
            try {
                E_H();
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println("Program continues...");
        }
    }

 */
//UNCHECKED EXCEPTION...

    public static void main(String[] args) {
        try {
            // Simulating an unchecked exception
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            // Handle the unchecked exception
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

    // Method that may throw an unchecked exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}