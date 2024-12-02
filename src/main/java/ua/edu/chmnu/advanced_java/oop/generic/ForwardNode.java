package ua.edu.chmnu.advanced_java.oop.generic;

class ForwardNode<T> {
    private final T element;

    private final ForwardNode<T> next;

    public ForwardNode(T element, ForwardNode<T> next) {
        this.element = element;
        this.next = next;
    }

    public ForwardNode(T element) {
        this(element, null);
    }

    public T getElement() {
        return element;
    }

    public ForwardNode<T> getNext() {
        return next;
    }
}
