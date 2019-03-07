package Persistence;

import Model.User;

/**
 * @author Reynaldo
 */

//Sin modificador solo puede ser implementado en paquete "Persistence"
interface UserDAO {
    public boolean checkIfUsernameExists(String username);
    public boolean createUser(User newUser);
    public boolean validateUser(String userName, String password);
    public String[] readDbUserInfo(String userName);
    public boolean updateUser(User updatedUser, String oldUName, String oldPswd);
    public boolean deleteUser(String userName, String password);
}