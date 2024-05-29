import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public StreamService(List<Stream> streamList){
        this.streamList = streamList;
    }

    public void  addStream(Stream stream){
        streamList.add(stream);
    }

    public void removeStream(Stream stream){
        streamList.remove(stream);
    }

    public List<Stream> getSortedStreams(){
        List<Stream> streams = streamList;
        Collections.sort(streams);
        return streams;
    }
}
