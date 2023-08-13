public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();


        User user1 = new User(1, "Alex",17);
        userDao.addUser(user1);

        User user2 = new User(2, "Aziz",20);
        userDao.addUser(user2);



        User foundUser = userDao.getUserById(1);
        if (foundUser != null) {
            System.out.println("Найден пользователь: " + foundUser.getName());
        } else {
            System.out.println("Пользователь с идентификатором 2 не найден!");
        }
    }
}