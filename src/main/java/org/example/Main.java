package org.example;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.save(new User(1L, "Ворошилов","Климент", "Ефремович", 12345, "Красная площадь д.1"));
        userRepository.save(new User(2L, "Чапаев","Василий", "Иванович", 19823, "Красная площадь д.2"));
        userRepository.save(new User(3L, "Буденный","Семен", "Михайлович", 32342, "Красная площадь д.3"));
        System.out.println(userRepository.toString());
    }
}