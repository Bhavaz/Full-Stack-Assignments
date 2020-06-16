class Test
{

public static void main(String[] args) 
   {
	Instance instance =new Instance();
	InstanceParent instanceParent =new InstanceParent(); 
	InstanceParent parentInstanceWithChildObject = instance;
	
	Instance instanceChildwithParentObject =(Instance)parentInstanceWithChildObject;
	System.out.println("DownCasting");
			System.out.println(instanceChildwithParentObject instanceof InstanceParent);
	System.out.println(instance instanceof InstanceParent? "instance object is an instance of InstanceParent Class":"instance object is not an instance of InstanceParent Class" );
	System.out.println(instanceParent instanceof Instance? "instanceParent object is an instance of Instance Class":"instanceParent object is not an instance of Instance Class" );
	System.out.println(parentInstanceWithChildObject instanceof Instance? "ParentInstanceWithChildObject object is an instance of Instance Class":"ParentInstanceWithChildObject object is not an instance of Instance Class" );
   }
}
