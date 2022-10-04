public class Main {
    public static void main(String[] args) {
        Singleton classSingleton1 = Singleton.getInstance();

        classSingleton1.showChat();  //Initial

        Singleton classSingleton2 = Singleton.getInstance();

        classSingleton2.message("Carter","Who are you?");
        classSingleton1.message("Yu","Yu.");
        classSingleton2.message("Carter","No, not me. You.");
        classSingleton1.message("Yu","Yes, I am Yu.");

        classSingleton1.showChat();
        classSingleton2.showChat();

    }
}
