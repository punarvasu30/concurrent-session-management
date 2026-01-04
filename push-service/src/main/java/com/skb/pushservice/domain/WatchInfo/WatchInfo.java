package com.skb.pushservice.domain.WatchInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class WatchInfo {

    @JsonProperty
    private String pcid;

    private String episodeId;

    private String stbId;

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

    private String playStart;

    private String macAddress;

    private String playEnd;

    private boolean running;

}
