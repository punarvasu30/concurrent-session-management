package com.skb.checkservice.domain.WatchInfo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;


public class WatchInfoDto {

    @Getter
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class Request {

        private String pcid;

        public String getPcid() {
            return pcid;
        }

        public String getEpisodeId() {
            return episodeId;
        }

        public String getStbId() {
            return stbId;
        }

        public String getMacAddress() {
            return macAddress;
        }

        public String getPlayStart() {
            return playStart;
        }

        public String getPlayEnd() {
            return playEnd;
        }

        public boolean isRunning() {
            return running;
        }

        private String episodeId;

        private String stbId;

        private String macAddress;

        private String playStart;

        private String playEnd;

        private boolean running;

        public WatchInfo toEntity() {
            return new WatchInfo(
                    pcid,
                    episodeId,
                    stbId,
                    macAddress,
                    playStart,
                    playEnd,
                    running
            );
        }
    }

}
