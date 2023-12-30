class Solution {
    public int romanToInt(String s) {
       int num = 0;
        while(s.length() > 0) {
            switch (s.charAt(0)) {
                case 'I' :
                    if(s.length() > 1) {
                        switch (s.charAt(1)) {
                            case 'V' :
                                num += 4;
                                s = s.substring(1);
                                break;
                            case 'X':
                                num += 9;
                                s = s.substring(1);
                                break;
                            default:
                                num += 1;
                        }
                        
                    }
                    else {
                        num += 1;
                    }
                    
                    break;
                case 'V' :
                    num +=5;
                    break;
                case 'X' :
                    if(s.length() > 1) {
                        switch (s.charAt(1)) {
                            case 'L' :
                                num += 40;
                                s = s.substring(1);
                                break;
                            case 'C':
                                num += 90;
                                s = s.substring(1);
                                break;
                            default :
                                num += 10;
                        }
                    }
                    else {
                        num += 10;
                    }
                    break;
                case 'L' :
                    num += 50;
                    break;
                case 'C' :
                    if(s.length() > 1) {
                        switch (s.charAt(1)) {
                            case 'D' :
                                num += 400;
                                s = s.substring(1);
                                break;
                            case 'M':
                                num += 900;
                                s = s.substring(1);
                                break;
                            default:
                                num += 100;
                        }
                    }
                    else {
                        num += 100;
                    }
                    
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000; 
                    break;
            }
            s = s.substring(1);
        }
        return num;
    }
}