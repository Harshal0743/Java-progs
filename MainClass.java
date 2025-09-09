package stackpersons;
import java.util.*;
public class MainClass 
{
	

	public class TicketCounterStack {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack st = null;

	        System.out.println("Choose initialization:");
	        System.out.println("1. Empty stack with size");
	        System.out.println("2. Stack initialized with array of Persons");
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume newline

	        if (choice == 1) {
	            System.out.print("Enter size: ");
	            int size = sc.nextInt();
	            sc.nextLine();
	            st = new Stack(size);
	        } else if (choice == 2) {
	            System.out.print("Enter number of Persons: ");
	            int n = sc.nextInt();
	            sc.nextLine();
	            Person arr[] = new Person[n];
	            for (int i = 0; i < n; i++) {
	                arr[i] = readPerson(sc);
	            }
	            st = new Stack(arr);
	        }

	        int option;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Push one Person");
	            System.out.println("2. Push two Persons");
	            System.out.println("3. Pop one Person");
	            System.out.println("4. Pop multiple Persons");
	            System.out.println("5. Display all Persons");
	            System.out.println("6. Display top n Persons");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            option = sc.nextInt();
	            sc.nextLine();

	            switch(option) {
	                case 1:
	                    Person p1 = readPerson(sc);
	                    st.push(p1);
	                    break;

	                case 2:
	                    System.out.println("Enter details for first person:");
	                    Person pp1 = readPerson(sc);
	                    System.out.println("Enter details for second person:");
	                    Person pp2 = readPerson(sc);
	                    st.push(pp1, pp2);
	                    break;

	                case 3:
	                    Person popped = st.pop();
	                    if (popped != null) {
	                        System.out.print("Popped: ");
	                        popped.displayPerson();
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter number of Persons to pop: ");
	                    int n = sc.nextInt();
	                    sc.nextLine();
	                    st.pop(n);
	                    break;

	                case 5:
	                    st.display();
	                    break;

	                case 6:
	                    System.out.print("Enter number of top Persons: ");
	                    int topN = sc.nextInt();
	                    sc.nextLine();
	                    st.display(topN);
	                    break;

	                case 7:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while(option != 7);

	        sc.close();
	    }
	    private static Person readPerson(Scanner sc) {
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
	        String g = sc.nextLine().trim().toUpperCase(); // ✅ trim spaces
	        Gender gender = Gender.valueOf(g);

	        return new Person(name, age, gender);
	    }

	}
}

	   

	

