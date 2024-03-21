/*Дана строка sql-запроса:
select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
Пример: Строка sql-запроса:
select * from students where
Параметры для фильтрации:
 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:
select * from students where name='Ivanov' and country='Russia' and city='Moscow'*/
class AnswerTask1 {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже

        String s = PARAMS.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\"", "").replaceAll(" ", "");
        String[] sArr10 = s.split(",");
        String[][] sArr11 = new String[sArr10.length][];
        for (int i = 0; i < sArr10.length; i++) {
            sArr11[i] = sArr10[i].split(":");
        }
        StringBuilder params = new StringBuilder(QUERY);
        for (int i = 0; i < sArr11.length; i++) {
            if (!sArr11[i][1].equals("null")) {
                params.append(sArr11[i][0] + "=").append("\'" + sArr11[i][1] + "\'").append(" and ");
            }
        }
        params.delete(params.length() - 5, params.length());

        return params;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        AnswerTask1 ans = new AnswerTask1();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
