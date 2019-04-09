package abstractfactorypattern.code.factory;

import abstractfactorypattern.code.keybo.KeyBo;
import abstractfactorypattern.code.keybo.RapooKeyBo;
import abstractfactorypattern.code.mouse.Mouse;
import abstractfactorypattern.code.mouse.RapooMouse;

public class RapooFactory implements AbstractFactory {
    @Override
    public Mouse makeMouse() {
        return new RapooMouse();
    }

    @Override
    public KeyBo makeKeyBo() {
        return new RapooKeyBo();
    }
}
