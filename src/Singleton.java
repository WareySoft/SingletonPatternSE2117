public final class Singleton {

    private static Singleton instance;
    private static String chat = "   GROUP CHAT \n-----------------";
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showChat() {
        System.out.println(chat);
        System.out.println("-----------------\n");
    }

    public void message(String user, String info) {
        chat += "\n" + user + ": " + info ;
    }
}