class Singleton Test{

 public static void main(String[] args){
 system.out.printin(renbanA.getNumber());
 system.out.printin(renbanB.getNumber());
 system.out.printin(renbanA.getNumber());
 system.out.printin(renbanA.getNumber());
 system.out.printin(renbanB.getNumber());


 }
}
class Renban{
 private static Renban instnce = new Renban();
 private int number;

 private Renban(){
number = 0000

}

 oublic staric Renban getInstance(){
	return instance;
}

 public String getNumber(){
 number= number + 1;
 return number;
}