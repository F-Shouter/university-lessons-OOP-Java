## Challenge 1

### Using if in constructor:
```java
//SubHours.java:
//Change in code only in the variable 'hour'
//modification only in constructor #4

    public SubHours(int hour, int minute, int second){
    
        if ( 0 <= hour & hour < 24 ){
            this.hour = hour;
        }
        else {System.out.println("invalid number for hour ! ! !");}
        
        this.minute = minute;
        this.second = second;
        
    }

//ProjectHours.java:
SubHours r2 = new SubHours(115,70,98);
        System.out.println("using a constructor that requires hour, minute and second");
        System.out.println("Hours: " + r2.getHour() + ":" + r2.getMinute() + ":" + r2.getSecond());

//Output - ProjectHours(run):
invalid number for hour ! ! !
using a constructor that requires hour, minute and second
Hours: 0:70:98
```

### Using if in set method:
```java
//SubHours.java:
//Change in code only in the method 'setMinute'
public void setMinute(int minute){
        if ( 0 <= minute & minute < 60){
            this.minute = minute;
        }
        else{System.out.println("invalid number for minute ! ! !");}
    }

//ProjectHours.java:
r5.setHour(13);
r5.setMinute(80);
r5.setSecond(10);
System.out.println("Hours: " + r5.getHour() + ":" + r5.getMinute() + ":" + r5.getSecond());

//Output - ProjectHours(run):
invalid number for minute ! ! !
Hours: 13:0:10
```
---
---
## Challenge 2
```java
//ProjectHours.java:
//challenger 2: create object "r"
        SubHours r = new SubHours(24);
        System.out.println("Challenger 2: create object 'r'");
        System.out.println("Hours: " + r.getHour());

//Output - ProjectHours(run):
Challenger 2: create object 'r'
Hours: 24
```