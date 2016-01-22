package chailei.com.ximalayasecond.entitys;

import java.util.List;

/**
 * Created by Administrator on 16-1-21.
 */
public class DiscoveryColumnEntity {

    private String title;
    private List<DiscoveryEntity> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DiscoveryEntity> getList() {
        return list;
    }

    public void setList(List<DiscoveryEntity> list) {
        this.list = list;
    }
}
