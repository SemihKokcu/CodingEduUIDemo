package oopDemo;

public class InstructorManager extends UserBaseManager {

	@Override
	public void Add(UserBase user) {
		System.out.println("Instructor Added"+user.getName());
		
	}

	@Override
	public void Uptade(UserBase user) {
		System.out.println("InstructorAdded"+user.getName());
		
	}

	@Override
	public void Delete(UserBase user) {
		System.out.println("Instructor Added"+user.getName());
		
	}

	@Override
	public void addMultiple(UserBase[] user) {	
		for (UserBase userBase : user) {
			this.Add(userBase);
		}
	}

}
