import com.mighty.designpatterns.Template.ConcreteClassA;
import com.mighty.designpatterns.Template.ConcreteClassB;
import com.mighty.designpatterns.adapter.classadapter.AC220;
import com.mighty.designpatterns.adapter.classadapter.DC5;
import com.mighty.designpatterns.adapter.classadapter.PowerAdapter;
import com.mighty.designpatterns.adapter.interfaceadapter.Power5VAdapter;
import com.mighty.designpatterns.bridge.*;
import com.mighty.designpatterns.builder.Robot;
import com.mighty.designpatterns.builder.RobotBuilder;
import com.mighty.designpatterns.builder.RobotDirector;
import com.mighty.designpatterns.builder.SuperRobotBuilder;
import com.mighty.designpatterns.command.ConcreteCammand;
import com.mighty.designpatterns.command.Invoker;
import com.mighty.designpatterns.command.Receiver;
import com.mighty.designpatterns.command.example.*;
import com.mighty.designpatterns.composite.*;
import com.mighty.designpatterns.decorator.*;
import com.mighty.designpatterns.expression.*;
import com.mighty.designpatterns.factory.factorymethod.ChronicDisease;
import com.mighty.designpatterns.factory.factorymethod.HypertensionFactory;
import com.mighty.designpatterns.factory.factorymethod.IChronicDiseaseFactory;
import com.mighty.designpatterns.flyweight.User;
import com.mighty.designpatterns.flyweight.WebSite;
import com.mighty.designpatterns.flyweight.WebsiteFactory;
import com.mighty.designpatterns.handler.CommonManager;
import com.mighty.designpatterns.handler.GeneralManager;
import com.mighty.designpatterns.handler.Majordomo;
import com.mighty.designpatterns.handler.WorkRequest;
import com.mighty.designpatterns.instance.HungrySingleton;
import com.mighty.designpatterns.instance.HungrySingletonEnum;
import com.mighty.designpatterns.instance.LazySingleton;
import com.mighty.designpatterns.iterator.ConcreteAggregate;
import com.mighty.designpatterns.iterator.ConcreteIterator;
import com.mighty.designpatterns.iterator.Iterator;
import com.mighty.designpatterns.mediator.Iraq;
import com.mighty.designpatterns.mediator.USA;
import com.mighty.designpatterns.mediator.UnitedNationsSecurityCouncil;
import com.mighty.designpatterns.memento.Gamer;
import com.mighty.designpatterns.memento.Memento;
import com.mighty.designpatterns.observer.*;
import com.mighty.designpatterns.prototype.PrototypeObject;
import com.mighty.designpatterns.state.Work;
import com.mighty.designpatterns.strategy.ConcreteStrategyA;
import com.mighty.designpatterns.strategy.ConcreteStrategyB;
import com.mighty.designpatterns.strategy.ConcreteStrategyC;
import com.mighty.designpatterns.strategy.Context;
import com.mighty.designpatterns.visitor.*;

public class Main {

    public static void main(String[] args) {
        Main a = new Main();

        //策略模式
        //a.doStrategy();

        //装饰者模式
        //a.doDecoretor();

        //工厂方法模式
        //a.doFactoryMethod();

        // 原型模式
        //try {
        //    a.doPrototype();
        //} catch (CloneNotSupportedException e) {
        //    e.printStackTrace();
        //}

        // 模板模式
        //a.doTemplate();

        // 建造者模式
        //a.doBuilder();

        // 观察者模式
        //a.doObserver();

        //状态模式
        //a.doState();

        // 备忘录模式
        //a.doMemento();

        // 组合模式
        //a.doComposite();

        //迭代器模式
        //a.doIterator();

        //单例模式
        //a.doSingleton();

        // 桥接模式
        //a.doBridge();

        // 命令模式
        //a.doCammand1();
        //a.doCammand2();

        //职责链模式
        //a.doHandler();

        // 中介者模式
        //a.doMediator();

        // 享元模式
        //a.doFlyWeight();

        // 解释器模式
        //a.doExpression();

        // 访问者模式
        a.doVisitor();
    }

    /**
     * 策略模式
     */
    public void doStrategy() {
        // Strategy ============================================================================================
        Context context;
        // 根据具体情况传入需要的实例
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

    }

