package assignment;


	class BlinkitWarehouse
	{
	    void food()
	    {
	        System.out.println("Hot hot food");
	    }
	}

	class DeliveryBoy
	{
	    BlinkitWarehouse delivery()
	    {
	        BlinkitWarehouse bw = new BlinkitWarehouse();
	        return bw;
	    }
	}

	class BlinkitApp
	{
	    DeliveryBoy order()
	    {
	        DeliveryBoy db = new DeliveryBoy();
	        return db;
	    }
	}

	class customer5
	{
	    public static void main(String[] args)
	    {
	        BlinkitWarehouse bw = new BlinkitApp().order().delivery();
	        bw.food();
	    }
	

}
