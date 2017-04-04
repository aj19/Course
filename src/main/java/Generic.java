import java.util.ArrayList;
import java.util.Collection;

public class Generic {
    public static void main(String[] args) {
        String[] strArray = {"Wood", "Oil", "Gaz"};
        ArrayList arrayList = new ArrayList();
        arrayList.add("cat");
        addToCollection(arrayList, strArray);
        System.out.println(arrayList.toString());
    }

    public static <E> void addToCollection(Collection<E> collection, E[] objects) {
        for (E aObject : objects) {
            collection.add(aObject);
        }
    }
}
