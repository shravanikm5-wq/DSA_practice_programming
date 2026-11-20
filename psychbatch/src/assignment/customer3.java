package assignment;


	class Restaurant
	{
	    void prepareFood()
	    {
	        System.out.println("Food is prepared");
	    }
	}

	class DeliveryPartner
	{
	    Restaurant deliver()
	    {
	        Restaurant r = new Restaurant();
	        return r;
	    }
	}

	class FoodApp
	{
	    DeliveryPartner order()
	    {
	        DeliveryPartner dp = new DeliveryPartner();
	        return dp;
	    }
	}

	class customer3
	{
	    public static void main(String[] args)
	    {
	        Restaurant r = new FoodApp().order().deliver();
	        r.prepareFood();
	    }
	

}
