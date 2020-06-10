package com.ks.giphyfriend.net.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrendingResponse {

    @SerializedName("data")
    private List<Datum> data = null;
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("meta")
    private Meta meta;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public class Analytics {

        @SerializedName("onload")
        private Onload onload;
        @SerializedName("onclick")
        private Onclick onclick;
        @SerializedName("onsent")
        private Onsent onsent;

        public Onload getOnload() {
            return onload;
        }

        public void setOnload(Onload onload) {
            this.onload = onload;
        }

        public Onclick getOnclick() {
            return onclick;
        }

        public void setOnclick(Onclick onclick) {
            this.onclick = onclick;
        }

        public Onsent getOnsent() {
            return onsent;
        }

        public void setOnsent(Onsent onsent) {
            this.onsent = onsent;
        }

    }

    public class Datum {

        @SerializedName("type")
        private String type;
        @SerializedName("id")
        private String id;
        @SerializedName("url")
        private String url;
        @SerializedName("slug")
        private String slug;
        @SerializedName("bitly_gif_url")
        private String bitlyGifUrl;
        @SerializedName("bitly_url")
        private String bitlyUrl;
        @SerializedName("embed_url")
        private String embedUrl;
        @SerializedName("username")
        private String username;
        @SerializedName("source")
        private String source;
        @SerializedName("title")
        private String title;
        @SerializedName("rating")
        private String rating;
        @SerializedName("content_url")
        private String contentUrl;
        @SerializedName("source_tld")
        private String sourceTld;
        @SerializedName("source_post_url")
        private String sourcePostUrl;
        @SerializedName("is_sticker")
        private long isSticker;
        @SerializedName("import_datetime")
        private String importDatetime;
        @SerializedName("trending_datetime")
        private String trendingDatetime;
        @SerializedName("images")
        private Images images;
        @SerializedName("user")
        private User user;
        @SerializedName("analytics_response_payload")
        private String analyticsResponsePayload;
        @SerializedName("analytics")
        private Analytics analytics;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getBitlyGifUrl() {
            return bitlyGifUrl;
        }

        public void setBitlyGifUrl(String bitlyGifUrl) {
            this.bitlyGifUrl = bitlyGifUrl;
        }

        public String getBitlyUrl() {
            return bitlyUrl;
        }

        public void setBitlyUrl(String bitlyUrl) {
            this.bitlyUrl = bitlyUrl;
        }

        public String getEmbedUrl() {
            return embedUrl;
        }

        public void setEmbedUrl(String embedUrl) {
            this.embedUrl = embedUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getContentUrl() {
            return contentUrl;
        }

        public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        }

        public String getSourceTld() {
            return sourceTld;
        }

        public void setSourceTld(String sourceTld) {
            this.sourceTld = sourceTld;
        }

        public String getSourcePostUrl() {
            return sourcePostUrl;
        }

        public void setSourcePostUrl(String sourcePostUrl) {
            this.sourcePostUrl = sourcePostUrl;
        }

        public long getIsSticker() {
            return isSticker;
        }

        public void setIsSticker(long isSticker) {
            this.isSticker = isSticker;
        }

        public String getImportDatetime() {
            return importDatetime;
        }

        public void setImportDatetime(String importDatetime) {
            this.importDatetime = importDatetime;
        }

        public String getTrendingDatetime() {
            return trendingDatetime;
        }

        public void setTrendingDatetime(String trendingDatetime) {
            this.trendingDatetime = trendingDatetime;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public String getAnalyticsResponsePayload() {
            return analyticsResponsePayload;
        }

        public void setAnalyticsResponsePayload(String analyticsResponsePayload) {
            this.analyticsResponsePayload = analyticsResponsePayload;
        }

        public Analytics getAnalytics() {
            return analytics;
        }

        public void setAnalytics(Analytics analytics) {
            this.analytics = analytics;
        }

    }

    public class Downsized {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class DownsizedLarge {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class DownsizedMedium {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class DownsizedSmall {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class DownsizedStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedHeight {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedHeightDownsampled {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedHeightSmall {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedHeightSmallStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedHeightStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedWidth {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedWidthDownsampled {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedWidthSmall {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedWidthSmallStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class FixedWidthStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class Hd {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class Images {

        @SerializedName("hd")
        private Hd hd;
        @SerializedName("downsized_large")
        private DownsizedLarge downsizedLarge;
        @SerializedName("fixed_height_small_still")
        private FixedHeightSmallStill fixedHeightSmallStill;
        @SerializedName("original")
        private Original original;
        @SerializedName("fixed_height_downsampled")
        private FixedHeightDownsampled fixedHeightDownsampled;
        @SerializedName("downsized_still")
        private DownsizedStill downsizedStill;
        @SerializedName("fixed_height_still")
        private FixedHeightStill fixedHeightStill;
        @SerializedName("downsized_medium")
        private DownsizedMedium downsizedMedium;
        @SerializedName("downsized")
        private Downsized downsized;
        @SerializedName("preview_webp")
        private PreviewWebp previewWebp;
        @SerializedName("original_mp4")
        private OriginalMp4 originalMp4;
        @SerializedName("fixed_height_small")
        private FixedHeightSmall fixedHeightSmall;
        @SerializedName("fixed_height")
        private FixedHeight fixedHeight;
        @SerializedName("downsized_small")
        private DownsizedSmall downsizedSmall;
        @SerializedName("preview")
        private Preview preview;
        @SerializedName("fixed_width_downsampled")
        private FixedWidthDownsampled fixedWidthDownsampled;
        @SerializedName("fixed_width_small_still")
        private FixedWidthSmallStill fixedWidthSmallStill;
        @SerializedName("fixed_width_small")
        private FixedWidthSmall fixedWidthSmall;
        @SerializedName("original_still")
        private OriginalStill originalStill;
        @SerializedName("fixed_width_still")
        private FixedWidthStill fixedWidthStill;
        @SerializedName("looping")
        private Looping looping;
        @SerializedName("fixed_width")
        private FixedWidth fixedWidth;
        @SerializedName("preview_gif")
        private PreviewGif previewGif;
        @SerializedName("480w_still")
        private _480wStill _480wStill;

        public Hd getHd() {
            return hd;
        }

        public void setHd(Hd hd) {
            this.hd = hd;
        }

        public DownsizedLarge getDownsizedLarge() {
            return downsizedLarge;
        }

        public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
            this.downsizedLarge = downsizedLarge;
        }

        public FixedHeightSmallStill getFixedHeightSmallStill() {
            return fixedHeightSmallStill;
        }

        public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
            this.fixedHeightSmallStill = fixedHeightSmallStill;
        }

        public Original getOriginal() {
            return original;
        }

        public void setOriginal(Original original) {
            this.original = original;
        }

        public FixedHeightDownsampled getFixedHeightDownsampled() {
            return fixedHeightDownsampled;
        }

        public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
            this.fixedHeightDownsampled = fixedHeightDownsampled;
        }

        public DownsizedStill getDownsizedStill() {
            return downsizedStill;
        }

        public void setDownsizedStill(DownsizedStill downsizedStill) {
            this.downsizedStill = downsizedStill;
        }

        public FixedHeightStill getFixedHeightStill() {
            return fixedHeightStill;
        }

        public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
            this.fixedHeightStill = fixedHeightStill;
        }

        public DownsizedMedium getDownsizedMedium() {
            return downsizedMedium;
        }

        public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
            this.downsizedMedium = downsizedMedium;
        }

        public Downsized getDownsized() {
            return downsized;
        }

        public void setDownsized(Downsized downsized) {
            this.downsized = downsized;
        }

        public PreviewWebp getPreviewWebp() {
            return previewWebp;
        }

        public void setPreviewWebp(PreviewWebp previewWebp) {
            this.previewWebp = previewWebp;
        }

        public OriginalMp4 getOriginalMp4() {
            return originalMp4;
        }

        public void setOriginalMp4(OriginalMp4 originalMp4) {
            this.originalMp4 = originalMp4;
        }

        public FixedHeightSmall getFixedHeightSmall() {
            return fixedHeightSmall;
        }

        public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
            this.fixedHeightSmall = fixedHeightSmall;
        }

        public FixedHeight getFixedHeight() {
            return fixedHeight;
        }

        public void setFixedHeight(FixedHeight fixedHeight) {
            this.fixedHeight = fixedHeight;
        }

        public DownsizedSmall getDownsizedSmall() {
            return downsizedSmall;
        }

        public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
            this.downsizedSmall = downsizedSmall;
        }

        public Preview getPreview() {
            return preview;
        }

        public void setPreview(Preview preview) {
            this.preview = preview;
        }

        public FixedWidthDownsampled getFixedWidthDownsampled() {
            return fixedWidthDownsampled;
        }

        public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
            this.fixedWidthDownsampled = fixedWidthDownsampled;
        }

        public FixedWidthSmallStill getFixedWidthSmallStill() {
            return fixedWidthSmallStill;
        }

        public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
            this.fixedWidthSmallStill = fixedWidthSmallStill;
        }

        public FixedWidthSmall getFixedWidthSmall() {
            return fixedWidthSmall;
        }

        public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
            this.fixedWidthSmall = fixedWidthSmall;
        }

        public OriginalStill getOriginalStill() {
            return originalStill;
        }

        public void setOriginalStill(OriginalStill originalStill) {
            this.originalStill = originalStill;
        }

        public FixedWidthStill getFixedWidthStill() {
            return fixedWidthStill;
        }

        public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
            this.fixedWidthStill = fixedWidthStill;
        }

        public Looping getLooping() {
            return looping;
        }

        public void setLooping(Looping looping) {
            this.looping = looping;
        }

        public FixedWidth getFixedWidth() {
            return fixedWidth;
        }

        public void setFixedWidth(FixedWidth fixedWidth) {
            this.fixedWidth = fixedWidth;
        }

        public PreviewGif getPreviewGif() {
            return previewGif;
        }

        public void setPreviewGif(PreviewGif previewGif) {
            this.previewGif = previewGif;
        }

        public _480wStill get480wStill() {
            return _480wStill;
        }

        public void set480wStill(_480wStill _480wStill) {
            this._480wStill = _480wStill;
        }

    }

    public class Looping {

        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

    }

    public class Meta {

        @SerializedName("status")
        private long status;
        @SerializedName("msg")
        private String msg;
        @SerializedName("response_id")
        private String responseId;

        public long getStatus() {
            return status;
        }

        public void setStatus(long status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getResponseId() {
            return responseId;
        }

        public void setResponseId(String responseId) {
            this.responseId = responseId;
        }

    }

    public class Onclick {

        @SerializedName("url")
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Onload {

        @SerializedName("url")
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Onsent {

        @SerializedName("url")
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Original {

        @SerializedName("frames")
        private String frames;
        @SerializedName("hash")
        private String hash;
        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("webp")
        private String webp;
        @SerializedName("webp_size")
        private String webpSize;
        @SerializedName("width")
        private String width;

        public String getFrames() {
            return frames;
        }

        public void setFrames(String frames) {
            this.frames = frames;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class OriginalMp4 {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class OriginalStill {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class Pagination {

        @SerializedName("total_count")
        private int totalCount;
        @SerializedName("count")
        private int count;
        @SerializedName("offset")
        private int offset;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

    }

    public class Preview {

        @SerializedName("height")
        private String height;
        @SerializedName("mp4")
        private String mp4;
        @SerializedName("mp4_size")
        private String mp4Size;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class PreviewGif {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class PreviewWebp {

        @SerializedName("height")
        private String height;
        @SerializedName("size")
        private String size;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

    }

    public class User {

        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("banner_image")
        private String bannerImage;
        @SerializedName("banner_url")
        private String bannerUrl;
        @SerializedName("profile_url")
        private String profileUrl;
        @SerializedName("username")
        private String username;
        @SerializedName("display_name")
        private String displayName;
        @SerializedName("is_verified")
        private boolean isVerified;

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getBannerImage() {
            return bannerImage;
        }

        public void setBannerImage(String bannerImage) {
            this.bannerImage = bannerImage;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public boolean isIsVerified() {
            return isVerified;
        }

        public void setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
        }

    }

    public class _480wStill {

        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private String width;
        @SerializedName("height")
        private String height;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }
}
