package lab9;
/*
Лабораторная работа №9
Дан двумерный массив ("сетка") символов и слово.
Найдите все вхождения данного слова в сетке.
Слово может быть найдено во всех 8 направлениях
(вверх, вниз, вправо, влево и по диагоналям) в любой точке.
Говорят, слово "лежит в направлении", если все символы совпадают
в этом направлении (не в зигзагообразной форме).
*/
public class Client {
    public static void main(String[] args) {
        String[] temp = {
                "aaaaa",
                "abbba",
                "baaab",
                "ababa",
                "bbbbb",
        };
        char[][] array = new char[temp.length][temp[0].length()];
        for (int i = 0; i < temp.length; i++) {
            char[] cs = temp[i].toCharArray();
            for (int j = 0; j < temp[i].length(); j++) {
                array[i][j] = cs[j];
            }
        }
        String word = "abab";
        printMatrix(array);
        System.out.println("Количество вхождений слова " + word + ":");
        System.out.println(WordCounter.count(array, word));
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
