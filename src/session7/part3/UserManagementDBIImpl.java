package session7.part3;

import session7.part2.User;

public class UserManagementDBIImpl implements UserManagement{
    @Override
    public void save(User user) {
        System.out.println("UserManagementDBIImpl.save");
    }

    @Override
    public User getUserByName(String name) {
        System.out.println("UserManagementDBIImpl.getUserByName");
        return null;
    }


}
