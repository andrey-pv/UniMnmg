
public class UserService {

	private User[] users = new User[100];
	
	private int lastUserIndex = 0;
	
	public User create(int userId, String fn, String ln, float salary, int numberOfHolidaDays) {
		if (userId > 0 && fn != null && !fn.isEmpty() && ln != null && !ln.isEmpty()) {
			if (lastUserIndex < 100) {
				users[lastUserIndex] = new User();
				users[lastUserIndex].setId(userId);
				users[lastUserIndex].setFirstName(fn);
				users[lastUserIndex].setLastName(ln);
				users[lastUserIndex].setSalary(salary);
			}
		}
		
		return users[lastUserIndex++];
	}
	
	public User update(int userId, String fn, String ln, float salary, int numberOfHolidaDays) {
		User updatedUser = null;
		
		for (int currentIndex = 0; currentIndex <= lastUserIndex; currentIndex++) {
			if (users[currentIndex].getId() == userId) {
				updatedUser = users[currentIndex];
				if (fn != null && !fn.isEmpty()) {
					updatedUser.setFirstName(fn);
				}
				if (ln != null && !ln.isEmpty()) {
					updatedUser.setLastName(ln);
				}
				if (salary > 0) {
					updatedUser.setSalary(salary);
				}
				if (numberOfHolidaDays > 0) {
					updatedUser.setNumberofHolidaDays(numberOfHolidaDays);
				}
				
				break;
			}
		}
		
		return updatedUser;
	}
	
	public void delete(int userId) {
		int currentIndex = 0;
		boolean isUserExists = false;
		for (; currentIndex <= lastUserIndex; currentIndex++) {
			if (users[currentIndex].getId() == userId) {
				isUserExists = true;
				users[currentIndex] = null;
				
				break;
			}
		}
		
		if (isUserExists) {
			for (int index = currentIndex; currentIndex < lastUserIndex; currentIndex++) {
				users[currentIndex] = users[currentIndex + 1];
			}
			lastUserIndex--;
		}
	}
	
	public User getUserById(int userId) {
		for (int currentIndex = 0; currentIndex <= lastUserIndex; currentIndex++) {
			if (users[currentIndex] != null) {
				if (users[currentIndex].getId() == userId) {
					return users[currentIndex];
				}
			}
		}
		
		return null;
	}
}
