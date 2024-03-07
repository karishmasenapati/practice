/*6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String)*/

import java.util.Arrays;

public class Prb6 {
    public static void main(String[] args) {
        String[] friends = {
            "Alisha",
            "Beauty",
            "Karishma",
            "Disha",
            "Ishwar",
            "Neha",
            "Monika",
            "Supriya",
            "Rajesh",
            "Azad"
        };
        Arrays.sort(friends);
        System.out.println("Sorted Names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
