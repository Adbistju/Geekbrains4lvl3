public class Main {
    static ScoreNote nothes = new ScoreNote();

    public static void main(String[] args) {
        //Добавляем в циркулярный список наши ноты, хроматизм.
        nothes.addNode("C");
        nothes.addNode("Cis");
        nothes.addNode("D");
        nothes.addNode("Es");
        nothes.addNode("E");
        nothes.addNode("F");
        nothes.addNode("Fis");
        nothes.addNode("G");
        nothes.addNode("As");
        nothes.addNode("A");
        nothes.addNode("B");
        nothes.addNode("H");
        //Тут при помощи индесков можем вывести нужные нам ноты. Индексы пишем от ноты До (C) на сколько полутонов мы поднимаеся.
        //В какждой строчке по три ноты, они в месте составляют аккорд.
        //Первый аккорд для тоналоности C dur - является тоникой C53.
        //Второй субдоминанта (S) - F53.
        //Третий доминанта (D) - G53.
        System.out.println(nothes.get(0)+" "+nothes.get(4)+" "+nothes.get(7));
        System.out.println(nothes.get(0)+" "+nothes.get(5)+" "+nothes.get(9));
        System.out.println(nothes.get(-1)+" "+nothes.get(2)+" "+nothes.get(7));


        System.out.println("ЗАДАНИЕ ПО ТЕМЕ:");
        System.out.println("Выводим последовательность символов)))");
        for (int i = 0; i < 12; i++) {
            new Thread(new ABC.WaitNotifyClass(nothes.get(i),nothes.get(i+1))).start();
        }

    }
}