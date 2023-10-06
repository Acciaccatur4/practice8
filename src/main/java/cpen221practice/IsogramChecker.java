package cpen221practice;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        char[] phraseArray = phrase.toCharArray();
        boolean isIsogram;
        for(int i = 0; i < phrase.length(); i++){
            String s = phrase.substring(i);
            if(s.indexOf(phraseArray[i]) != -1){
                return false;
            }

        }
        return true;
    }

}
