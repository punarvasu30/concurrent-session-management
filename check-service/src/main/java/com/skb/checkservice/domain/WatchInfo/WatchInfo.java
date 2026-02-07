package com.skb.checkservice.domain.WatchInfo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@RedisHash("watchLog")
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WatchInfo implements Serializable {

    private String pcid;

    private String episodeId;

    public String getPcid() {
        return pcid;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public String getStbId() {
        return stbId;
    }

    public String getPlayStart() {
        return playStart;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getPlayEnd() {
        return playEnd;
    }

    public boolean isRunning() {
        return running;
    }

    private String stbId;

    private String playStart;

    private String macAddress;

    private String playEnd;

    private boolean running;
    public WatchInfo() {}

    public WatchInfo(
            String pcid,
            String episodeId,
            String stbId,
            String macAddress,
            String playStart,
            String playEnd,
            boolean running
    ) {
        this.pcid = pcid;
        this.episodeId = episodeId;
        this.stbId = stbId;
        this.macAddress = macAddress;
        this.playStart = playStart;
        this.playEnd = playEnd;
        this.running = running;
    }

}