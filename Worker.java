
// Буду доделывать эту работу!!!

package ru.geekbrains;

    public class Worker {
    String FIO;
    int Age;
    String ThePost;
    String eMail;
    int Telephone;
    int Pay;

    public Worker(String FIO, int age, String thePost, String eMail, int telephone, int pay) {
        this.FIO = FIO; // Без this. выводится null?
        this.Age = age;
        ThePost = thePost;
        this.eMail = eMail; // Без this. выводится null?
        Telephone = telephone;
        Pay = pay;
        }

    public int getAge(int Age) {
        if (Age > 40) {
            this.Age = Age;
        } else {
            System.out.println("Список сотрудников старше 40 лет");
        }
        return Age;
        }

    public Worker() {
    }

    public void workers() {
        System.out.println(FIO + ", " + Age + ", " + ThePost + ", " + eMail + ", " + Telephone + ", " + Pay);
    }
}
