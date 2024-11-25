package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements Repository<User>{
    private Map<Long, User> userBase = new HashMap<>();

    @Override
    public void save(User user) {
        userBase.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        userBase.remove(user.getId());
    }

    @Override
    public User findById(Long id) {
        return userBase.get(id);
    }
    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Long, User> entry : userBase.entrySet()) {
            Long key = entry.getKey();
            User user = entry.getValue();
            result += "Пользователь № " + key + ": " + user.toString() + "\n";
        }
        return result;
    }

}
