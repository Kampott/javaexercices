### Пояснение:
- Внешний класс создает экземпляр внутреннего класса через метод accessInnerClass().
- Внешний класс имеет доступ к полям и методам внутреннего класса только через создание экземпляра внутреннего класса. Внешний класс не может напрямую получить доступ к полям или методам внутреннего класса, если они приватные или защищены.
- В примере создается объект внутреннего класса через внешний класс, и внешний класс может использовать методы внутреннего класса только через этот объект.
### Выводы:
1. Доступ к полям и методам внешнего класса: Внутренний класс имеет неограниченный доступ к полям и методам внешнего класса, включая приватные.
2. Доступ внешнего класса к внутреннему: Внешний класс не имеет прямого доступа к полям и методам внутреннего класса без создания экземпляра внутреннего класса.