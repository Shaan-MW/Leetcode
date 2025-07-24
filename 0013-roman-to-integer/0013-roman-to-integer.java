class Solution {
    public int romanToInt(String s) {
        s = s.toUpperCase();
        int romanNumber=0;


        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1){
                           if(s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                    switch (s.charAt(i+1)){
                        case 'V':
                            romanNumber+=4;
                            i++;
                            break;
                        case 'X':
                            romanNumber+=9;
                            i++;
                            break;
                        default:
                            System.out.println("onnum illai");
                    }
            }else if(s.charAt(i)=='X' && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                    switch (s.charAt(i+1)){
                        case 'L':
                            romanNumber+=40;
                            i++;
                            break;
                        case 'C':
                            romanNumber+=90;
                            i++;
                            break;
                        default:
                            System.out.println("onnum illai");
                    }
            }else if(s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                    switch (s.charAt(i+1)){
                        case 'D':
                            romanNumber+=400;
                            i++;
                            break;
                        case 'M':
                            romanNumber+=900;
                            i++;
                            break;
                        default:
                            System.out.println("onnum illai");
                    }
            }else if(true || (s.indexOf(i)==-1)){
                switch (s.charAt(i)){
                    case 'I':
                        romanNumber+=1;
                        break;
                    case 'V':
                        romanNumber+=5;
                        break;
                    case 'X':
                        romanNumber+=10;
                        break;
                    case 'L':
                        romanNumber+=50;
                        break;
                    case 'C':
                        romanNumber+=100;
                        break;
                    case 'D':
                        romanNumber+=500;
                        break;
                    case 'M':
                        romanNumber+=1000;
                        break;
                    default:
                        System.out.println("Check the String");
                }
            } 
            }
        else{
            switch (s.charAt(i)){
                    case 'I':
                        romanNumber+=1;
                        break;
                    case 'V':
                        romanNumber+=5;
                        break;
                    case 'X':
                        romanNumber+=10;
                        break;
                    case 'L':
                        romanNumber+=50;
                        break;
                    case 'C':
                        romanNumber+=100;
                        break;
                    case 'D':
                        romanNumber+=500;
                        break;
                    case 'M':
                        romanNumber+=1000;
                        break;
                    default:
                        System.out.println("Check the String");
        }

        }
        }
        return romanNumber;
    }
}