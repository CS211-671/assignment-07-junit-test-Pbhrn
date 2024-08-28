package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;
    Student s1;
    Student s2;
    Student s3;

    @BeforeEach
    void init() {
        userList = new UserList(); // Initialize your UserList
        s1 = new Student("61xxxxxx", "Petch", 80);
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        Student foundStudent = userList.findUser("61xxxxxx");
        assertNotNull(userList.findUser("61xxxxxx"));
        assertEquals("Petch", foundStudent.getName());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        s1.setPassword("newPassword");
        boolean passwordChanged = userList.changePassword(s1.getUsername(), "newPassword");
        assertTrue(userList.changePassword("61xxxxxx", "oldPassword", "newPassword"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        User loggedInStudent = userList.login("61xxxxxx", "correctPassword");
        assertNotNull(loggedInStudent);
        assertEquals("Petch", loggedInStudent.getName());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        User loggedInStudent = userList.login("61xxxxxx", "wrongPassword");
        assertNull(loggedInStudent);
    }
}
