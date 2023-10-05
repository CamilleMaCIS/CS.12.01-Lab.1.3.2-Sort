import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        boolean hasSwapped = true;
        int j = 0;

        while(hasSwapped){
            hasSwapped = false;
            for (int i = 0; i < array.length - 1 - j; i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    hasSwapped = true;
                }
            }
            j++;
        }

        return array;
    }

    public static String[] bubbleSort(String[] array){
        boolean hasSwapped = true;
        int j = 0;

        while(hasSwapped){
            hasSwapped = false;
            for (int i = 0; i < array.length - 1 - j; i++){
                //convert to lowercase before comparing, because uppercase chars come before lowercase chars
                String lowerCaseI = array[i].toLowerCase();
                String lowerCaseIPlusOne = array[i+1].toLowerCase();

                if (lowerCaseI.compareTo(lowerCaseIPlusOne) > 0){
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    hasSwapped = true;
                }
            }
            j++;
        }

        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean hasSwapped = true;
        int j = 0;

        while(hasSwapped){
            hasSwapped = false;
            for (int i = 0; i < list.size() - 1 - j; i++){
                if (list.get(i) > list.get(i+1)){
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    hasSwapped = true;
                }
            }
            j++;
        }

        return list;
    }

    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            //finding the minimum
            int minIndex = i;
            for (int j = i+1; j < array.length; j++){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            //swapping
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int i = 0; i < array.length; i++){
            //finding the minimum
            int minIndex = i;
            for (int j = i+1; j < array.length; j++){
                //convert to lowercase before comparing, because uppercase chars come before lowercase chars
                String lowerCaseMin = array[minIndex].toLowerCase();
                String lowerCaseJ = array[j].toLowerCase();

                if (lowerCaseMin.compareTo(lowerCaseJ) > 0){
                    minIndex = j;
                }
            }
            //swapping
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++){
            //finding the minimum
            int minIndex = i;
            for (int j = i+1; j < list.size(); j++){
                //convert to lowercase before comparing, because uppercase chars come before lowercase chars
                String lowerCaseMin = list.get(minIndex).toLowerCase();
                String lowerCaseJ = list.get(j).toLowerCase();

                if (lowerCaseMin.compareTo(lowerCaseJ) > 0){
                    minIndex = j;
                }
            }
            //swapping
            String temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

        return list;

    }

}
