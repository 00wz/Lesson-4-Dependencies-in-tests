1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов? 
- Использование заглушек повышает автономность теста и его гибкость.(так же экономит память, заменяя реал. обьекты на фейк, высокая скорость работы)

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
- с помощью mock в нем есть функция assert_called() Утверждение, что мок вызывался хоть раз

3)  Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
- Стабы — объекты, также называемые заглушками, которые возвращают заранее определенные значения на определенные входные данные. 
 
4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
- Fake небольшие фрагменты кода, контролируемые тестами, которые имитируют поведение фактических частей, которые они заменяют.
