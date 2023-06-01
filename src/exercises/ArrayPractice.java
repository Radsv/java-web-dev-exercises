package exercises;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));
         input.close();
        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
        System.out.println("Number of students in roster: " + students.size());

    }
        /* int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < integerArray.length; i++) {
           // System.out.println(i);

            if(integerArray[i]%2!=0){
                System.out.println(integerArray[i]);
            }

        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));


        ArrayList<String> test = new ArrayList<String>();
        test.add("cat");
        test.add("place");
        test.add("dog");
        test.add("faith");
        test.add("car");
        test.add("mask");
        test.add("slipper");
        test.add("rat");
        wordList(test);

         */



    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void wordList (ArrayList <String>  args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int length = scan.nextInt();
        int size = args.size();
        String word = "";
        for(int i = 0; i < size; i++){
            word = args.get(i);
            if(word.length() == length){
                System.out.println(word);
            }

        }
    }


}