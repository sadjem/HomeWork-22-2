import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao2 userDao = new UserDao2();
       userDao.removeAll();
        User user1 = new User("Alex", 22);
        User user2 = new User("Ben", 33);
        userDao.addUser(user1);
        userDao.addUser(user2);
        userDao.close();

    }
}
