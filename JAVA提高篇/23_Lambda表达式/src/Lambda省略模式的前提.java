
/*
    Lambda表达式:是可推导,可以省略
    凡是根据上下文推导出来的内容,都可以省略书写
    可以省略的内容:
        1.(参数列表):括号中参数列表的数据类型,可以省略不写
        2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
        3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
            注意:要省略{},return,分号必须一起省略




   一行代码可以删除大括号
        invokeCook(()->{
            System.out.println("吃饭了");
        });

        一行代码可以删除大括号
      invokeCook(()-> System.out.println("吃饭了"));




      一行代码可以删除大括号
      new Thread(()->{ //一行代码可以删除大括号
            System.out.println(Thread.currentThread().getName()+" 新线程创建了");
        }
        ).start();

     new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建了"));



         //有返回值可以省略并且一行代码可以删掉大括号
        invokeCale(120,130,(int a ,int b)->{
            return a+b;
        });

        invokeCale(120,130,(int a ,int b)->
    a+b);

    //可以推到类型 就可以不写 return 也可以不写
     Arrays.sort(arr,(Person o1,Person o2)->{
           return o1.getAge()-o2.getAge();
        });

     Arrays.sort(arr,((o1, o2) ->o1.getAge()-o2.getAge()));




 */

