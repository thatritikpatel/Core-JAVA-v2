class A{ }
class B{ }
class C{ }



/*interface E extends A{ }*/ //NOT OK
/*interface E extends A,B{ }*/  //NOT OK
/*interface E extends F{ }*/
/*interface E extends F,G{ }*/

//NOT OK
/*interface E implements A{ }*/
/*interface E implements A,B{ }*/
/*interface E implements F{ }*/
/*interface E implements F,G{ }*/

interface F{ }
interface G{ }
