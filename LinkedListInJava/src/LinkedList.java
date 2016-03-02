public class LinkedList<I> implements MyInterface {
    private Node<I> first;
    private int size;
    private int iteratorIndex;

    public LinkedList() {
        this.first = null;
        size = 0;
    }

    public void add(I data) {
        addFirst(data);
    }

    public void addFirst(I data) {
        Node<I> e = new Node<>(data);
        e.next = first;
        first = e;
        size++;
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || size < index)
            throw new IndexOutOfBoundsException("Size is " + size + "you can't insert to position " + index);
    }

    public void add(int index, I data) {
        checkPositionIndex(index);

        if (index == 0)
            addFirst(data);
        else {
            Node element = first;

            for (int i = 0; i < index - 1; i++) {
                element = element.next;
            }

            element.next = new Node<>(data, element.next);
            size++;
        }
    }

    public void addLast(I data) {
        if (first == null)
            addFirst(data);
        else {
            Node<I> element = first;

            while (element.next != null)
                element = element.next;

            element.next = new Node<>(data);
            size++;
        }
    }


    private void checkElementIndex(int index) {
        if (index < 0 || size <= index)
            throw new IndexOutOfBoundsException("Size is " + size + "you can't access the element from " + index);
    }

    public I get(int index) {
        checkElementIndex(index);

        Node<I> element = first;
        for (int i = 0; i < index; i++)
            element = element.next;

        return element.value;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean hasNext() {
        return iteratorIndex < size;
    }

    @Override
    public I next() {
        return get(iteratorIndex++);
    }

    public MyInterface iterator() {
        return this;
    }

}
