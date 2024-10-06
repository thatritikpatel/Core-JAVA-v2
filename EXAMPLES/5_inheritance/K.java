//Hybrid Inheritance

interface A{ }

interface B{ }

interface C{ }

class E{ }

class D extends E implements A,B,C{ }

class F extends D{ }

class G extends D{ }

class H extends G
{
}