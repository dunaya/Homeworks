import java.util.*;

public class User {
    private int age;
    private String surname;
    private String name;
    public User(String name, String surname, int age){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
    public static ArrayList<User> createUsers(){
        ArrayList<User> users = new ArrayList<>(8);
        String[] names = {"Petrov", "Ivanov", "Vasiliev", "Kuznetsov", "Kozlov", "Pechorin", "Dubrovskiy", "Pushkin"};
        String[] surnames = {"Petr", "Ivan", "Vasiliy", "kuznets", "Koz", "Pech", "Dubr", "Sergey"};
        int[] ages = {1, 2, 3, 4, 1, 2, 3, 4};
        for (int i = 0; i < 8; i ++){
            User user = new User(names[i], surnames[i], ages[i]);
            users.add(user);
        }
        return users;
    }
    public static Map<Integer, List<User>> processUsers(ArrayList<User> users){
        Map<Integer, List<User>> usersMap = new HashMap<>();
        for (int i = 0; i < 8; i ++){
            User user = users.get(i);
            int age = user.getAge();
            if (usersMap.containsKey(age)){
                usersMap.get(age).add(user);
            }
            else{
                List<User> usersList = new ArrayList<>();
                usersList.add(user);
                usersMap.put(age, usersList);
            }
        }
        return usersMap;
    }
    public static void printUserMap(Map<Integer, List<User>> map){
        for (Integer key: map.keySet()){
            List<User> value = map.get(key);
            System.out.print("Age:" + key + ": ");
            for (int i = 0; i < value.size(); i ++){
                System.out.print(value.get(i).getName() + " " + value.get(i).getSurname() + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        printUserMap(processUsers(createUsers()));
    }
}
