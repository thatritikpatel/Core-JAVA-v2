/*class A extends B{ }*/
/*class A extends B,C{ }*/ //NOT OK
/*class A extends E{ }*/  //NOT OK
/*class A extends E,F{ }*/  //NOT OK

/*class A implements B{ }*/ //NOT OK
/*class A implements B,C{ }*/ //NOT OK
/*class A implements E{ }*/
/*class A implements E,F,G{ }*/

class B{ }
class C{ }


interface E{ }
interface F{ }
interface G{ }