    /**
     * 装饰者模式
     */
    public void doDecoretor() {

        // Decorator ============================================================================================

        Pancake pancake = new Roujiamo();
        pancake = new FiredEgg(pancake);
        pancake = new Cucumber(pancake);
        pancake = new MeatFloss(pancake);

        System.out.println("料理：" + pancake.getDesc());
        System.out.println("价格：" + pancake.price());

    }

    /**
     * 工厂方法模式
     */
    public void doFactoryMethod() {
        IChronicDiseaseFactory cdFactory = new HypertensionFactory();
        ChronicDisease cd = cdFactory.createChronicDisease();

        System.out.println(cd.getName());

    }

    /**
     * 原型模式
     */
    public void doPrototype() throws CloneNotSupportedException {

        PrototypeObject prototypeObject = new PrototypeObject();
        prototypeObject.setI(1);
        prototypeObject.setName("abc");
        PrototypeObject prototypeObjectCopy = prototypeObject.clone();
        System.out.println(prototypeObjectCopy.getI());
        System.out.println(prototypeObjectCopy.getName());

    }

    /**
     * 模板方法模式
     */
    public void doTemplate() {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        ConcreteClassB concreteClassB = new ConcreteClassB();

        concreteClassA.templateMethod();
        concreteClassB.templateMethod();

    }

    /**
     * 建造者模式
     */
    public void doBuilder() {
        RobotBuilder robotBuilder = new SuperRobotBuilder();
        RobotDirector robotDirector = new RobotDirector(robotBuilder);

        Robot robot = robotDirector.buildRobot();

        System.out.println("手臂（" + robot.getRobotArms().getDescription() + "）； 身体（" + robot.getRobotBody().getDescription() + "）； 头部（" + robot.getRobotHead().getDescription() + "）； 腿（" + robot.getRobotLegs().getDescription() + "）");

    }

    /**
     * 观察者模式
     */
    public void doObserver() {
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Subject subject = new ConcreteSubject();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers();

    }

    public void doState() {
        // 紧急项目
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        //work.setFinish(true);
        work.setFinish(false);

        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();

    }

    public void doAdapter() {
        // 类适配
        DC5 dc5 = new PowerAdapter();
        dc5.output5V();

        // 对象适配
        DC5 dc51 = new com.mighty.designpatterns.adapter.objectadapter.PowerAdapter();
        dc51.output5V();

        // 接口适配
        // 已经实现了子类
        com.mighty.designpatterns.adapter.interfaceadapter.PowerAdapter power5vadapter = new Power5VAdapter(new AC220());

        // 直接实现子类
        com.mighty.designpatterns.adapter.interfaceadapter.PowerAdapter power5vadapter2 = new Power5VAdapter(new AC220()) {
            @Override
            public int output5V() {
                int output = 0;
                if (ac220 != null) {
                    output = ac220.output220V() / 44;
                }
                return output;
            }
        };

        power5vadapter2.output5V();
    }

