package ua.edu.chmnu.advanced_java.oop.generic;

class SingleLinkedListHelper<T> {

    static <T> T getBy(SingleLinkedNode<T> head, int index) {
        SingleLinkedNode<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getElement();
    }

    static <T> T setBy(SingleLinkedNode<T> head, int index, T value) {
        SingleLinkedNode<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        current.setElement(value);

        return current.getElement();
    }

    static <T> int indexOf(SingleLinkedNode<T> head, T element) {
        int index = 0;

        while (head != null) {

            if (head.contains(element)) {
                return index;
            }

            ++index;

            head = head.getNext();

        }

        return -1;
    }

    static <T> SingleLinkedNode<T> addFirst(SingleLinkedNode<T> head, T element) {
        return new SingleLinkedNode<>(element, head);
    }

    static <T> SingleLinkedNode<T> addLast(SingleLinkedNode<T> last, T element) {

        SingleLinkedNode<T> newNode = new SingleLinkedNode<>(element);

        if (last == null) {
            return newNode;
        }

        last.setNext(newNode);

        return newNode;
    }
}
