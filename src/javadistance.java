public class javadistance {
    public static void main(String[] agrs){

        java.util.Scanner dis = new java.util.Scanner(System.in);
        System.out.println("我給公里數啦");
        double km = dis.nextDouble();

        double mi = km / 1.6;
        System.out.println("公里數:"+km+"\r\n"+"英里數:"+mi);
    }
}
