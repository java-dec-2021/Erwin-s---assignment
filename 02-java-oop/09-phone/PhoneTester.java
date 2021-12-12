public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Zing Xing Ring!!");
        IPhone iPhoneTen = new IPhone("X", 100, "T-Mobile", "Shhazzam Blep Blek!!");

        s9.displayInfo();
        System.out.println(s9.unlock());

        System.out.println("------------------");

        iPhoneTen.displayInfo();
        System.out.println(iPhoneTen.unlock());
    }
}
