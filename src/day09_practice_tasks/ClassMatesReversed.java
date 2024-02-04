package day09_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] names = { "Cansin Baycan", "Jennifer Scott", "Kara Caldwell"};


        for (int i = 0; i < names.length; i++) {
            String name = names [i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);

            }
            System.out.println(reverseName);
            }
        }





    }

