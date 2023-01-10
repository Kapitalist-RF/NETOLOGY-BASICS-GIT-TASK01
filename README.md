# Работа SalesManager

**SalesManager** - менеджер по подсчету максимального числа из массива данных, если добавите еще методов, то сможет что-нибудь еще)

## Начало работы
* Создайте объект от класса **SalesManager** и вставьте в параметры массив данных (**int** типа)!
* Вызовите метод от Вашего созданного объекта **max()**
* Наслаждайтесь!

## Пример:
```java
public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = 
                new SalesManager(new int[] {1, 2, 3, 4, 5});
        System.out.println(salesManager.max());
    }
}
```