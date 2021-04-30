package oopDemo;

public class KodlamaIoUI {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
	       instructor1.setId(1);
	       instructor1.setName("Engin");
	       instructor1.setSurName("Demirog");
	       instructor1.setAge(30);
	       instructor1.setIdentityNumber("789456123011");
	       instructor1.setMail("demirog.engin@gmail.com");
	       instructor1.setPhoneNumber("01111111111");
	       instructor1.setsoftwareDepartment("C#");
	       
		   Student student1 = new Student();
	       student1.setId(2);
	       student1.setName("Semih");
	       student1.setSurName("KKC");
	       student1.setAge(20);
	       student1.setIdentityNumber("12345678910");
	       student1.setMail("kkcsss@gmail.com");
	       student1.setPhoneNumber("05555555555");
	       student1.setSchool("Bulent Ecevit University");
	       student1.setDepartmant("Computer Engineer");
	       student1.set_class(2);
	       
	       
	       Student student2 = new Student();
	       student2.setId(3);
	       student2.setName("Melih");
	       student2.setSurName("KKC");
	       student2.setAge(19);
	       student2.setIdentityNumber("10987654321");
	       student2.setMail("kkcmmm@gmail.com");
	       student2.setPhoneNumber("04444444444");
	       student2.setSchool("Bulent Ecevit University");
	       student2.setDepartmant("Computer Engineer");
	       student2.set_class(1);
	       
	      Student[] students = {student1,student2};
	      Instructor[] instructors = {instructor1};
	     
	     StudentManager studentManager = new StudentManager();
	     InstructorManager instructorManager = new InstructorManager();
	     studentManager.addMultiple(students);
	     instructorManager.addMultiple(instructors);
	     
	     
	     
	  
	   
	 
         
          
	     
	    
	     
	 

	}

}
