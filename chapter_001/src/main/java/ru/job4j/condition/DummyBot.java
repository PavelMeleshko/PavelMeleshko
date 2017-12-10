
package ru.job4j.condition;

/**
 * @author Pavel Meleshko (ottotiger@mail.ru)
 * @version 1
 * @since 09.12.2017
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            
            rsl = "Привет, умник.";                    
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            
            rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        } else {
            rsl = "До скорой встречи.";
        }
        return rsl;
     }
}