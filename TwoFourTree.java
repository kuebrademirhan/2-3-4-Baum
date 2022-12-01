import java.lang.Comparable;
public class TwoFourTree<T extends Comparable<T>> extends AbstractTwoFourTree<T>{

   public TwoFourTree(){
       super(null,null,null,null,null,null,null);
    }
    private TwoFourTree(AbstractTwoFourTree c1, T v1, AbstractTwoFourTree c2, T v2, AbstractTwoFourTree c3, T v3, AbstractTwoFourTree c4) {
        super(c1, v1, c2, v2, c3, v3, c4);
    }

    @Override
    public int size(){
        int counter=0;
        if(this.v1!=null){
            counter++;
        }
        if(this.v2!=null){
            counter++;
        }
        if(this.v3!=null){
            counter++;
        }
        if(this.c1!=null){
            if(this.c1.v1!=null){
                counter++;
            }
            if(this.c1.v2!=null){
                counter++;
            }
            if(this.c1.v3!=null){
                counter++;
            }
        }
        if(this.c2!=null){
            if(this.c2.v1!=null){
                counter++;
            }
            if(this.c2.v2!=null){
                counter++;
            }
            if(this.c2.v3!=null){
                counter++;
            }
        }
        if(this.c3!=null){
            if(this.c3.v1!=null){
                counter++;
            }
            if(this.c3.v2!=null){
                counter++;
            }
            if(this.c3.v3!=null){
                counter++;
            }
        }


       return counter;
    }

    @Override
    public int height() {
       if(this.c1==null && this.c2==null && this.c3==null){
           return 0;
       }
       if(this.c1!=null || this.c2!=null || this.c3!=null){
           return 1;
       }
        return 0;
    }

    @Override
    public T get(T v) {
        return null;
    }

    @Override
    public AbstractTwoFourTree<T> put(T v) {
       if(c1!=null){

       }
        if(v.compareTo(this.v1)<0){
            if(v.compareTo(this.c1.v1)<0){

            }
        }
        return null;
    }

    @Override
    public AbstractTwoFourTree<T> remove(T v) {
        return null;
    }

    private void putHelper(T v){
       int counter=0;
       if(this.c1!=null ){
           this.putHelper(v);
       }else{
           if(v1!=null){
               counter++;
           }
           if(v2!=null){
               counter++;
           }
           if(v3!=null){
               counter++;
           }
           if(counter<3){
               if(v.compareTo(v1)<=0){
                   AbstractTwoFourTree temp=new TwoFourTree(null,null,null,v,this.v1,v2,v3);
               }else if(v.compareTo(v2)<=0){

               }else{

               }


           }

       }
    }

}
