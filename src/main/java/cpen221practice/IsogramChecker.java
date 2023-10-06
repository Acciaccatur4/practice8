package cpen221practice;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        char[] phraseArray = phrase.toCharArray();
        boolean isIsogram = false;
        for(int i = 0; i < phrase.length(); i++){

         //   System.out.println("I is " + i);
            String s = phrase.substring(i + 1);
           // System.out.println(phraseArray[i]);
            if(s.indexOf(phraseArray[i]) != -1){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        String a = "zzyzx";

        IsogramChecker i = new IsogramChecker();

        System.out.println(i.isIsogram(a));
    }

}
