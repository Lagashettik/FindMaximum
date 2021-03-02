public class FindMaximum{


    @SuppressWarnings("rawtypes")
    <T extends Comparable> T getMaximum(T number1, T number2, T number3){
        if(number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            return number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            return number2;
        else
            return number3;
    }

}
