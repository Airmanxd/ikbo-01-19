public class Lab10 {
    public static void main(String[] args) {
        Double[] arr = {10.2, 10.4, 2.5, 13.4, 14.7};
        ArrOfAnyType<Double> doublearr = new ArrOfAnyType<Double>();
        doublearr.setArr(arr);
        System.out.println(doublearr.getElementByIndex(3));
        Integer[] arrai = {1, 2, 3, 4 ,5};
        ArrOfAnyType<Integer> integerarray = new ArrOfAnyType<Integer>(arrai);
        System.out.println(integerarray.getElementByIndex(1));

    }

}
