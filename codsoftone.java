import java.util.*;
public class codsoftone {
    public static Double sum(Double arr[]){
        Double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static String grade(Double percent){
        if(percent>90)return "A";
        else if(percent>80)return "B";
        else if(percent>65)return "C";
        else if(percent>45)return "D";
        else if(percent>33)return "E";
        else return "Fail";
    }
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Name of Student :");
    String studentName=sc.nextLine();
    System.out.println("enter number of subject:");
    int n=sc.nextInt();
    Double mark[]=new Double[n];
    for(int i=0;i<n;i++){
        System.out.println("enter marks of subject no-"+ (i+1));
        mark[i]=sc.nextDouble();
        }
    Double totalmarks=sum(mark);   
    Double AveragePercentage=totalmarks/n;
    String grade=grade(AveragePercentage); 
System.out.println("Total Marks :" + totalmarks);
System.out.println("Average Percentage :"+ AveragePercentage);
System.out.println("Grade :"+grade);
   } 
}
