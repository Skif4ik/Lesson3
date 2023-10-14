import java.util.Arrays;
import java.util.SimpleTimeZone;

public class Main1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] arr1 = new int[SIZE];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //foreach
        //for(тип имя_переменной : перебираемый массив){
        //имя переменной
        //}

        //foreach прячет индексацию элементов от 0 до length внутри себя
        //переменная i каждую итерацию получит значение элемента массива
        //подходит для перебора только всех элемента массива

        for (int i : arr1) {
            //i = arr1[i]
            System.out.print(i + " ");
        }

        System.out.println();

        //т.к. foreach копирует в переменную копии элемента массива то элементы
        // массивов примитивов при помощи foreach изменять нельзя
        for (int i : arr1) {
            i = (int) (Math.random() * 10);

        }

        for (int i : arr1) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr1));
        int num = 3;//удалить третий элемент из массива

        //System.arraycopy(масс_откуда, поз_откуда, массив_куда, позиция_куда, сколько);


        //УДАЛЕНИЕ ЭЛЕМЕНТА МАССИВА ПРИ ПОМОЩИ ARRAYCOPY
        System.arraycopy(arr1, num, arr1, num-1, arr1.length-num);
        System.out.println(Arrays.toString(arr1));
        arr1 = Arrays.copyOf(arr1, arr1.length -1);
        System.out.println(Arrays.toString(arr1));


    }
}
