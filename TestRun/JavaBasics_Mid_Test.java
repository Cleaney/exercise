package TestRun;

import JavaBasics_Mid.HomeWork;

public class JavaBasics_Mid_Test {
    public static void main(String[] args) {
        //Father的实例
        //关于访问权限的问题，如果该类的访问权限不够。又需要调用那个类的方法或者属性时。有两个办法解决：
        // 1、通过创建实例化对象，利用类加载机制调用无参构造器，再调用父类的任意一个方法。
        /*Son son = new Son();
        System.out.println(son.getSword());
        System.out.println(son.num);
        son.InnerKungfu();
        System.out.println("----------------------------------");
        Father father = son;
        System.out.println(father.getSword());
        System.out.println(father.num);//属性看父类
        father.InnerKungfu();*///儿子的剑。说明父类引用首先找的还是儿子的方法，子类有，优先找子类，子类没有，就找父类

        //2、让本类继承父类，再用实例化对象去调用父类中的方法
//        JavaBasics_Mid_Test test = new JavaBasics_Mid_Test();
//        test.InnerKungfu();

        //HomeWork的实例  1  自己写的
/*        HomeWork.Person zhangsan = new HomeWork().new Person("张三", 20, "卖鱼");
        HomeWork.Person lisi = new HomeWork().new Person("李四",22, "打猎");
        HomeWork.Person wangwu = new HomeWork().new Person("王五",30,"砍柴");
        HomeWork.Person zhaoliu = new HomeWork().new Person("赵六",50,"屠夫");
        int[] pAge = {zhangsan.getAge(),lisi.getAge(),wangwu.getAge(), zhaoliu.getAge()};
        System.out.println("========年龄排序前======");
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }
        System.out.println("\n========年龄排序后（从大到小）======");
        zhangsan.maxAge1(pAge);
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }*/

        //HomeWork的实例  1  韩老师版本
/*        HomeWork.Person[] people = new HomeWork.Person[4];
        people[0] = new HomeWork().new Person("张三", 20, "卖鱼");
        people[1] = new HomeWork().new Person("李四",22, "打猎");
        people[2] = new HomeWork().new Person("王五",30,"砍柴");
        people[3] = new HomeWork().new Person("赵六",50,"屠夫");

        System.out.println("\n========年龄排序前======");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("\n========年龄排序后（从大到小）======");
        zhangsan.maxAge2(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }*/

        //HomeWork的实例 3
//        HomeWork.Teacher zhang = new HomeWork().new Instructor("张老师",22,"讲师",3000,1.1);
//        HomeWork.Teacher li = new HomeWork().new ViceProfessor("李老师",30,"副教授",5000,1.2);
//        HomeWork.Teacher wang = new HomeWork().new Professor("王老师",40,"教授",10000,1.3);
//        System.out.println(zhang.introduce());
//        System.out.println(li.introduce());
//        System.out.println(wang.introduce());

        //HomeWork的实例 4
//        HomeWork.Employee normEmp = new HomeWork().new NormEmp("喜羊羊", 100, 30);
//        HomeWork.Employee departManager = new HomeWork().new DepartManager("村长", 1000, 365);
//        normEmp.getSalary();
//        departManager.getSalary();

        //HomeWork的实例 5
//        HomeWork.Employee2 worker = new HomeWork().new Worker("明工", 5000);
//        HomeWork.Employee2 peasant = new HomeWork().new Peasant("老明头", 2000);
//        HomeWork.Employee2 Teacher = new HomeWork().new Teacher2("王老师", 6000,30,250);
//        HomeWork.Employee2 Scientist = new HomeWork().new Scientist("李博士", 8000,8000);
//        HomeWork.Employee2 Waiter = new HomeWork().new Waiter("小王服务员", 3000);
//
//        worker.yearSal();
//        peasant.yearSal();
//        Teacher.yearSal();
//        Scientist.yearSal();
//        Waiter.yearSal();

        //HomeWork的实例 7
//        new HomeWork().new Demo().test(); //匿名对象  输出：test、Demo、Rose、jack
//        new HomeWork().new Demo("john").test();//匿名 输出：john、jack

        //HomeWork的实例 8
//        HomeWork.BankAccount checkingAccount = new HomeWork().new CheckingAccount(1000);
//        checkingAccount.deposit(20);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(50);
//        System.out.println(checkingAccount.getBalance());
/*        HomeWork.SavingsAccount savingsAccount = new HomeWork().new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.deposit(500);
        savingsAccount.deposit(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(500);//第4次存款收取1元手续费
        System.out.println(savingsAccount.getBalance());//2500+500=3000-1
        savingsAccount.earnMonthlyInterest();//重置免手续费次数
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);//第4次取款收取1元手续费
        System.out.println(savingsAccount.getBalance());//2699-100=2599 - 1*/

        //HomeWork的实例 10
        HomeWork.Doctor doctor1 = new HomeWork().new Doctor("李医生", 25, "妇科主任", "女", 20000);
        HomeWork.Doctor doctor2 = new HomeWork().new Doctor("李医生", 25, "妇科主任", "女", 20000);
        HomeWork.Doctor doctor3 = new HomeWork().new Doctor("张医生", 35, "皮肤科副主任", "男", 30000);
        HomeWork.Doctor doctor4 = new HomeWork().new Doctor("郑医生", 50, "院长", "男", 100000);
//        System.out.println(doctor1.equals(doctor2));
//        System.out.println(doctor3.equals(doctor4));
//        doctor1 = doctor2;
//        System.out.println(doctor1 == doctor2);

        //HomeWork的实例 11
//        HomeWork.Person2 person = new HomeWork().new Student();
//        person.run();
//        person.eat();
//        HomeWork.Student student = (HomeWork.Student) person;
//        student.study();
//        student.run();
//        student.eat();

        //HomeWork的实例 12
/*        HomeWork.Person3[] people = new HomeWork.Person3[4];
        people[0] = new HomeWork().new Student2("小明",'男',15,"001");
        people[1] = new HomeWork().new Student2("小丽",'女',13,"002");
        people[2] = new HomeWork().new Teacher3("王老师",'男',30,10);
        people[3] = new HomeWork().new Teacher3("熊老师",'女',25,5);
        System.out.println("====年龄排序前====");
        for (HomeWork.Person3 person : people) {
            System.out.println(person);
        }

        for (int i = 0; i < people.length; i++) {
            HomeWork.Person3 person = people[i];
            if (people[i] != null && people[i] instanceof HomeWork.Student2) {
//                ((HomeWork.Student2) people[i]).study();
                ((HomeWork.Student2) people[i]).printInfo();
            }else if (people[i] != null && people[i] instanceof HomeWork.Teacher3) {
//                ((HomeWork.Teacher3)people[i]).teach();
                ((HomeWork.Teacher3)people[i]).printInfo();
            }else {
                System.out.println("您的对象有误，请检查");
            }
            people[i].highToLowAge(people);
        }
        System.out.println("====年龄排序后====");
        for (HomeWork.Person3 person : people) {
            System.out.println(person);
        }*/

        //HomeWork的实例 14
//        HomeWork.C c = new HomeWork().new C();

    }
}


