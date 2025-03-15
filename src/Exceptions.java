public enum Exceptions {

    MYEXCEPTION(new MyException(),"Bad Request","Pis Istek",400);

    int code;
    String messageAZ;
    String messageEN;
    MyException exc;
    Exceptions(MyException exc,String messageEN, String messageAZ, int code) {
        this.exc=exc;
        this.messageEN = messageEN;
        this.messageAZ = messageAZ;
        this.code = code;
    }
    public void throwRuntimeEx()  {
        throw new RuntimeException(exc);
    }
    public void throwEx() throws Exception {
        throw new Exception(exc);
    }

}
