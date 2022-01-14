public class Main {

    public static void main(String[] args) {

        // Task 1
        System.out.println("\n----- TASK 1 -----\n");
        System.out.println("Halo");
        System.out.println("Teguh");
        
        // Task 2
        /*
         Ada 2 cara untuk mengerjakan task ini,
         yaitu dengan menggunakan print karakter per karakter
         dan menggunakan array 
         */

         // Task 2 - Cara 1
         System.out.println("\n----- TASK 2.1 -----\n");
         System.out.println(" +\"\"\"\"\"+ ");
         System.out.println("[| o o |]");
         System.out.println(" |  ^  | ");
         System.out.println(" | '-' | ");
         System.out.println(" +-----+ ");

         // Task 2 - Cara 2
         System.out.println("\n----- TASK 2.2 -----\n");
         String[] faces = new String[5];

         faces[0] = " +\"\"\"\"\"+ ";
         faces[1] = "[| o o |]";
         faces[2] = " |  ^  | ";
         faces[3] = " | '-' | ";
         faces[4] = " +-----+ ";

         for (int i = 0; i < faces.length; i++) {
             System.out.println(faces[i]);
         }

    }

}