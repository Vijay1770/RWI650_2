
//Protected Access Modifier...

class Animal {
    protected void display() {
        System.out.println("I am an animal");
    }
}

//Static Block....

class Access_modifies extends Animal {
    static
    {
        System.out.println("Dog is running");
    }
    public static void main(String[] args) {

        // create an object of Dog class
        Access_modifies dog = new Access_modifies();
        // access protected method
        dog.display();
//Final Keyword....
        final int a=5;
        //a++;  This gives error because we cant update final variable value...
        System.out.println("The value of final variable is -->"+a);
    }
}