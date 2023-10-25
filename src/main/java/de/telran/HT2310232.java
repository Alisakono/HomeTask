package de.telran;

import java.util.HashMap;
import java.util.Map;

public class HT2310232 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("model","V-60");
        params1.put("country","Germany");
        params1.put("city","Berlin");
        params1.put("active","true");
        params1.put("year",null);
        System.out.println(getQuery(params1));

    }
    public static String getQuery(Map<String, String> params){
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet()){
            if (pair.getValue() != null){
                s.append(pair.getKey() +" = '"+ pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-4,s.toString().length());
        return s.toString();
    }
}
      /* Cформировать строку, сходную с  SQL запросом, используя StringBuilder:

        1) Берем исходную строку с данными из cars
        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active",
        true}
        Если значение второго параметра равно null с каждой пары, то параметр не должен
        попадать в условие отбора, которое задается после ключевого слова WHERE в
        результирующей строке.
        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki",
        "year", null}
        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki'
        ;*/


