import java.util.*;

public class Names {
    public static Map<String, String> createMap(){
        Map<String, String> mapNames = new HashMap<>();
        mapNames.put("Иванов", "Иван");
        mapNames.put("Петров", "Петр");
        mapNames.put("Кузнецов", "Иван");
        mapNames.put("Васнецов", "Василий");
        mapNames.put("Васильев", "Иван");
        mapNames.put("Козлов", "Владимир");
        mapNames.put("Сидоров", "Владислав");
        mapNames.put("Смирнов", "Игорь");
        mapNames.put("Простов", "Иван");
        mapNames.put("Портов", "Иван");
        return mapNames;
    }
//
    public static void removeTheFirstNameDuplicates(Map<String, String> map){
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            String name = pair.getValue();
            Map<String, String> mapComp = new HashMap<>(map);
            removeItemFromMapByValue(map, name);
            if (map.size() < mapComp.size()){
                map.remove(pair.getKey());
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value)
    {
        Map<String, String> copy = new HashMap<String, String>(map);
        int count = 0;
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value)) {
                if (count >= 1){
                    map.remove(pair.getKey());
                }
                count++;
            }
        }
    }
    public static void printMap(Map<String, String> map){
        for (String key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
    public static void main(String[] args){
        Map<String, String> map = Names.createMap();
        removeTheFirstNameDuplicates(map);
        Names.printMap(map);

    }
}
