public interface Ijisuanqi {
    int jisuan(int a, int b);
}
class fun{
    public void func(Ijisuanqi per,int a,int b){
        System.out.println(per.jisuan(a,b));
    }

}
class jiafa implements  Ijisuanqi{
    public int jisuan(int a,int b){
        return a+b;
    }
}
class jianfa implements Ijisuanqi{
    public int jisuan(int a,int b){
        return a-b;
    }
}
class chengfa implements Ijisuanqi{
    public int jisuan(int a,int b){
        return a*b;
    }
}
class chufa implements Ijisuanqi{
    public int jisuan(int a, int b) {
        if (b == 0) {

            return -1;
        } else {
            return a / b;
        }
    }
}
