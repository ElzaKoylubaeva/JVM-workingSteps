package ru.koylubaevaem.netology;

public class JvmComprehension {
    public static void main(String[] args) { // при вызове создается фрейм в Stack;
        int i = 1;                      // 1 инициализация i = 1, в фрейме, в стековой области памяти;
        Object o = new Object();        // 2 создается экземпляр класса Object, выделяется область памяти в Heap (куча),
                                        // создается ссылка o в Stack, указывает(смотрит) на область памяти, выделенной
                                        // в куче;
        Integer ii = 2;                 // 3 создается экземпляр класса Integer, хранится в куче, ссылка ii в стеке
                                        // указывает на область памяти выделенной для этого объекта в куче;
        printAll(o, i, ii);             // 4 создается новый фрейм в Stack
        System.out.println("finished"); // 7 создается новый фрейм, экземпляр класса String, выделяется область памяти
                                        // в куче, ссылка this в стеке
    }

    private static void printAll(Object o, int i, Integer ii) { // в стеке, в соответствующем фрейме создается ссылка
                                                    // на объект, который указывает на ту же область памяти в куче, что
                                                    // и в п.2, примитивный тип i = 1, хранится в стеке, создается
                                                    // экземпляр класса Integer, хранится в куче, ссылка ii в стеке;
        Integer uselessVar = 700;                   // 5 создается экземпляр класса Integer, память выделяется в куче,
                                                    // ссылка uselessVar хранится в стеке;
        System.out.println(o.toString() + i + ii);  // 6 создается новый фрейм в стеке, создается еще один
                                                    // фрейм, ссылка this будет указывать в кучу на ту же область памяти
                                                    // выделенной для Object, i = 1, хранится в стеке, экземпляр класса
                                                    // Integer, хранится в куче, ссылка ii в стеке;
    }

}
