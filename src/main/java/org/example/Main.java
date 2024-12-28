package org.example;

public class Main {
    public static void main(String[] args) {
        Element[][] array = new Element[10][5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = new Element((int) (Math.random() * 1000));
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j].value + " ");
            }
            System.out.println();
        }

        Element maxElement = array[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j].compareTo(maxElement) > 0) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент: " + maxElement.value);
    }
}

class Element implements Comparable<Element> {
    public int value;
    public Element(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Element other) {
        return Integer.compare(this.value, other.value);
    }
}