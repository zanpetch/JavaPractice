class WarmUp1{

    public boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        int sum = a+b;
        if (a == b){
            return sum*2;
        }
        return sum;
    }

    public int diff21(int n) {
        if (n < 0){
            return 21+n;
        }else if (n<=21){
            return 21-n;
        }else{
            return (n-21)*2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || a+b == 10){
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a<0 && b <0);
        }else{
            return (a<0 && b>0) && (a>0 && b<0);
        }
    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not "+str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(n+1);
        return front+back;
    }

    public String frontBack(String str) {
        if (str.length()<=1) return str;

        String mid = str.substring(1,str.length()-1);

        // last+mid+front
        return str.charAt(str.length()-1)+mid+str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() >= 3){
            String threeCharacter = str.substring(0, 3);
            return threeCharacter + threeCharacter + threeCharacter;
        }
        return str+str+str;
    }

    public String backAround(String str) {
        String back = str.substring(str.length()-1);
        return back + str + back;
    }

    public boolean or35(int n) {
        return (n%3 == 0 || n%5 == 0);
    }

    public String front22(String str) {
        String front = "";
        if (str.length() >= 2){
            front = str.substring(0,2);
            return front + str + front;
        }
        return str + str + str;
    }

    public boolean startHi(String str) {
        if (str.length()<2){
            return false;
        }else{
            return (str.substring(0, 2).equals("hi"));
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        boolean checkA = (a >= 10 && a <= 20);
        boolean checkB = (b >= 10 && b <= 20);
        return checkA || checkB;
    }

    public boolean hasTeen(int a, int b, int c) {
        boolean checkA = (a >= 13 && a <= 19);
        boolean checkB = (b >= 13 && b <= 19);
        boolean checkC = (c >= 13 && c <= 19);
        return checkA || checkB || checkC;
    }

    public boolean loneTeen(int a, int b) {
        boolean checkA = (a >= 13 && a <= 19);
        boolean checkB = (b >= 13 && b <= 19);
        return (checkA && !checkB) || (!checkA && checkB);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return str.substring(1,3).equals("ix");
    }

    public String startOz(String str) {
        String  newStr = "";
        if (str.length() >= 1 && str.substring(0,1).equals("o")){
            newStr += "o";
        }
        if (str.length() >= 2 && str.substring(1,2).equals("z")){
            newStr += "z";
        }
        return newStr;
    }

    public int intMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public int close10(int a, int b) {
        int closeA = Math.abs(10-a);
        int closeB = Math.abs(10-b);
        if (closeA == closeB) return 0;
        if (closeA < closeB) return a;
        return b;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) return true;
        if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) return true;
        return false;
    }

    public int max1020(int a, int b) {
        if ((a < 10 || a > 20) && (b < 10 || b > 20)) return 0;
        int max = Math.max(a, b);
        if (max >= 10 && max <= 20){
            return max;
        }else{
            return Math.min(a, b);
        }
    }

    public boolean stringE(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        return (a%10 == b%10);
    }

    public String endUp(String str) {
        if (str.length() >= 3){
            int startUpper = str.length()-3;
            String front = str.substring(0, startUpper);
            String back = str.substring(startUpper).toUpperCase();
            return front + back;
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String newStr = ""+str.charAt(0);
        for(int i=n; i < str.length(); i +=n){
            newStr += str.charAt(i);
        }
        return newStr;
    }
}