    public void doMemento() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("当前状态：" + i);
            System.out.println("当前金额：" + gamer.getMoney());
            gamer.bet();
            if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("金钱过少，恢复到以前的状态：");
                gamer.resotreMemento(memento);
                System.out.println("此时状态为：" + gamer);
            } else if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱增多，保存当前状态：");
                memento = gamer.createMemento();
                System.out.println("此时状态为：" + gamer);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * 组合模式
     */
    public void doComposite() {

        AbstractFile file1 = new ImageFile("小龙女.jpg");
        AbstractFile file2 = new ImageFile("张无忌.gif");
        AbstractFile file3 = new TextFile("九阴真经.txt");
        AbstractFile file4 = new TextFile("葵花宝典.doc");
        AbstractFile file5 = new VideoFile("笑傲江湖.rmvb");

        AbstractFile folder1 = new Folder("Sunny的资料");
        AbstractFile folder2 = new Folder("图像文件");
        AbstractFile folder3 = new Folder("文本文件");
        AbstractFile folder4 = new Folder("视频文件");

        folder2.add(file1);//小龙女
        folder2.add(file2);//张无忌

        folder3.add(file3);//九阴真经
        folder3.add(file4);//葵花宝典

        folder4.add(file5);//笑傲江湖

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //从“Sunny的资料”节点开始进行杀毒操作
        folder1.killVirus();
    }

    /**
     * 迭代器模式
     */
    public void doIterator() {
        ConcreteAggregate a = new ConcreteAggregate();
        a.add("大鸟");
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        Iterator iterator = new ConcreteIterator(a);
        Object item = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " 请买车票！");
            iterator.next();
        }

    }

    /**
     * 单例模式
     */
    public void doSingleton() {

        // 懒汉
        LazySingleton.getInstance();

        // 饿汉1 内部类实现
        HungrySingleton.getInstance();

        // 饿汉2 调用单例方法
        HungrySingletonEnum.INSTANCE.process();

    }

    // 桥接模式
    public void doBridge() {
        AbstractMessage commonMessage = new CommonMessage(new MessageSMS());
        commonMessage.sendMessage("加班申请速批", "陈总");

        AbstractMessage urgencyMessage = new UrgencyMessage(new MessageEmail());
        urgencyMessage.sendMessage("请假申请速批", "王总");

    }

    //命令模式
    public void doCammand1() {
        Invoker invoker = new Invoker();
        invoker.setCammand(new ConcreteCammand(new Receiver()));
        invoker.executeCammand();
    }

    // 命令模式（例子）
    public void doCammand2() {
        // 开店准备
        Barbecuer boy = new Barbecuer();
        BarbecueCommand bakeMuttonnCammand1 = new BakeMuttonCammand(boy);
        BarbecueCommand bakeMuttonnCammand2 = new BakeChickenWingCammand(boy);
        BarbecueCommand abkeChickenWingCammand = new BakeChickenWingCammand(boy);
        Waiter girl = new Waiter();

        //开门营业
        //girl.setOrder(bakeMuttonnCammand1);
        girl.addOrder(bakeMuttonnCammand2);


        // 点餐完毕，通知厨房
        girl.makeCammand();
    }

    /**
     * 职责链模式
     */
    public void doHandler() {
        CommonManager jingli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zongjinli = new GeneralManager("纵精力");

        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjinli);

        WorkRequest request = new WorkRequest();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jingli.requestApplications(request);

        WorkRequest request2 = new WorkRequest();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jingli.requestApplications(request2);

        WorkRequest request3 = new WorkRequest();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jingli.requestApplications(request3);

        WorkRequest request4 = new WorkRequest();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jingli.requestApplications(request4);

    }

    /**
     * 中介者模式
     */
    public void doMediator() {
        UnitedNationsSecurityCouncil unitedNations = new UnitedNationsSecurityCouncil();
        USA usa = new USA(unitedNations);
        Iraq iraq = new Iraq(unitedNations);

        unitedNations.setColleague1(usa);
        unitedNations.setColleague2(iraq);

        usa.declare("不准研制核武器，否则要发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略。");

    }


    /**
     * 享元模式
     */
    public void doFlyWeight() {
        WebsiteFactory factory = new WebsiteFactory();
        WebSite siteA1 = factory.getWebSiteCatefory("产品展示");
        siteA1.use(new User("小菜"));

        WebSite siteA2 = factory.getWebSiteCatefory("产品展示");
        siteA2.use(new User("大鸟"));

        WebSite siteA3 = factory.getWebSiteCatefory("产品展示");
        siteA3.use(new User("娇娇"));

        WebSite siteB1 = factory.getWebSiteCatefory("博客");
        siteB1.use(new User("周伯通"));

        WebSite siteB2 = factory.getWebSiteCatefory("博客");
        siteB1.use(new User("许仙"));

        WebSite siteB3 = factory.getWebSiteCatefory("博客");
        siteB3.use(new User("杨过"));

        System.out.println("得到网站分类总数为" + factory.getSiteCount());

    }

    /**
     * 解释器模式
     */
    public void doExpression() {
        com.mighty.designpatterns.expression.Context ctx = new com.mighty.designpatterns.expression.Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }

    /**
     * 访问者模式
     */
    public void doVisitor() {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        o.accept(visitor1);
        o.accept(visitor2);

    }

}
