import java.util.LinkedList; import java.util.List;
 
public class FullNameFriendsLinkedList {
    public static void main(String[] args) {
                List<String> firstNames = List.of(
            "Sachin",
            "Sushanth",
            "David"
            
        );
                List<String> lastNames = List.of("Tendulkar", "Rajpoot", "Jones");
 
               List<String> fullNames = new LinkedList<>();
 
                for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i);
            String lastName = lastNames.get(i);
            String fullName = firstName + " " + lastName;
            fullNames.add(fullName);
        }
 
                System.out.println("My friends' full names are: " + fullNames);
    }
}