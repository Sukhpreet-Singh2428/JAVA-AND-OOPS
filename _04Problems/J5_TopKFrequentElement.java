import java.util.*;

class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class J5_TopKFrequentElement {
    public static ArrayList<Integer> topKFrequent(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            mpp.put(arr.get(i), mpp.getOrDefault(arr.get(i), 0) + 1);
        }

        ArrayList<Pair> v = new ArrayList<>();
        for (int key : mpp.keySet()) {
            v.add(new Pair(key, mpp.get(key)));
        }

        Collections.sort(v, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return b.value - a.value;
            }
        });

        for (int i = 0; i < k && i < v.size(); i++) {
            ans.add(v.get(i).key);
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        ArrayList<Integer> ans = topKFrequent(arr, k);
        System.out.println(ans);
        scanner.close();
    }
}
