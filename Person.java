package stackpersons;

public class Person 
{

	//Properties
		private String name;
		private int age;
		private Gender gender;
		
		//Constructor
		public Person(String name,int age,Gender gender)
		{
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		
		public void displayPerson()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Gender: "+gender);
		}

}
