package ru.mirea.task29;

import java.io.*;
import java.util.Date;

public class Task29 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo o1, o2;
        o1 = new CurrencyInfo("Никита");
        System.out.println("До сериализации\n"+o1.toString());
        FileOutputStream outputStream = new FileOutputStream("src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o1);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        o2 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println("После сериализации\n" + o2.toString());
    }
}

class CurrencyInfo implements Serializable{
    private static final long serialVersionUID=1L;
    Date date;
    String my_name;

    public CurrencyInfo(String my_name) {
        this.date = new Date();
        this.my_name = my_name;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "date=" + date +
                ", my_name='" + my_name + '\'' +
                '}';
    }
}
