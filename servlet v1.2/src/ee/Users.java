package ee;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Users{
    private static final Users instance = new Users();
    private static List<User> list;

    public static synchronized Users getInstance(){
        if (list == null){
            list = new LinkedList<>();
        }
        return instance;
    }

    public boolean addUser(User user){
        if (list.stream().anyMatch(u -> user.getName().equals(u.getName()))){
            return false;
        } else {
            list.add(user);
            return true;
        }
    }

    public List<String> getNames(){
        return list.stream().map(User::getName).collect(Collectors.toList());
    }
    public List<String> getPasswords(){
        return list.stream().map(User::getPassword).collect(Collectors.toList());
    }

}
