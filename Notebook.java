package les2_home_work;


import java.math.BigDecimal;
import java.util.UUID;


public class Notebook implements Comparable<Notebook> {
    BigDecimal price;
    int memory;
    Producer producer;
    UUID serialId = UUID.randomUUID();

    public Notebook(BigDecimal price, int memory, Producer producer) {
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public Producer getProducer() {
        return producer;
    }

    public UUID getSerialId() {
        return serialId;
    }

    public enum Producer {
        ASER, AVIO, MACBURG, SIMSUNG, MACNOTE
    }

    @Override
    public int compareTo(Notebook n) {
        int result = price.compareTo(n.getPrice());
        if (result == 0) {
            result =  Integer.compare(memory, n.getMemory());
            if (result == 0) {
                return producer.compareTo(n.getProducer());
            }
            return result;
        }
        return result;
    }

}

