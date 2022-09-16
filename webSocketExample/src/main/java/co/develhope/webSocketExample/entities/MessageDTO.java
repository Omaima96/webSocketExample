package co.develhope.webSocketExample.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class MessageDTO {

        private String type;
        private String text;

    }


