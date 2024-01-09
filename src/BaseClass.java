public class BaseClass {
    
    public final void recommendedMethod(){

        System.out.println("[BaseClass.recommendedMethod]: Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    private void mandatoryMethod() {

        System.out.println("[BaseClass.optionalMethod]: This Class NoN_NEGOTIABLE");

    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customize optional method");
    }

    public static void recommendedStatic(){

        System.out.println("[BaseClass.recommendedStatic] Best Way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }

    private static void mandatoryStatic(){
        System.out.println("[BaseClass.MandatoryStatic]: Mandatory");
    }
    


}
