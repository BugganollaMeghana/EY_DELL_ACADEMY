package EY_1708;

public class TryWithResourceWithAutoCloseable {

	public static void main(String[] args) {
		
		try {
			tryWithResource();
		} catch (Exception e) {
			System.out.println("Exception thrown is " + e.getMessage());
		}
		try {
			tryWithoutResource();
		} catch (Exception e) {
			System.out.println("Exception thrown is " + e.getMessage());
		}
		}
	static void tryWithResource() throws Exception {
		try(MyResource mr = new MyResource()) {
			System.out.println("I am in Try with Resource ");
			if(true) {
				throw new Exception("Exception thrown from Try with Resource");
			}
		}
	}
	static void tryWithoutResource() throws Exception {
		MyResource mr = null;
		try {
			mr = new MyResource();
			System.out.println("I am in Try without Resource ");
			if(true) {
				throw new Exception("Exception thrown from Try without Resource");
			}
		}finally {
			if(mr!=null) {
				mr.close();
			}
		}
	}
	static class MyResource implements AutoCloseable{
		
		@Override
		public void close() throws Exception {
			System.out.println("Close will be called automatically" + "for all cleanup activity");
		}
		
	}
}
