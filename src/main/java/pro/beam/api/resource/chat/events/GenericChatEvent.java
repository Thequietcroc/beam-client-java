package pro.beam.api.resource.chat.events;

import com.google.gson.annotations.SerializedName;
import pro.beam.api.resource.chat.ChatDatagram;

import java.util.List;

public abstract class GenericChatEvent<T extends GenericChatEvent.EventData> extends ChatDatagram {
    public GenericChatEvent() {
        this.type = Type.EVENT;
    }

    public EventType event;
    public List<T> data;

    public static abstract class EventData {}
    public static enum EventType {
        @SerializedName("ChatMessage") CHAT_MESSAGE,
    }
}
