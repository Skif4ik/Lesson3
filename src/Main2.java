import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        //перед созданием объекта класса String
        //анализируются символы, если строка состоит из первых 127 символов таблицы юникод, то:
        String str1 = "Ivan";//внутри массив байт из 4 элементов
        //иначе массив байт будет в 2 раза длиннее
        String str2 = "Иван";//внутри массив байт из 8 элементов
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(Arrays.toString(str2.getBytes()));

        //объесты класса String являются неизменяемыми (immutable), т.е.
        //любая попытка изменения строки приведет к созданию нового объекта
        //str1[0] нельзя напрямую обратится к конкретному элементу как с обычным массивом
        System.out.println(str1.charAt(0));//метод возвращает символ по индексу, но не дает возможности изменить

        String str3 = "Ivan";
        //при подобном создании объектов класса String объекты помещаются
        // в String pool - особую часть heap, хранящую неповторяющиеся строки

        System.out.println(str1 == str3); //сравнение ссылок на объекты
        //две ссылки на один и тот же объект
        String str4 = new String("Ivan");//при таком создании объект класса
        // String не попадает в String pool, а в общую часть heap

        System.out.println(str1 == str4);//ссылки на разные объекты
        // для посимвольного сравнения строк используют метод equals

        System.out.println(str1.equals(str4));//истина, т.к. объекты полностью идентичны

        String str5 = "Mama mila ramu";
        String[] words = str5.split(" ");//разобьет строку на массив строк и вернет его

        System.out.println(Arrays.toString(words));

        String str6 ="                   Ivan                   ";
        str6 = str6.trim();//удаляет лидирующие пробельные символы

        System.out.println(str1 == str6);//false, т.к. методы создающие строки помещают их в heap

        //str6.intern() проверяет есть ли такая строка в String pool и если есть то вернет ссылку на нее
        str6 = str6.intern();
        System.out.println(str1 == str6);//теперь true

        str3 = str3.toUpperCase();
        System.out.println(str3);

        System.out.println(str1.indexOf("va"));//проверяет входит ли подстрока в строку, если
        // входит то возвращает индекс первого вхождения. Если не входит возвращает -1

        str3.substring(1,5);  //вернет часть текста по индексам с 1 до конца или с 1 до другого


    }
}
