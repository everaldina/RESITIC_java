# Questões Discursivas
## Questã 01
O que é uma classe em Java e qual é a  diferença entre uma classe e um  objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

> Classe é um modelo para se seguir, que definem atributos e metodos (coisa a se fazer). Já o objeto é a instanciação da classe, ou seja, algo que segue o modelo da classe.
> 
> Exemplo de classe:
> * Ponto
> * Pessoa
> * Retangulo 
> * ContaBancaria 
> * Carro

### Classe Ponto
#### Em c++:
~~~C++
class Point {
    private:
        int x, y;

    public:
        Point(int x, int y) : x(x), y(y) {}

        int getX() const { return x; }
        int getY() const { return y; }

        void setX(int newX) { x = newX; }
        void setY(int newY) { y = newY; }
};
~~~

#### Em Java:
~~~Java
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
}
~~~

### Classe Pessoa
#### Em c++:
~~~C++
class Person {
    private:
        std::string name;
        int age;

    public:
        Person(const std::string& n, int a) : name(n), age(a) {}

        std::string getName() const { return name; }
        int getAge() const { return age; }
        void celebrateBirthday() { ++age; }
};
~~~
#### Em Java:
~~~Java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void celebrateBirthday() {
        ++age;
    }
}
~~~

### Classe Retangulo
#### Em c++:
~~~C++
class Rectangle {
    private:
        double length, width;

    public:
        Rectangle(double l, double w) : length(l), width(w) {}

        double getLength() const { return length; }
        double getWidth() const { return width; }
        double calculateArea() const { return length * width; }
};
~~~
#### Em Java:
~~~Java
public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double calculateArea() {
        return length * width;
    }
}
~~~

### Classe ContaBancaria
#### Em c++:
~~~C++
class BankAccount {
    private:
        std::string accountHolder;
        double balance;

    public:
        BankAccount(const std::string& holder, double initialBalance) : accountHolder(holder), balance(initialBalance) {}

        std::string getAccountHolder() const { return accountHolder; }
        double getBalance() const { return balance; }

        void deposit(double amount) { balance += amount; }
        void withdraw(double amount) { balance -= amount; }
};
~~~
#### Em Java:
~~~Java
public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
~~~	

### Classe Carro
#### Em c++:
~~~C++
class Car {
    private:
        std::string brand, model;
        int year;

    public:
        Car(const std::string& b, const std::string& m, int y) : brand(b), model(m), year(y) {}

        std::string getBrand() const { return brand; }
        std::string getModel() const { return model; }
        int getYear() const { return year; }
};
~~~
#### Em Java:
~~~Java
public class Car {
    private String brand, model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear(){
        return year;
    }
}
~~~

## Questã 02
Como  você  declara  uma  variável  em  Java  e  quais  são  os  tipos  de  dados primitivos mais comuns? Faça  um paralelo entre isso e a mesma coisa na linguagem C++.

> Em java uma variável é declarada das seguintes formas:
> 
>   ``` [tipo] [nome] = [valor]; ```
> 
>   ``` [tipo] [nome];```
> 
> Tipos primitivos em java: byte, short, int, long, boolean, char, float e double.
> 
> Java | C++ | Bytes em java | Bytes em C++
> --------- | ------ | --------- | ---------
> byte | char | 1 |1 
> short | short int | 2  | 2 
> int | int | 4  | 4 
> long | long long int | 8  | 8 
> boolean | bool | 1 bit | 1 
> char | char | 2  | 1 
> float | float | 4  | 4 
> double | double | 8  | 8 

## Questã 03
Explique  o  conceito  de  herança  em  Java  e  como  você  pode  criar  uma  subclasse  a  partir  de  uma  classe  existente.  Faça  um  paralelo  com  C++, apresentando 5 exemplos.
> Herança é quando uma classe herda todos os atributos e metodos de uma outra classe pai, se tornando "filha" dessa classe pai.
>
> Para criar uma classe filha em java, basta ao criar uma classe, colocar "extends <nome da classe pai>" após o nome da classe. Isso em C++ era feito usando ":" após o nome da classe e o nome da classe pai.
### Classe Animal
#### Em C++:
~~~C++
class Animal {
    public:
        virtual void fazerBarulho() = 0;
};
~~~
#### Em Java:
~~~Java
public abstract class Animal {
    public abstract void fazerBarulho();
}
~~~

### Classe Cachorro e Gato (herdam de Animal)
#### Em C++:
~~~C++
class Cachorro : public Animal {
    public:
        void fazerBarulho() { std::cout << "Au Au.\n"; }
};

class Gato : public Animal {
    public:
        void fazerBarulho() { std::cout << "Miau.\n"; }
};
~~~

#### Em Java:
~~~Java
public class Cachorro extends Animal {
    public void fazerBarulho() {
        System.out.println("Au Au.");
    }
}

public class Gato extends Animal {
    public void fazerBarulho() {
        System.out.println("Miau.");
    }
}
~~~


### Classe Forma
#### Em C++:
~~~C++
class Forma{
    public:
        virtual double calcularArea() = 0;
};
~~~	
#### Em Java:
~~~Java
public class Forma {
    public abstract double calcularArea();
}
~~~

### Classe Quadrado, Circulo e Retangulo (herdam de Forma)
#### Em C++:
~~~C++
class Quadrado : public Forma {
    private:
        double lado;

    public:
        Quadrado(double lado) : lado(lado) {}

        double getLado() { return lado; }
        void setLado(double lado) { this->lado = lado; }

        double calcularArea() { return lado * lado; }
};

class Circulo : public Forma {
    private:
        double raio;

    public:
        Circulo(double raio) : raio(raio) {}

        double getRaio() { return raio; }
        void setRaio(double raio) { this->raio = raio; }

        double calcularArea() { return 3.1415 * raio * raio; }
};

class Retangulo : public Quadrado{
    private:
        double altura;

    public:
        Retangulo(double lado, double altura) : Quadrado(lado), altura(altura) {}

        double getAltura() { return altura; }
        void setAltura(double altura) { this->altura = altura; }

        double calcularArea() { return getLado() * altura; }
};
~~~
#### Em java:
~~~Java       
public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public double calcularArea() {
        return 3.1415 * raio * raio;
    }
}

public class Retangulo extends Forma{
    private double altura;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return getLado() * altura;
    }

}
~~~
## Questã 04
Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto. 
> Em java, ao declarar uma variavel, na verdade esta sendo criado um ponteiro para um objeto da classe daquela variavel, de forma que seja feito uma referencia ao objeto. 
> 
> Já em C++ ao declarar uma variável, esta sendo criado um objeto da classe daquela variavel, de forma que a variavel seja o objeto.