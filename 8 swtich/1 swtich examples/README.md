# Практика: Типы переменных в `switch`

## Описание
Оператор выбора `switch` позволяет использовать следующие типы переменных:
- **Целочисленные типы:** `byte`, `short`, `int`, `char`.
- **Перечисления (enum).**
- **Строки (String).**
- **Объекты-оболочки целочисленных типов:** `Byte`, `Short`, `Integer`, `Character`.

## Пример кода
Программа демонстрирует работу `switch` с переменными типа `int`, `String` и `enum`.

### Результат выполнения:
- Если intValue = 1, вывод: Integer value is 1.
- Если stringValue = "hello", вывод: String value is 'hello'.
- Если day = Day.MONDAY, вывод: Today is Monday.