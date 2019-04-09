package abstractfactorypattern.code.main;

import abstractfactorypattern.code.factory.AbstractFactory;
import abstractfactorypattern.code.factory.FactoryBuild;

public class AbstractFactoryDemo {
    public static void main(String[] args)throws Exception{
        FactoryBuild build = new FactoryBuild();
        AbstractFactory logitectFactory = build.getFactoryByName("logitect");
        logitectFactory.makeMouse().getName();
        logitectFactory.makeKeyBo().getName();
        AbstractFactory rapooFactory  = build.getFactoryByName("rapoo");
        rapooFactory.makeKeyBo().getName();
        rapooFactory.makeMouse().getName();

        AbstractFactory logitectFactory1 = build.getFactoryByClasName("abstractfactorypattern.code.factory.LogitectFactory");
        logitectFactory1.makeMouse().getName();
        logitectFactory1.makeKeyBo().getName();
        AbstractFactory rapooFactory1  = build.getFactoryByClasName("abstractfactorypattern.code.factory.RapooFactory");
        rapooFactory1.makeKeyBo().getName();
        rapooFactory1.makeMouse().getName();
    }
}
