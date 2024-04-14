public class Homework {
    /**
     * Задача 1
     * Метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    /**
     * Задача 2
     * Функция, возвращающая разницу между самым большим и самым маленьким элементами переданного не пустого массива.
     */
    public int differenceMinMax(int[] array){
        if(array == null){
            return 0;
        }
        boolean flag = false;
        do{
            for (int i = 0; i < array.length-1; i++) {
                flag = false;
                if(array[i] > array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }while (!flag);

        return array[array.length-1] - array[0];
    }
    /**
     * Задача 3
     * Функция, возвращающая истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */
    public boolean haveZeroNeighbors(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(((array[i] == 0) && (array[i + 1] == 0))){
                return true;
            }
        }
        return false;
    }
}
