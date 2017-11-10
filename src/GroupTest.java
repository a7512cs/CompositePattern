import java.util.ArrayList;
import java.util.ListIterator;

public class GroupTest {

    public static void main(String[] args) {

        // ��Ʈw
        ArrayList<Component> AllComponent = new ArrayList<Component>();

        Leaf E1 = new Leaf("A");
        AllComponent.add(E1);// �s�J�@�Ӫ�����Ʈw

        Composite C1 = new Composite("C1");// �Ф@��group�n��E2E3�˶i�h
        Leaf E2 = new Leaf("E2");
        Leaf E3 = new Leaf("E3");
        C1.addComponent(E2);
        C1.addComponent(E3);
        AllComponent.add(C1);// �s�J�ĤG�Ӫ�����Ʈw

        Composite C2 = new Composite("C2");// �Ф@��group�n��E4�˶i�h
        Leaf E4 = new Leaf("E4");
        C2.addComponent(E4);
        Composite C3 = new Composite("C3");// �Ф@��group�n��C2E5�˶i�h
        Leaf E5 = new Leaf("E5");
        C3.addComponent(C2);
        C3.addComponent(E5);
        AllComponent.add(C3);// �s�J�a�T�Ӫ�����Ʈw

        // ������ƦL�X��
        ListIterator<Component> iterator = AllComponent.listIterator();
        while (iterator.hasNext()) {
            Component c = iterator.next();
            c.op();
        }
    }

}
