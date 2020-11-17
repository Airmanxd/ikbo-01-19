public class PhoneConverter {
    String number;
    public PhoneConverter(String number) {
        this.number = number;
        String temp = "";
        if(number.charAt(0) == '8')
        {
            temp = "+7" + number.substring(1, 4) + "-"
                    + number.substring(4, 7) + "-" + number.substring(7, 11);
        }
        else if(number.charAt(0) == '+')
        {
            int i = 2;
            i+=(number.length() - 1)%11;
            temp = number.substring(0, i) + number.substring(i+1, i+4) + "-"
                    + number.substring(i+4, i+7) + "-" + number.substring(i+7, i+10);
        }
        else
        {
            System.out.println("Incorrect formant");
        }
        this.number=temp;
    }
    public String toString()
    {
        return this.number;
    }

}
