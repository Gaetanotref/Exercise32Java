public class Main {
    public static void main(String[] args) {

        String veryLongString = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
                " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
                " ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in" +
                " voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non" +
                " proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\n";

        String replaceString = veryLongString.replaceAll("um", "HUM");
        System.out.println(replaceString);
        System.out.println("The index of aliquip is --> "+veryLongString.indexOf("aliquip"));

        String sub1 = veryLongString.substring(0,200);
        String sub2= veryLongString.substring(200,veryLongString.length());

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());

        boolean estInSub1 = sub1.contains("est");
        boolean estInSub2 = sub2.contains("est");

        System.out.println("Xor is --> "+(estInSub1^estInSub2));
    }
}