package com.jemfillex.translatorbot;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class TranslatorBot {

    private final ShardManager shardManager;
    public TranslatorBot (){
        String token = "OTY1MzQ4ODgxMjc5ODk3NjIw.GtQX84.Y_3wMPQhUW29ALv0BZoXBVEhvV9R4fCa7YRlzI";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("gAycraft"));
       shardManager = builder.build();

    }

    public ShardManager getShardManager() {
        return shardManager;
    }
    public static void main(String)



    }











