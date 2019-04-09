package abstractfactorypattern.code.factory;

import abstractfactorypattern.code.keybo.KeyBo;
import abstractfactorypattern.code.mouse.Mouse;

public interface AbstractFactory {
    public Mouse makeMouse();
    public KeyBo makeKeyBo();
}
