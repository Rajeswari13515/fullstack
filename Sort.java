import java.util.Scanner;
public class Sort{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++){
for (int j=i+1;j<=n;j++){
if(arr[i]<arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;}
}}}}