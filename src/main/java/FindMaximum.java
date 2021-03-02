public class FindMaximum {
    int getIntegerMaximum(Integer number1, Integer number2, Integer number3){
        if(number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            return number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            return number2;
        else
            return number3;
    }

    Float getFloatMaximum(Float number1, Float number2, Float number3){
        if(number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            return number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            return number2;
        else
            return number3;
    }

}
