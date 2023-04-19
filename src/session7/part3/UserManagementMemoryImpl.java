package session7.part3;

import session7.part2.User;

public class UserManagementMemoryImpl implements UserManagement,Print{
    @Override
    public void save(User user) {
        System.out.println("UserManagementMemoryImpl.save");
    }

    @Override
    public User getUserByName(String name) {
        System.out.println("UserManagementMemoryImpl.getUserByName");
        return null;
    }

    @Override
    public void print(User user) {
        System.out.println("UserManagementMemoryImpl.print");
//        UserManagement.super.print(user);
        System.out.println("printing user");
    }

    @Override
    public void printV2() {
        System.out.println("UserManagementMemoryImpl.printV2");
    }

}
