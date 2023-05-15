package session17;

import session15.part1.CBIFunction;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyLinkedList<E> {

    private int size;

    private Node first;
    private Node last;

    private class Node {
        private Node next;
        private Node previous;
        private E data;

        public Node(Node next, Node previous, E data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }
    }


    public static <E> MyLinkedList<E> of(E... data) {
        MyLinkedList<E> result = new MyLinkedList<>();

        for (E datum : data) {
            result.addLast(datum);
        }
        return result;
    }

    public MyLinkedList<E> add(E data) {
        return addLast(data);
    }

    public Optional<E> first() {
        return first == null
                ? Optional.empty()
                : Optional.of(first.data);
    }

    public Optional<E> last() {
        return last == null
                ? Optional.empty()
                : Optional.of(last.data);

    }

    public MyLinkedList<E> addFirst(E elementData) {
        Node oldFirst = first;
        Node addedNode = new Node(oldFirst, null, elementData);
        first = addedNode;

        if (oldFirst == null) {
            last = addedNode;
        } else {
            oldFirst.previous = addedNode;
        }
        size++;
        return this;
    }

    public MyLinkedList<E> addLast(E elementData) {
        Node oldLast = last;
        Node newLastNode = new Node(null, oldLast, elementData);
        last = newLastNode;
        if (oldLast == null) {
            first = newLastNode;
        } else {
            oldLast.next = newLastNode;
        }
        size++;
        return this;
    }

    public Optional<E> removeFirst() {

        return first == null
                ? Optional.empty()
                : Optional.of(removeNode(first));
    }

    public Optional<E> removeLast() {

        return last == null
                ? Optional.empty()
                : Optional.of(removeNode(last));
    }

    public <U> MyLinkedList<U> map(Function<E, U> mapFunction) {
        return reduceL(new MyLinkedList<>(), acc -> e -> acc.addLast(mapFunction.apply(e)));
    }

    public <U> MyLinkedList<U> flatMap(Function<E, MyLinkedList<U>> mapper) {
        return reduceL(new MyLinkedList<>(), acc -> e -> acc.addAll(mapper.apply(e)));
    }

    public MyLinkedList<E> addAll(MyLinkedList<E> anotherList) {

        return anotherList.reduceL(this, acc -> e -> acc.addLast(e));
    }

    public MyLinkedList<E> reversed() {
        return reduceR(new MyLinkedList<>(), e -> acc -> acc.addLast(e));
    }

    public void forEach(Consumer<E> consumer) {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            consumer.accept(temp.data);
            temp = temp.next;
        }
    }

//    private void forEach2(Node node, Consumer<E> consumer) {
//        if(node ==null){
//            return;
//        }
//        consumer.accept(node.data);
//        return forEach2(node.next,consumer);
//    }


    public boolean allMatch(Predicate<E> condition) {
        return isEmpty()
                ? false
                : reduceL(true, acc -> e -> acc && condition.test(e));
    }

    public boolean noneMatch(Predicate<E> condition){
        return allMatch(condition.negate());
    }

    public boolean isEmpty() {
        return size==0;
    }

    public <U> U reduceL(U seed, CBIFunction<U, E, U> accFunc) {
        return reduceL(seed, accFunc, first);
    }

    private <U> U reduceL(U acc, CBIFunction<U, E, U> accFunc, Node node) {
        return node == null
                ? acc
                : reduceL(accFunc.apply(acc).apply(node.data), accFunc, node.next);
    }


    public <U> U reduceR(U seed, CBIFunction<E, U, U> accFunc) {

        return reduceR(seed, accFunc, last);
    }

    private <U> U reduceR(U acc, CBIFunction<E, U, U> accFunc, Node node) {

        return node == null
                ? acc
                : reduceR(accFunc.apply(node.data).apply(acc), accFunc, node.previous);

    }

    private E removeNode(Node nodeToBeRemoved) {
        Node next = nodeToBeRemoved.next;
        Node previous = nodeToBeRemoved.previous;

        if (previous == null) {
            first = next;
        } else {
            previous.next = next;
        }

        if (next == null) {
            last = previous;
        } else {
            next.previous = previous;
        }

        size--;
        return nodeToBeRemoved.data;
    }
}
