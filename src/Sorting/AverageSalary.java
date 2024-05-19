package Sorting;

class AverageSalary {
    public static double average(int[] salary) {
        for(int i=0; i<salary.length-1; i++){
            if(salary[i] > salary[i+1]){
                int temp = salary[i];
                salary[i] = salary[i+1];
                salary[i+1] = temp;
            }
        }
        double value = 0.0;
        int count = 0;
        for(int j=1; j<salary.length-1; j++){
            value += salary[j];
            count++;
        }
        if(count!=0){
            return value/count;
        }
        else{
            return 0.0;
        }

    }

    public static void main(String[] args){
        int[] salary = {1000,5000,2000,3000};
        System.out.println(average(salary));
    }
}
