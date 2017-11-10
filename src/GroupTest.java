import java.util.ArrayList;
import java.util.ListIterator;

public class GroupTest {

    public static void main(String[] args) {

        // 資料庫
        ArrayList<Component> AllComponent = new ArrayList<Component>();

        Leaf E1 = new Leaf("A");
        AllComponent.add(E1);// 存入一個物件到資料庫

        Composite C1 = new Composite("C1");// 創一個group要把E2E3裝進去
        Leaf E2 = new Leaf("E2");
        Leaf E3 = new Leaf("E3");
        C1.addComponent(E2);
        C1.addComponent(E3);
        AllComponent.add(C1);// 存入第二個物件到資料庫

        Composite C2 = new Composite("C2");// 創一個group要把E4裝進去
        Leaf E4 = new Leaf("E4");
        C2.addComponent(E4);
        Composite C3 = new Composite("C3");// 創一個group要把C2E5裝進去
        Leaf E5 = new Leaf("E5");
        C3.addComponent(C2);
        C3.addComponent(E5);
        AllComponent.add(C3);// 存入地三個物件到資料庫

        // 全部資料印出來
        ListIterator<Component> iterator = AllComponent.listIterator();
        while (iterator.hasNext()) {
            Component c = iterator.next();
            c.op();
        }
    }

}
