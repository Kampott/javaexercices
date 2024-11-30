В этом примере продемонстрировано использование статических и нестатических логических блоков:

1. **Статические блоки** выполняются один раз при первом обращении к классу, перед созданием объектов.
2. **Нестатические блоки** выполняются при создании каждого объекта, перед вызовом конструктора.
3. Поля класса инициализируются до выполнения конструктора, но после выполнения первых логических блоков.

### Порядок выполнения кода:

1. Выполняется статический блок.
2. Выполняются нестатические блоки в порядке их объявления.
3. Выполняется конструктор.

### Вывод программы:

```plaintext
static logic
logic (1) id= 0
logic (2) id= 1
ctor id= 100
```