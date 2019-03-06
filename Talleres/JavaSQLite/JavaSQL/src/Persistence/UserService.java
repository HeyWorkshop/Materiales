package Persistence;

import Model.User;

/**
 * @author Reynaldo
 */
public class UserService {
    private final UserDAOImpl userDaoImpl = new UserDAOImpl(); //Para poder realizar acciones con la Base de Datos
    
    public boolean checkIfUsernameExists(String userName) {
        return userDaoImpl.checkIfUsernameExists(userName);
    }

    public boolean createUser(User newUser) {
        return userDaoImpl.createUser(newUser);
    }

    public boolean validateUser(String userName, String password) {
        return userDaoImpl.validateUser(userName, password);
    }
    
    public String[] readDbUserInfo(String userName) {
        return userDaoImpl.readDbUserInfo(userName);
    }
    
    public boolean updateUser(User updatedUser, String oldUName, String oldPswd) {
        return userDaoImpl.updateUser(updatedUser, oldUName, oldPswd);
    }
    
    public boolean deleteUser(String userName, String password) {
        return userDaoImpl.deleteUser(userName, password);
    }
}