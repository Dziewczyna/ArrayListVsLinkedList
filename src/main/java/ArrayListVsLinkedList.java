import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ArrayListVsLinkedList {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    // CRUD
    // Create
    System.out.println("--CREATE--");
      System.out.println("ArrayList");
    addElementsToList(arrayList);

    System.out.println("LinkedList");
    addElementsToList(linkedList);

    // Edit
    System.out.println("--EDIT--");
    System.out.println("ArrayList");
    editElementsInList(arrayList);

    System.out.println("LinkedList");
    editElementsInList(linkedList);

    // Read
    System.out.println("--READ--");
    System.out.println("ArrayList");
    readElementsInList(arrayList);

    System.out.println("LinkedList");
    readElementsInList(linkedList);

    // Remove
    System.out.println("--REMOVE--");
    System.out.println("ArrayList");
    removeElementsFromList(arrayList);

    System.out.println("LinkedList");
    removeElementsFromList(linkedList);
  }

  public static List<String> addElementsToList(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(UUID.randomUUID().toString());
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("Create time in miliseconds: "+timeElapsed);
    return list;
  }

  public static List<String> editElementsInList(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.set(i, UUID.randomUUID().toString());
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("Edit time in miliseconds: "+timeElapsed);
    return list;
  }

  public static void readElementsInList(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.get(i);
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("Read time in miliseconds: "+timeElapsed);
  }

  public static List<String> removeElementsFromList(List<String> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.remove(0);
      //https://stackoverflow.com/questions/52995104/exception-when-removing-elements-from-arraylist
      //list.remove(i);
    }
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("Remove time in miliseconds: "+timeElapsed);
    return list;
  }

}
