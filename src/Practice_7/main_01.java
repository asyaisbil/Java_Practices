/*calculator sınıfı içerisinde add isminde bir method tanımlayınız ve 2 tane int parameter alıp bunların değerlerini toplayıp
return etmelidir.
Daha sonra add metodunu double 2 parameter alıp bunların değerlerini return edecek şekilde overload ediniz. */

class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
}