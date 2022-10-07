package ra.dev;


public class NextDayCalculator {
    public String getNextDay(int day, int month, int year) {
        String returnString = "";
        switch (month) {
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            if (day == 29) {
                                returnString = "1 / " + ++month + " / " + year;
                            } else {
                                returnString = ++day + " / " + month + " / " + year;
                            }//29
                        } else {
                            if (day == 28) {
                                returnString = "1 / " + ++month + " / " + year;
                            } else if (day > 28) {
                                returnString = "Loi";
                            } else {
                                returnString = ++day + " / " + month + " / " + year; //28
                            }
                        }
                    } else {
                        if (day == 29) {
                            returnString = "1 / " + ++month + " / " + year;
                        } else {
                            returnString = ++day + " / " + month + " / " + year;//29
                        }
                    }
                } else {
                    if (day == 28) {
                        returnString = "1 / " + ++month + " / " + year;
                    } else {
                        if (day > 28) {
                            System.out.println("Loi");
                        } else {
                            System.out.println("Ngay tiep theo la : " + ++day + " / " + month + " / " + year);
                        }
                    }
                }
                //28

                break;
            case 3:
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31 && month == 12) {
                    System.out.println("Ngay tiep theo la : 1 / 1 " + " / " + ++year);
                } else if (day >= 31) {
                    System.out.println("Ngay tiep theo la : 1 " + " / " + ++month + " / " + year);
                } else {
                    System.out.println("Ngay tiep theo la : " + ++day + " / " + month + " / " + year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 30) {
                    System.out.println("Ngay tiep theo la : 1 " + " / " + ++month + " / " + year);
                }
                break;
            default:
                System.out.println(" Thang do khong ton tai !");
        }
        return returnString;
    }
}
