public interface UserDAO {
    User findUserByUsernameAndPassword(User user);

    User insertUser(User user);

    User findUserById(int id);

    User findUserByUsername(String username);

    List<User> findAllUser();

    User updateUser(User user); .

    boolean deleteUser(int id);
}
