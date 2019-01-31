import java.util.*;


public class Test {
    public static void main(String[] args) {
        class MapValueComparator<K,V> implements Comparator<K> {
            Map<K, V> mapToSort;
            Comparator<V> valueComparator;

            public MapValueComparator(Map<K, V> mapToSort, Comparator<V> valueComparator) {
                this.mapToSort = mapToSort;
                this.valueComparator = valueComparator;
            }

            @Override
            public int compare(K key1, K key2) {
                return valueComparator.compare(mapToSort.get(key1), mapToSort.get(key2));
            }


        }

        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> mountains = new HashMap<>();

        while(true){
            for (int i = 0; i<8;i++){
                int mountainH = in.nextInt();
                mountains.put(i, mountainH);
                Comparator<Integer> valueComparator = Integer::compareTo;
                MapValueComparator<Integer, Integer> mapComparator = new MapValueComparator<>(mountains, valueComparator);
                Map<Integer, Integer> sortedOnValuesMap = new TreeMap<>(mapComparator);
                sortedOnValuesMap.putAll(mountains);
                System.out.println(sortedOnValuesMap);
                if (i==7){
                    int j = ((TreeMap<Integer, Integer>) sortedOnValuesMap).lastKey();
                    System.out.println(j);}
            }
        }




    }
}
