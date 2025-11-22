import java.util.HashMap;
import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class J1_LinkedListFrequency {

    public static Node LL_frequency(Node head){
        if(head == null) return null;
        if(head.next == null){
            head.data = 1;
            return head;
        }
        Node temp = head;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        while(temp != null){
            mpp.put(temp.data, mpp.getOrDefault(temp.data, 0)+1);
            temp = temp.next;
        }

        temp = head;
        Node prev = null;
        for(int key : mpp.keySet()){
            temp.data = mpp.get(key);
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;

        return head;
    }

    public static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    public static void printLL(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Node head = convertArrToLL(arr);
        printLL(head);

        head = LL_frequency(head);
        printLL(head);
    }
}
