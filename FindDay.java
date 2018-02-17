import java.util.Scanner;
import java.io.*;
class FindDay
{
 public static void main(String str1[])
 {
  int date,month,year;
  int y,m,d;
  int arr[]=new int[12];
  String str[]=new String[7];
  y=m=d=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Date:-");
  date=sc.nextInt();
  System.out.println("Enter the month:-");
  month=sc.nextInt();
  System.out.println("Enter the year:-");
  year=sc.nextInt();
  int i=0,q;
  for(q=year-1;i<400;q--)
  {
   if(q%4==0&&q%400==0)
    {
      break;
    }
    i++;
  }
  if(i>300)
  {
    y+=1;
    i=i-300;
  }
  else if(i>200)
  {
    y+=3;
    i=i-200;
  }
  else if(i>100)
  {
    y+=5;
    i=i-100;
  }

  int j=i/4;
  y=y+(i-j)%7;
  j=j*2;
  y=y+j%7;
  y=y%7;
  arr[0]=31;
  arr[1]=28;
  arr[2]=31;
  arr[3]=30;
  arr[4]=31;
  arr[5]=30;
  arr[6]=31;
  arr[7]=31;
  arr[8]=30;
  arr[9]=31;
  arr[10]=30;
  arr[11]=31;
  for(int p=0;p<month-1;p++)
   date=date+arr[p];
  y=y+date%7;
  y=y%7;
  str[0]="sunday";
  str[1]="monday";
  str[2]="tuesday";
  str[3]="wednesday";
  str[4]="thrusday";
  str[5]="friday";
  str[6]="saturday";
  System.out.println("day at "+date+"-"+month+"-"+year+" is "+str[y]);
 }
}