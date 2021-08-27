# 常用API

<hr/>

- Math
- System
- Object
- Arrays
- 基本类型包装类
- 日期类

<hr/>

## Math类
包含执行基本数字运算的方法

由于成员都是static修饰，即都是静态的，所以通过；类名就可以直接调用

#### 常用方法：
|方法名|说明|
|---|---|
|public static int abs(int a)|返回参数的绝对值|
|public static double ceil(double a)|返回大于或等于参数的最小double值，等于一个整数|
|public static double floor(double a)|返回小于或等于参数的最大double值,等于一个整数|
|public static int round(float a)|按四舍五入返回最接近参数的int|
|public static int max(int a,int b)|返回两个int值中的较大值|
|public static int min(int a,int b)|返回两个int值中的较小值|
|public static double pow(double a,double b)|返回a的b次幂|
|public static double random|返回值为double的正值，[0.0,1.0) |

## System类
System类包含了几个有用的类字段和方法，它不能被实例化
#### 常用方法：
|方法名|说明|
|---|---|
|public static void exit(int status)|终止当前运行的Java虚拟机，非零表示异常终止|
|public static long currentTimeMillis()|返回当前时间（以毫秒为单位）|
