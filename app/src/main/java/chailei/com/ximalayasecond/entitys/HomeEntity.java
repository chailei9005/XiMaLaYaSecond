package chailei.com.ximalayasecond.entitys;

/**
 * Created by Administrator on 16-1-21.
 */
public class HomeEntity{
private DiscoveryColumnEntity discoveryColumns;
private RecommendEntity editorRecommendAlbums;
private HotRecommendEntity hotRecommends;
private FocusImages focusImages;
private BulletArea bulletArea;

public DiscoveryColumnEntity getDiscoveryColumns() {
        return discoveryColumns;
        }

public void setDiscoveryColumns(DiscoveryColumnEntity discoveryColumns) {
        this.discoveryColumns = discoveryColumns;
        }

public RecommendEntity getEditorRecommendAlbums() {
        return editorRecommendAlbums;
        }

public void setEditorRecommendAlbums(RecommendEntity editorRecommendAlbums) {
        this.editorRecommendAlbums = editorRecommendAlbums;
        }

public HotRecommendEntity getHotRecommends() {
        return hotRecommends;
        }

public void setHotRecommends(HotRecommendEntity hotRecommends) {
        this.hotRecommends = hotRecommends;
        }

public FocusImages getFocusImages() {
        return focusImages;
        }

public void setFocusImages(FocusImages focusImages) {
        this.focusImages = focusImages;
        }

public BulletArea getBulletArea() {
        return bulletArea;
        }

public void setBulletArea(BulletArea bulletArea) {
        this.bulletArea = bulletArea;
        }}
