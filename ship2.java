public class ship2 {
    public int Ship2Hp;

    public ship2(int hp){
        this.Ship2Hp=hp;
    }
    public void disp(){
        System.out.printf("船2:残り耐久%d\n",Ship3Hp);
    }   
    public coo(){
        Random rnd = new Random();
        int x = rnd.nextInt(5);
        int y = rnd.nextInt(5);
    }
}
