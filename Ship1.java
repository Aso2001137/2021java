public class Ship1 {
    public int Ship1Hp;
    
    public Ship1(int hp){
        this.Ship1Hp=hp;
    }
    public void disp(){
        System.out.printf("船1:残り耐久%d\n",Ship1Hp);
    }
    public coo(){
        Random rnd = new Random();
        int x = rnd.nextInt(5);
        int y = rnd.nextInt(5);
    }
}
