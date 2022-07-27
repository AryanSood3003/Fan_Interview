
class Main extends Test {
    private int currentState;
    private boolean direction_rev;
    public Main() {
        currentState = 0;
        direction_rev=true;
    }

    public void pull(int n ) {
        if(n==1)
        {
       if (currentState== 3) {
            currentState=0;
        } else {
            currentState++;
        }
    }
    else if(n==2)
    {
         direction_rev=!direction_rev;
    }
    else
    {
        System.out.println("Invalid Choice\n");
    }
     System.out.println("Current Fan Speed "+currentState);
      if(direction_rev)
         System.out.println("Rotation is Forward\n");
         else
          System.out.println("Rotation is Backward\n");
}
}
