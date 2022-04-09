public class ZR implements Comparable<ZR> {

    private Integer num; //любое
    private Integer den; //>0


    public ZR(Integer num, Integer den) throws Exception {
        this.num = num;
        if (den < 0) {
            throw new Exception("den<0");
        }
        this.den = den;
        evc();
    }

    public ZR(String inStr) throws Exception {
        String[] aa = inStr.split("\\/");


        this.num = Integer.valueOf(aa[0]);
        this.den = Integer.valueOf(aa[1]);
        evc();
        if (this.den < 0) {
            throw new Exception("den<0");
        }

    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getDen() {
        return den;
    }

    public void setDen(Integer den) {
        this.den = den;
    }

    public ZR sum(ZR rf) throws Exception {
        Integer num = this.num * rf.den + rf.num * this.den;

        Integer den = this.den * rf.den;
        evc();
        return new ZR(num, den);
    }

    public ZR sub(ZR rf) throws Exception {
        Integer num = this.num * rf.den - this.den * rf.num;

        Integer den = this.den * rf.den;

        evc();
        return new ZR(num, den);
    }

    public ZR mul(ZR rf) throws Exception {
        Integer num = this.num * rf.num;
        Integer den = this.den * rf.den;
        evc();
        return new ZR(num, den);
    }

    public ZR div(ZR rf) throws Exception {
        Integer num = this.num * rf.den;
        Integer den = this.den * rf.num;
        evc();
        return new ZR(num, den);
    }

    public ZR evc() throws Exception {


        Integer tmp = num % den;
        Integer n = num;
        Integer m = den;

        while (tmp != 0 && m > 0) {
            n = m;
            m = tmp;
            tmp = n % m;
        }
        if (m < 0) {
            m = m * -1;
        }
        {
            num = num / m;
            den = den / m;
        }

        if (num % 2 == 0 && den % 2 == 0) {
            num /= 2;
            den /= 2;
        }
        return this;
    }

    public int compareTo(ZR rf) {

        ZR dif = null;
        try {
            dif = this.sub(rf);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if ( dif.num>0 ) {
            return 1;
        } else if (dif.num<0) {
            return -1;
        } else
            return 0;
    }



    @Override
    public String toString() {
        return "" +num +"\\"+den;
    }

    public ZR fromString(String inStr)throws Exception{
        String[] aa = inStr.split("\\/");
        Integer nom = Integer.valueOf(aa[0]);
        Integer den = Integer.valueOf(aa[1]);
        return new ZR(nom,den);
    }


    }

