public class ArrOfAnyType <E>
{
    public E[] arr;

    public ArrOfAnyType(E[] arr) {
        this.arr = arr;
    }
    public ArrOfAnyType() {}

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }
    public int getLength()
    {
        return arr.length;
    }
    public E getElementByIndex(int i)
    {
        return arr[i];
    }
}
