public class exp6 {
    public static void main(String[] args) {
        long Year = 10;
        long LightSpeed = 186000;
        long Distance;

        Distance = Year*365*24*60*60*LightSpeed;
        System.out.print("In "+Year +" years ");
        System.out.print("Light will travel about ");
        System.out.println(Distance+" miles");
    }
}
