
public class TestUser {
	
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User user1 = userService.create(1, "Ivancho", "Petroc", 200, 5);
		User user2 = userService.create(2, "Maria", "Petroc", 200, 5);
		User user3 = userService.create(3, "Gosho", "Dran", 2000, 5);
		
		System.out.println(userService.getUserById(1));
		
		System.out.println(" user id " + user1.getId() + " first name " + user1.getFirstName()
		 + " last name" + user1.getLastName());

		user1 = userService.update(1, "Ivanka", null, -1, -1);
		
		System.out.println(" user id " + user1.getId() + " first name " + user1.getFirstName()
		 + " last name" + user1.getLastName());
		
		userService.delete(1);
		
		System.out.println(userService.getUserById(1));
		
	}

}
