 class Date {
private int day;
private int month;
private int year;
public Date() {
this.day = 11;
this.month = 11;
this.year = 2020;
}
public Date(int day,int month,int year){
this.day = day;
this.month = month;
this.year = year;
}
public int getDay() {
return this.day;
}
public int getMonth() {
return this.month;
}
public int getYear() {
return this.year;
}
public void setDay(int day) {
this.day = day;
}
public void setMonth(int month) {
this.month = month;
}
public void setYear(int year) {
this.year = year;
}
public void print(){
System.out.println(day + "/" + month + "/" + year);
}
public static void swap(Date d1,Date d2){
Date d3 = d1;
d1=d2;
d2=d3;
System.out.println("After swapping");
d1.print();
d2.print();
}
}
 class UseDate {
public static void main(String args[]){
Date d1 = new Date();
Date d2 = new Date(13,11,2020);
System.out.println("before swap");
d1.print();
d2.print();
Date.swap(d1,d2);
}
}

