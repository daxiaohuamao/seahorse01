package LiFei01;

public class Calculator {

        public int add(int num1, int num2) {

            return num1 + num2;
        }
        public int minus(int num1,int num2){
            if (num1 >  num2)
              return num1-num2;
            else
              return 0;
        }
        public int multi(int num1,int num2){
            return num1 * num2;
        }

        public int devi(int num1,int num2){
            if (num2 == 0)
                return 0;
            return num1/num2;
        }
}



