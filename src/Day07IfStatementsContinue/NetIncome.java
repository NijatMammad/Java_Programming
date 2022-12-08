package Day07IfStatementsContinue;

public class NetIncome {
    public static void main(String[] args) {
        int salary=20000;
        double taxRate=0;
        boolean isMarried=false;


        if (salary >=130000){
            taxRate=0.35;
        }
        if(salary>=100000&& salary<130000){;// if the salary is between 100K and 130K
        taxRate=0.3;
    }
        if (salary>=80000&& salary<100000){

        }
             if (salary<80000){
                 taxRate=0.2;
             }
        if (isMarried){
            taxRate-=0.05;
        }
double netIncome=salary*(1-taxRate);
        System.out.println("NetIncome="+netIncome);
}
}
/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less
 */