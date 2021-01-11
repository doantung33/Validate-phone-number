public class Main {
    private static final String[]arr= new String[]{"(84)-(0123456789)","(84)-(0342168440)"};
    private static final String[]arr1= new String[]{"(084)-(123456789)","(84)-(042168440)","(84)(00000000)"};

    public static void main(String[] args) {
        for (String s:arr
             ) {
            boolean check=ValidatePhoneNumber.phoneNumber(s);
            System.out.println("Number phone "+s+" is valid "+check);
        } for (String s:arr1
             ) {
            boolean check=ValidatePhoneNumber.phoneNumber(s);
            System.out.println("Number phone "+s+" is valid "+check);
        }

    }
}
