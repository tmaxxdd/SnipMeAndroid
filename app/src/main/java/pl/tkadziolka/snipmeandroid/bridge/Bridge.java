// Autogenerated from Pigeon (v4.2.3), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package pl.tkadziolka.snipmeandroid.bridge;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Bridge {

  public enum SnippetLanguageType {
    C(0),
    CPP(1),
    OBJECTIVE_C(2),
    C_SHARP(3),
    JAVA(4),
    BASH(5),
    PYTHON(6),
    PERL(7),
    RUBY(8),
    SWIFT(9),
    JAVASCRIPT(10),
    KOTLIN(11),
    COFFEESCRIPT(12),
    RUST(13),
    BASIC(14),
    CLOJURE(15),
    CSS(16),
    DART(17),
    ERLANG(18),
    GO(19),
    HASKELL(20),
    LISP(21),
    LLVM(22),
    LUA(23),
    MATLAB(24),
    ML(25),
    MUMPS(26),
    NEMERLE(27),
    PASCAL(28),
    R(29),
    RD(30),
    SCALA(31),
    SQL(32),
    TEX(33),
    VB(34),
    VHDL(35),
    TCL(36),
    XQUERY(37),
    YAML(38),
    MARKDOWN(39),
    JSON(40),
    XML(41),
    PROTO(42),
    REGEX(43),
    UNKNOWN(44);

    private int index;
    private SnippetLanguageType(final int index) {
      this.index = index;
    }
  }

  public enum SnippetFilterType {
    ALL(0),
    MINE(1),
    SHARED(2);

    private int index;
    private SnippetFilterType(final int index) {
      this.index = index;
    }
  }

  public enum UserReaction {
    NONE(0),
    LIKE(1),
    DISLIKE(2);

    private int index;
    private UserReaction(final int index) {
      this.index = index;
    }
  }

  public enum ModelState {
    LOADING(0),
    LOADED(1),
    ERROR(2);

    private int index;
    private ModelState(final int index) {
      this.index = index;
    }
  }

  public enum MainModelEvent {
    NONE(0),
    ALERT(1),
    LOGOUT(2);

    private int index;
    private MainModelEvent(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Snippet {
    private @Nullable String uuid;
    public @Nullable String getUuid() { return uuid; }
    public void setUuid(@Nullable String setterArg) {
      this.uuid = setterArg;
    }

    private @Nullable String title;
    public @Nullable String getTitle() { return title; }
    public void setTitle(@Nullable String setterArg) {
      this.title = setterArg;
    }

    private @Nullable SnippetCode code;
    public @Nullable SnippetCode getCode() { return code; }
    public void setCode(@Nullable SnippetCode setterArg) {
      this.code = setterArg;
    }

    private @Nullable SnippetLanguage language;
    public @Nullable SnippetLanguage getLanguage() { return language; }
    public void setLanguage(@Nullable SnippetLanguage setterArg) {
      this.language = setterArg;
    }

    private @Nullable Owner owner;
    public @Nullable Owner getOwner() { return owner; }
    public void setOwner(@Nullable Owner setterArg) {
      this.owner = setterArg;
    }

    private @Nullable Boolean isOwner;
    public @Nullable Boolean getIsOwner() { return isOwner; }
    public void setIsOwner(@Nullable Boolean setterArg) {
      this.isOwner = setterArg;
    }

    private @Nullable String timeAgo;
    public @Nullable String getTimeAgo() { return timeAgo; }
    public void setTimeAgo(@Nullable String setterArg) {
      this.timeAgo = setterArg;
    }

    private @Nullable Long voteResult;
    public @Nullable Long getVoteResult() { return voteResult; }
    public void setVoteResult(@Nullable Long setterArg) {
      this.voteResult = setterArg;
    }

    private @Nullable UserReaction userReaction;
    public @Nullable UserReaction getUserReaction() { return userReaction; }
    public void setUserReaction(@Nullable UserReaction setterArg) {
      this.userReaction = setterArg;
    }

    private @Nullable Boolean isPrivate;
    public @Nullable Boolean getIsPrivate() { return isPrivate; }
    public void setIsPrivate(@Nullable Boolean setterArg) {
      this.isPrivate = setterArg;
    }

    private @Nullable Boolean isLiked;
    public @Nullable Boolean getIsLiked() { return isLiked; }
    public void setIsLiked(@Nullable Boolean setterArg) {
      this.isLiked = setterArg;
    }

    private @Nullable Boolean isDisliked;
    public @Nullable Boolean getIsDisliked() { return isDisliked; }
    public void setIsDisliked(@Nullable Boolean setterArg) {
      this.isDisliked = setterArg;
    }

    private @Nullable Boolean isSaved;
    public @Nullable Boolean getIsSaved() { return isSaved; }
    public void setIsSaved(@Nullable Boolean setterArg) {
      this.isSaved = setterArg;
    }

    public static final class Builder {
      private @Nullable String uuid;
      public @NonNull Builder setUuid(@Nullable String setterArg) {
        this.uuid = setterArg;
        return this;
      }
      private @Nullable String title;
      public @NonNull Builder setTitle(@Nullable String setterArg) {
        this.title = setterArg;
        return this;
      }
      private @Nullable SnippetCode code;
      public @NonNull Builder setCode(@Nullable SnippetCode setterArg) {
        this.code = setterArg;
        return this;
      }
      private @Nullable SnippetLanguage language;
      public @NonNull Builder setLanguage(@Nullable SnippetLanguage setterArg) {
        this.language = setterArg;
        return this;
      }
      private @Nullable Owner owner;
      public @NonNull Builder setOwner(@Nullable Owner setterArg) {
        this.owner = setterArg;
        return this;
      }
      private @Nullable Boolean isOwner;
      public @NonNull Builder setIsOwner(@Nullable Boolean setterArg) {
        this.isOwner = setterArg;
        return this;
      }
      private @Nullable String timeAgo;
      public @NonNull Builder setTimeAgo(@Nullable String setterArg) {
        this.timeAgo = setterArg;
        return this;
      }
      private @Nullable Long voteResult;
      public @NonNull Builder setVoteResult(@Nullable Long setterArg) {
        this.voteResult = setterArg;
        return this;
      }
      private @Nullable UserReaction userReaction;
      public @NonNull Builder setUserReaction(@Nullable UserReaction setterArg) {
        this.userReaction = setterArg;
        return this;
      }
      private @Nullable Boolean isPrivate;
      public @NonNull Builder setIsPrivate(@Nullable Boolean setterArg) {
        this.isPrivate = setterArg;
        return this;
      }
      private @Nullable Boolean isLiked;
      public @NonNull Builder setIsLiked(@Nullable Boolean setterArg) {
        this.isLiked = setterArg;
        return this;
      }
      private @Nullable Boolean isDisliked;
      public @NonNull Builder setIsDisliked(@Nullable Boolean setterArg) {
        this.isDisliked = setterArg;
        return this;
      }
      private @Nullable Boolean isSaved;
      public @NonNull Builder setIsSaved(@Nullable Boolean setterArg) {
        this.isSaved = setterArg;
        return this;
      }
      public @NonNull Snippet build() {
        Snippet pigeonReturn = new Snippet();
        pigeonReturn.setUuid(uuid);
        pigeonReturn.setTitle(title);
        pigeonReturn.setCode(code);
        pigeonReturn.setLanguage(language);
        pigeonReturn.setOwner(owner);
        pigeonReturn.setIsOwner(isOwner);
        pigeonReturn.setTimeAgo(timeAgo);
        pigeonReturn.setVoteResult(voteResult);
        pigeonReturn.setUserReaction(userReaction);
        pigeonReturn.setIsPrivate(isPrivate);
        pigeonReturn.setIsLiked(isLiked);
        pigeonReturn.setIsDisliked(isDisliked);
        pigeonReturn.setIsSaved(isSaved);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("uuid", uuid);
      toMapResult.put("title", title);
      toMapResult.put("code", (code == null) ? null : code.toMap());
      toMapResult.put("language", (language == null) ? null : language.toMap());
      toMapResult.put("owner", (owner == null) ? null : owner.toMap());
      toMapResult.put("isOwner", isOwner);
      toMapResult.put("timeAgo", timeAgo);
      toMapResult.put("voteResult", voteResult);
      toMapResult.put("userReaction", userReaction == null ? null : userReaction.index);
      toMapResult.put("isPrivate", isPrivate);
      toMapResult.put("isLiked", isLiked);
      toMapResult.put("isDisliked", isDisliked);
      toMapResult.put("isSaved", isSaved);
      return toMapResult;
    }
    static @NonNull Snippet fromMap(@NonNull Map<String, Object> map) {
      Snippet pigeonResult = new Snippet();
      Object uuid = map.get("uuid");
      pigeonResult.setUuid((String)uuid);
      Object title = map.get("title");
      pigeonResult.setTitle((String)title);
      Object code = map.get("code");
      pigeonResult.setCode((code == null) ? null : SnippetCode.fromMap((Map)code));
      Object language = map.get("language");
      pigeonResult.setLanguage((language == null) ? null : SnippetLanguage.fromMap((Map)language));
      Object owner = map.get("owner");
      pigeonResult.setOwner((owner == null) ? null : Owner.fromMap((Map)owner));
      Object isOwner = map.get("isOwner");
      pigeonResult.setIsOwner((Boolean)isOwner);
      Object timeAgo = map.get("timeAgo");
      pigeonResult.setTimeAgo((String)timeAgo);
      Object voteResult = map.get("voteResult");
      pigeonResult.setVoteResult((voteResult == null) ? null : ((voteResult instanceof Integer) ? (Integer)voteResult : (Long)voteResult));
      Object userReaction = map.get("userReaction");
      pigeonResult.setUserReaction(userReaction == null ? null : UserReaction.values()[(int)userReaction]);
      Object isPrivate = map.get("isPrivate");
      pigeonResult.setIsPrivate((Boolean)isPrivate);
      Object isLiked = map.get("isLiked");
      pigeonResult.setIsLiked((Boolean)isLiked);
      Object isDisliked = map.get("isDisliked");
      pigeonResult.setIsDisliked((Boolean)isDisliked);
      Object isSaved = map.get("isSaved");
      pigeonResult.setIsSaved((Boolean)isSaved);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SnippetCode {
    private @Nullable String raw;
    public @Nullable String getRaw() { return raw; }
    public void setRaw(@Nullable String setterArg) {
      this.raw = setterArg;
    }

    private @Nullable List<SyntaxToken> tokens;
    public @Nullable List<SyntaxToken> getTokens() { return tokens; }
    public void setTokens(@Nullable List<SyntaxToken> setterArg) {
      this.tokens = setterArg;
    }

    public static final class Builder {
      private @Nullable String raw;
      public @NonNull Builder setRaw(@Nullable String setterArg) {
        this.raw = setterArg;
        return this;
      }
      private @Nullable List<SyntaxToken> tokens;
      public @NonNull Builder setTokens(@Nullable List<SyntaxToken> setterArg) {
        this.tokens = setterArg;
        return this;
      }
      public @NonNull SnippetCode build() {
        SnippetCode pigeonReturn = new SnippetCode();
        pigeonReturn.setRaw(raw);
        pigeonReturn.setTokens(tokens);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("raw", raw);
      toMapResult.put("tokens", tokens);
      return toMapResult;
    }
    static @NonNull SnippetCode fromMap(@NonNull Map<String, Object> map) {
      SnippetCode pigeonResult = new SnippetCode();
      Object raw = map.get("raw");
      pigeonResult.setRaw((String)raw);
      Object tokens = map.get("tokens");
      pigeonResult.setTokens((List<SyntaxToken>)tokens);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SyntaxToken {
    private @Nullable Long start;
    public @Nullable Long getStart() { return start; }
    public void setStart(@Nullable Long setterArg) {
      this.start = setterArg;
    }

    private @Nullable Long end;
    public @Nullable Long getEnd() { return end; }
    public void setEnd(@Nullable Long setterArg) {
      this.end = setterArg;
    }

    private @Nullable Long color;
    public @Nullable Long getColor() { return color; }
    public void setColor(@Nullable Long setterArg) {
      this.color = setterArg;
    }

    public static final class Builder {
      private @Nullable Long start;
      public @NonNull Builder setStart(@Nullable Long setterArg) {
        this.start = setterArg;
        return this;
      }
      private @Nullable Long end;
      public @NonNull Builder setEnd(@Nullable Long setterArg) {
        this.end = setterArg;
        return this;
      }
      private @Nullable Long color;
      public @NonNull Builder setColor(@Nullable Long setterArg) {
        this.color = setterArg;
        return this;
      }
      public @NonNull SyntaxToken build() {
        SyntaxToken pigeonReturn = new SyntaxToken();
        pigeonReturn.setStart(start);
        pigeonReturn.setEnd(end);
        pigeonReturn.setColor(color);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("start", start);
      toMapResult.put("end", end);
      toMapResult.put("color", color);
      return toMapResult;
    }
    static @NonNull SyntaxToken fromMap(@NonNull Map<String, Object> map) {
      SyntaxToken pigeonResult = new SyntaxToken();
      Object start = map.get("start");
      pigeonResult.setStart((start == null) ? null : ((start instanceof Integer) ? (Integer)start : (Long)start));
      Object end = map.get("end");
      pigeonResult.setEnd((end == null) ? null : ((end instanceof Integer) ? (Integer)end : (Long)end));
      Object color = map.get("color");
      pigeonResult.setColor((color == null) ? null : ((color instanceof Integer) ? (Integer)color : (Long)color));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SnippetLanguage {
    private @Nullable String raw;
    public @Nullable String getRaw() { return raw; }
    public void setRaw(@Nullable String setterArg) {
      this.raw = setterArg;
    }

    private @Nullable SnippetLanguageType type;
    public @Nullable SnippetLanguageType getType() { return type; }
    public void setType(@Nullable SnippetLanguageType setterArg) {
      this.type = setterArg;
    }

    public static final class Builder {
      private @Nullable String raw;
      public @NonNull Builder setRaw(@Nullable String setterArg) {
        this.raw = setterArg;
        return this;
      }
      private @Nullable SnippetLanguageType type;
      public @NonNull Builder setType(@Nullable SnippetLanguageType setterArg) {
        this.type = setterArg;
        return this;
      }
      public @NonNull SnippetLanguage build() {
        SnippetLanguage pigeonReturn = new SnippetLanguage();
        pigeonReturn.setRaw(raw);
        pigeonReturn.setType(type);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("raw", raw);
      toMapResult.put("type", type == null ? null : type.index);
      return toMapResult;
    }
    static @NonNull SnippetLanguage fromMap(@NonNull Map<String, Object> map) {
      SnippetLanguage pigeonResult = new SnippetLanguage();
      Object raw = map.get("raw");
      pigeonResult.setRaw((String)raw);
      Object type = map.get("type");
      pigeonResult.setType(type == null ? null : SnippetLanguageType.values()[(int)type]);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Owner {
    private @Nullable Long id;
    public @Nullable Long getId() { return id; }
    public void setId(@Nullable Long setterArg) {
      this.id = setterArg;
    }

    private @Nullable String login;
    public @Nullable String getLogin() { return login; }
    public void setLogin(@Nullable String setterArg) {
      this.login = setterArg;
    }

    public static final class Builder {
      private @Nullable Long id;
      public @NonNull Builder setId(@Nullable Long setterArg) {
        this.id = setterArg;
        return this;
      }
      private @Nullable String login;
      public @NonNull Builder setLogin(@Nullable String setterArg) {
        this.login = setterArg;
        return this;
      }
      public @NonNull Owner build() {
        Owner pigeonReturn = new Owner();
        pigeonReturn.setId(id);
        pigeonReturn.setLogin(login);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("id", id);
      toMapResult.put("login", login);
      return toMapResult;
    }
    static @NonNull Owner fromMap(@NonNull Map<String, Object> map) {
      Owner pigeonResult = new Owner();
      Object id = map.get("id");
      pigeonResult.setId((id == null) ? null : ((id instanceof Integer) ? (Integer)id : (Long)id));
      Object login = map.get("login");
      pigeonResult.setLogin((String)login);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SnippetFilter {
    private @Nullable SnippetFilterType type;
    public @Nullable SnippetFilterType getType() { return type; }
    public void setType(@Nullable SnippetFilterType setterArg) {
      this.type = setterArg;
    }

    public static final class Builder {
      private @Nullable SnippetFilterType type;
      public @NonNull Builder setType(@Nullable SnippetFilterType setterArg) {
        this.type = setterArg;
        return this;
      }
      public @NonNull SnippetFilter build() {
        SnippetFilter pigeonReturn = new SnippetFilter();
        pigeonReturn.setType(type);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("type", type == null ? null : type.index);
      return toMapResult;
    }
    static @NonNull SnippetFilter fromMap(@NonNull Map<String, Object> map) {
      SnippetFilter pigeonResult = new SnippetFilter();
      Object type = map.get("type");
      pigeonResult.setType(type == null ? null : SnippetFilterType.values()[(int)type]);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MainModelStateData {
    private @Nullable ModelState state;
    public @Nullable ModelState getState() { return state; }
    public void setState(@Nullable ModelState setterArg) {
      this.state = setterArg;
    }

    private @Nullable Boolean is_loading;
    public @Nullable Boolean getIs_loading() { return is_loading; }
    public void setIs_loading(@Nullable Boolean setterArg) {
      this.is_loading = setterArg;
    }

    private @Nullable List<Snippet> data;
    public @Nullable List<Snippet> getData() { return data; }
    public void setData(@Nullable List<Snippet> setterArg) {
      this.data = setterArg;
    }

    private @Nullable String error;
    public @Nullable String getError() { return error; }
    public void setError(@Nullable String setterArg) {
      this.error = setterArg;
    }

    public static final class Builder {
      private @Nullable ModelState state;
      public @NonNull Builder setState(@Nullable ModelState setterArg) {
        this.state = setterArg;
        return this;
      }
      private @Nullable Boolean is_loading;
      public @NonNull Builder setIs_loading(@Nullable Boolean setterArg) {
        this.is_loading = setterArg;
        return this;
      }
      private @Nullable List<Snippet> data;
      public @NonNull Builder setData(@Nullable List<Snippet> setterArg) {
        this.data = setterArg;
        return this;
      }
      private @Nullable String error;
      public @NonNull Builder setError(@Nullable String setterArg) {
        this.error = setterArg;
        return this;
      }
      public @NonNull MainModelStateData build() {
        MainModelStateData pigeonReturn = new MainModelStateData();
        pigeonReturn.setState(state);
        pigeonReturn.setIs_loading(is_loading);
        pigeonReturn.setData(data);
        pigeonReturn.setError(error);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("state", state == null ? null : state.index);
      toMapResult.put("is_loading", is_loading);
      toMapResult.put("data", data);
      toMapResult.put("error", error);
      return toMapResult;
    }
    static @NonNull MainModelStateData fromMap(@NonNull Map<String, Object> map) {
      MainModelStateData pigeonResult = new MainModelStateData();
      Object state = map.get("state");
      pigeonResult.setState(state == null ? null : ModelState.values()[(int)state]);
      Object is_loading = map.get("is_loading");
      pigeonResult.setIs_loading((Boolean)is_loading);
      Object data = map.get("data");
      pigeonResult.setData((List<Snippet>)data);
      Object error = map.get("error");
      pigeonResult.setError((String)error);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MainModelEventData {
    private @Nullable MainModelEvent event;
    public @Nullable MainModelEvent getEvent() { return event; }
    public void setEvent(@Nullable MainModelEvent setterArg) {
      this.event = setterArg;
    }

    private @Nullable String message;
    public @Nullable String getMessage() { return message; }
    public void setMessage(@Nullable String setterArg) {
      this.message = setterArg;
    }

    public static final class Builder {
      private @Nullable MainModelEvent event;
      public @NonNull Builder setEvent(@Nullable MainModelEvent setterArg) {
        this.event = setterArg;
        return this;
      }
      private @Nullable String message;
      public @NonNull Builder setMessage(@Nullable String setterArg) {
        this.message = setterArg;
        return this;
      }
      public @NonNull MainModelEventData build() {
        MainModelEventData pigeonReturn = new MainModelEventData();
        pigeonReturn.setEvent(event);
        pigeonReturn.setMessage(message);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("event", event == null ? null : event.index);
      toMapResult.put("message", message);
      return toMapResult;
    }
    static @NonNull MainModelEventData fromMap(@NonNull Map<String, Object> map) {
      MainModelEventData pigeonResult = new MainModelEventData();
      Object event = map.get("event");
      pigeonResult.setEvent(event == null ? null : MainModelEvent.values()[(int)event]);
      Object message = map.get("message");
      pigeonResult.setMessage((String)message);
      return pigeonResult;
    }
  }
  private static class MainModelBridgeCodec extends StandardMessageCodec {
    public static final MainModelBridgeCodec INSTANCE = new MainModelBridgeCodec();
    private MainModelBridgeCodec() {}
    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return MainModelEventData.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return MainModelStateData.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return Owner.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)131:         
          return Snippet.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)132:         
          return SnippetCode.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)133:         
          return SnippetFilter.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)134:         
          return SnippetLanguage.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)135:         
          return SyntaxToken.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value)     {
      if (value instanceof MainModelEventData) {
        stream.write(128);
        writeValue(stream, ((MainModelEventData) value).toMap());
      } else 
      if (value instanceof MainModelStateData) {
        stream.write(129);
        writeValue(stream, ((MainModelStateData) value).toMap());
      } else 
      if (value instanceof Owner) {
        stream.write(130);
        writeValue(stream, ((Owner) value).toMap());
      } else 
      if (value instanceof Snippet) {
        stream.write(131);
        writeValue(stream, ((Snippet) value).toMap());
      } else 
      if (value instanceof SnippetCode) {
        stream.write(132);
        writeValue(stream, ((SnippetCode) value).toMap());
      } else 
      if (value instanceof SnippetFilter) {
        stream.write(133);
        writeValue(stream, ((SnippetFilter) value).toMap());
      } else 
      if (value instanceof SnippetLanguage) {
        stream.write(134);
        writeValue(stream, ((SnippetLanguage) value).toMap());
      } else 
      if (value instanceof SyntaxToken) {
        stream.write(135);
        writeValue(stream, ((SyntaxToken) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface MainModelBridge {
    @NonNull MainModelStateData getState();
    @NonNull MainModelEventData getEvent();
    void initState();
    void loadNextPage();
    void filter(@NonNull SnippetFilter filter);
    void logOut();
    void refreshSnippetUpdates();

    /** The codec used by MainModelBridge. */
    static MessageCodec<Object> getCodec() {
      return       MainModelBridgeCodec.INSTANCE;    }
    /**Sets up an instance of `MainModelBridge` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, MainModelBridge api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.getState", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              MainModelStateData output = api.getState();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.getEvent", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              MainModelEventData output = api.getEvent();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.initState", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.initState();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.loadNextPage", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.loadNextPage();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.filter", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              assert args != null;
              SnippetFilter filterArg = (SnippetFilter)args.get(0);
              if (filterArg == null) {
                throw new NullPointerException("filterArg unexpectedly null.");
              }
              api.filter(filterArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.logOut", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.logOut();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainModelBridge.refreshSnippetUpdates", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.refreshSnippetUpdates();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  @NonNull private static Map<String, Object> wrapError(@NonNull Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
