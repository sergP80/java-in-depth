package ua.edu.chmnu.advanced_java.oop.generic;

class SingleLinkedNode<T> {
    private T element;

    private SingleLinkedNode<T> next;

    public SingleLinkedNode(T element, SingleLinkedNode<T> next) {
        this.element = element;
        this.next = next;
    }

    public SingleLinkedNode(T element) {
        this(element, null);
    }

    public T getElement() {
        return element;
    }

    void setElement(T element) {
        this.element = element;
    }

    public SingleLinkedNode<T> getNext() {
        return next;
    }

    void setNext(SingleLinkedNode<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean contains(T element) {
        return this.element != null && this.element.equals(element);
    }
}
