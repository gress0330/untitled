public class ConverTemp {

    public static void main(String[] args) {

        java.util.Scanner TT = new java.util.Scanner(System.in);
        System.out.println("現在幾度啦");
        double C_Temp = TT.nextDouble();

        double T_Temp = C_Temp * 9/5 + 32;
        System.out.println("攝氏溫度:" + C_Temp + "\r\n" +"華氏溫度:" + T_Temp);
    }
}