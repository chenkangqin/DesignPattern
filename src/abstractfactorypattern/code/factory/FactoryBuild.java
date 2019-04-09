package abstractfactorypattern.code.factory;

public class FactoryBuild {
    public  AbstractFactory getFactoryByName(String factoryName){
        if("logitect".equalsIgnoreCase(factoryName)){
            return new LogitectFactory();
        }else if("rapoo".equalsIgnoreCase(factoryName)){
            return new RapooFactory();
        }
        return null;
    }
    public  AbstractFactory getFactoryByClasName(String factoryClassName)throws Exception{
        return (AbstractFactory)Class.forName(factoryClassName).newInstance();
    }
}
