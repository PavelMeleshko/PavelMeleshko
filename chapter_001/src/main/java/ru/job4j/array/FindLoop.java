package ru.job4j.array;
/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 06.01.2018
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i <= data.length; ++i) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
