public class ArrayStack<T> implements Stack<T> {

    T[] array;         // array of items
    int top;       // number of elements on stack

    //Constructor
    ArrayStack() {
        array = (T[]) new Object[10];
        top = -1;
    }

    public T pop(){
        if (empty()){
            throw new IndexOutOfBoundsException();
        }
        return array[top--];
    }

    public void push(T value){
        if (top == array.length - 1)
            increaseCapacity();
        array[++top] = value;
    }

    public T peak(){
        if (empty()){
            throw new IndexOutOfBoundsException();
        }
        return array[top];
    }

    public boolean empty(){
        if (top == -1) {
            return true;
        }
        else
            return false;
    }
    void increaseCapacity(){
        T[] temp = array;
        array = (T[]) new Object[temp.length*2];
        for (int i = 0; i < temp.length; i++)
            array[i] = temp[i];
    }
}
