class Main
{
    /**
     * Methods that does the work 
     */
    public void text()
    {
        System.out.println("Hello, KoKo");
    }
    
    public void text2()
    {
        System.out.println("Goodbye, KoK0o");
    }
    
    /**
     *  main method for testing outside BlueJ 
     */
    public static void main(String[] args)
    {
        Main hi = new Main();
        int x = 0;
        
        while (x <= 4) {
            hi.text();
            if (x == 3)
                hi.text2();
            x = x + 1;
        }
    }
}
