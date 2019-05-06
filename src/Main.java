import com.mighty.designpatterns.Template.ConcreteClassA;
import com.mighty.designpatterns.Template.ConcreteClassB;
import com.mighty.designpatterns.builder.Robot;
import com.mighty.designpatterns.builder.RobotBuilder;
import com.mighty.designpatterns.builder.RobotDirector;
import com.mighty.designpatterns.builder.SuperRobotBuilder;
import com.mighty.designpatterns.decorator.*;
import com.mighty.designpatterns.factory.factorymethod.ChronicDisease;
import com.mighty.designpatterns.factory.factorymethod.HypertensionFactory;
import com.mighty.designpatterns.factory.factorymethod.IChronicDiseaseFactory;
import com.mighty.designpatterns.observer.*;
import com.mighty.designpatterns.prototype.PrototypeObject;
import com.mighty.designpatterns.state.Work;
import com.mighty.designpatterns.strategy.ConcreteStrategyA;
import com.mighty.designpatterns.strategy.ConcreteStrategyB;
import com.mighty.designpatterns.strategy.ConcreteStrategyC;
import com.mighty.designpatterns.strategy.Context;

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
        a.doState();
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

}
