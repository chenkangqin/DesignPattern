package abstractfactorypattern.code.factory;

import abstractfactorypattern.code.keybo.KeyBo;
import abstractfactorypattern.code.keybo.LogitectKeyBo;
import abstractfactorypattern.code.mouse.LogitectMouse;
import abstractfactorypattern.code.mouse.Mouse;

public class LogitectFactory implements AbstractFactory {
    @Override
    public Mouse makeMouse() {
        return new LogitectMouse();
    }

    @Override
    public KeyBo makeKeyBo() {
        return new LogitectKeyBo();
    }
}
