package dz_27_28;

public class TestDZ {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            }catch (NeVodaException neVodaException){
                System.out.println(neVodaException.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Eto finely block");
        }
    }
}



class NeMyasoException extends RuntimeException{
    NeMyasoException(String st){
        super(st);
    }
}

class NeVodaException extends Exception{
    NeVodaException(String st){
        super(st);
    }
}

class Tiger{
    public void eat(String st){

                if (st == "myaso"){
                    System.out.println("Tiger est myaso");
                }else {
                    throw new NeMyasoException("Tiger ne est : " + st);
                }


    }

    public  void drink(String st) throws NeVodaException {

            if (st == "voda"){
                System.out.println("Tiger pyet vody");
            }else {
                throw new NeVodaException("Tiger ne pyet: " + st);
            }

    }
}