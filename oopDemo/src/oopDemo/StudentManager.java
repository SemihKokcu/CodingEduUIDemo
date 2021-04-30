package oopDemo;

public class StudentManager extends UserBaseManager {

	@Override
	public void Add(UserBase user) {
		System.out.println("Student Added"+user.getName());
		
	}

	@Override
	public void Uptade(UserBase user) {
		System.out.println("Student Uptaded"+user.getName());
		
	}

	@Override
	public void Delete(UserBase user) {
		System.out.println("Student Deleted"+user.getName());
		
	}

	@Override
	public void addMultiple(UserBase[] user) {
		for (UserBase userBase : user) {
			this.Add(userBase);
		}
		
	}

	
	
		
	
	
	
}
