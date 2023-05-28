package GProjet2;


    // Testing the code
    public class MarksTester {
        public static void main(String[] args) {
            // Creating student A object
            Marks studentA = new A(80, 90, 70);
            double percentageA = studentA.getPercentage();
            System.out.println("Student A Percentage: " + percentageA + "%");

            // Creating student B object
            Marks studentB = new B(75, 85, 80, 90);
            double percentageB = studentB.getPercentage();
            System.out.println("Student B Percentage: " + percentageB + "%");
        }
    }
