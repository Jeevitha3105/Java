package Arrays.ArrayList;
import java.util.*;

class FriendExpenses{
    String name;
    double expenses;

    FriendExpenses(String name, double expenses){
        this.name = name;
        this.expenses = expenses;
    }
}
public class TrackExpenses {
    public static void main(String[] args){
        ArrayList<FriendExpenses> expensesList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = in.nextInt();
        in.nextLine();

        for(int i=1;i<=n;i++){
            System.out.println("Enter the name of friend " + i + " : ");
            String name = in.nextLine();
            System.out.println("Enter the total expenses for " + name + " : ");
            double expenses = in.nextDouble();
            in.nextLine();
            expensesList.add(new FriendExpenses(name, expenses));
        }

        System.out.println("\nExpense:");
        double total=0;
        for(FriendExpenses friendExpenses : expensesList){
            System.out.println(friendExpenses.name + " $ " + friendExpenses.expenses);
            total += friendExpenses.expenses;
        }

        System.out.println("\nTotal expenses for each friend:");
        for(FriendExpenses friendExpenses : expensesList){
            System.out.println(friendExpenses.name + " $ " + friendExpenses.expenses);
        }

        System.out.println("Overall total expenses : " + total);

    }
}
