package chailei.com.ximalayasecond.entitys;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ALBUM_ENTITY".
 */
public class AlbumEntity {

    private Long albumId;
    private Integer categoryId;
    private String title;
    private String coverOrigin;
    private String coverSmall;
    private String coverMiddle;
    private String coverLarge;
    private String coverWebLarge;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
    private Long uid;
    private String nickname;
    private Boolean isVerified;
    private String avatarPath;
    private String intro;
    private String introRich;
    private String tags;
    private Integer shares;
    private Boolean hasNew;
    private Boolean isFavorite;
    private Integer playTimes;
    private Integer status;
    private Integer serializeStatus;
    private Integer serialState;
    private Integer playTrackId;
    private Boolean isRecordDesc;

    public AlbumEntity() {
    }

    public AlbumEntity(Long albumId) {
        this.albumId = albumId;
    }

    public AlbumEntity(Long albumId, Integer categoryId, String title, String coverOrigin, String coverSmall, String coverMiddle, String coverLarge, String coverWebLarge, java.util.Date createdAt, java.util.Date updatedAt, Long uid, String nickname, Boolean isVerified, String avatarPath, String intro, String introRich, String tags, Integer shares, Boolean hasNew, Boolean isFavorite, Integer playTimes, Integer status, Integer serializeStatus, Integer serialState, Integer playTrackId, Boolean isRecordDesc) {
        this.albumId = albumId;
        this.categoryId = categoryId;
        this.title = title;
        this.coverOrigin = coverOrigin;
        this.coverSmall = coverSmall;
        this.coverMiddle = coverMiddle;
        this.coverLarge = coverLarge;
        this.coverWebLarge = coverWebLarge;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.uid = uid;
        this.nickname = nickname;
        this.isVerified = isVerified;
        this.avatarPath = avatarPath;
        this.intro = intro;
        this.introRich = introRich;
        this.tags = tags;
        this.shares = shares;
        this.hasNew = hasNew;
        this.isFavorite = isFavorite;
        this.playTimes = playTimes;
        this.status = status;
        this.serializeStatus = serializeStatus;
        this.serialState = serialState;
        this.playTrackId = playTrackId;
        this.isRecordDesc = isRecordDesc;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverOrigin() {
        return coverOrigin;
    }

    public void setCoverOrigin(String coverOrigin) {
        this.coverOrigin = coverOrigin;
    }

    public String getCoverSmall() {
        return coverSmall;
    }

    public void setCoverSmall(String coverSmall) {
        this.coverSmall = coverSmall;
    }

    public String getCoverMiddle() {
        return coverMiddle;
    }

    public void setCoverMiddle(String coverMiddle) {
        this.coverMiddle = coverMiddle;
    }

    public String getCoverLarge() {
        return coverLarge;
    }

    public void setCoverLarge(String coverLarge) {
        this.coverLarge = coverLarge;
    }

    public String getCoverWebLarge() {
        return coverWebLarge;
    }

    public void setCoverWebLarge(String coverWebLarge) {
        this.coverWebLarge = coverWebLarge;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntroRich() {
        return introRich;
    }

    public void setIntroRich(String introRich) {
        this.introRich = introRich;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public Boolean getHasNew() {
        return hasNew;
    }

    public void setHasNew(Boolean hasNew) {
        this.hasNew = hasNew;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSerializeStatus() {
        return serializeStatus;
    }

    public void setSerializeStatus(Integer serializeStatus) {
        this.serializeStatus = serializeStatus;
    }

    public Integer getSerialState() {
        return serialState;
    }

    public void setSerialState(Integer serialState) {
        this.serialState = serialState;
    }

    public Integer getPlayTrackId() {
        return playTrackId;
    }

    public void setPlayTrackId(Integer playTrackId) {
        this.playTrackId = playTrackId;
    }

    public Boolean getIsRecordDesc() {
        return isRecordDesc;
    }

    public void setIsRecordDesc(Boolean isRecordDesc) {
        this.isRecordDesc = isRecordDesc;
    }

}
