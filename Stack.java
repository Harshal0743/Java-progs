package stackpersons;

public class Stack
{
	private Person arr[];
    private int top;
    private int capacity;

    
    public Stack(int size)
    {
        capacity = size;
        arr = new Person[capacity];
        top = -1;
    }

    // push single person
    public Stack(Person[] inputArr)
    {
        capacity = inputArr.length;
        arr = new Person[capacity];
        top = -1;
        for (Person p : inputArr)
        {
            push(p);
        }
    }

    // Push single Person
    void push(Person p)
    {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + p);
            return;
        }
        arr[++top] = p;
        System.out.println("Pushed: " + p);
    }

    // Overloaded  Push 2 Persons
    void push(Person p1, Person p2)
    {
        push(p1);
        push(p2);
    }

    // Pop single Person
   public Person pop() {
        if (top == -1) 
        {
            System.out.println("Stack Underflow! No element to pop.");
            return null;
        }
        return arr[top--];
    }

    // Overloaded Pop: Pop n Persons
    void pop(int n) 
    {
        for (int i = 0; i < n; i++) {
            Person p = pop();
            if (p == null) break; 
            System.out.print("Popped: ");
            p.displayPerson();
        }
    }

    // Display all Persons
    void display()
    {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            arr[i].displayPerson();
        }
    }

    // Overloaded Display: Show top n Persons
    void display(int n) {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top " + n + " Persons:");
        for (int i = top; i >= 0 && n > 0; i--, n--) {
            arr[i].displayPerson();
        }
    }
}


