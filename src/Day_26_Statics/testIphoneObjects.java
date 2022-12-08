package Day_26_Statics;

public class testIphoneObjects {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("Iphone12", "black", 1000);
        System.out.println(iphone.color);
        System.out.println(iphone.price);
        System.out.println(iphone.price);
    iphone.printPhoneInfo();
        System.out.println(iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();

    }


}
