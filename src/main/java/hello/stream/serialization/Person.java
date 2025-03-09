package hello.stream.serialization;

import java.io.*;

public class Person implements Externalizable {
    private static final long serialVersionUID = 1L;
    String name;
    // transient String job; 직렬화하고 싶지 않은 변수는 transient 를 붙여준다
    String  job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
   //     out.writeUTF(job);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    //    job = in.readUTF();
        name = in.readUTF();

    }
}
