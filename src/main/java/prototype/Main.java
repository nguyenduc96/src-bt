package prototype;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        Shape s = new Circle();
        Field[] field = s.getClass().getDeclaredFields();
        Method[] methods = s.getClass().getDeclaredMethods();

        QQ qq = new QQ();
        try {
            QQ qq1 = (QQ) qq.clone();
            System.out.println(qq1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
