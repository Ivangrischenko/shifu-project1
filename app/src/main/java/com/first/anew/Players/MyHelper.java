package com.first.anew.Players;

import android.util.Log;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyHelper  {
    Realm realm;
   // final RealmResults<Player> players = realm.where(Player.class).findAll();

    public MyHelper(Realm realm) {
        this.realm = realm;
    }

    public void save(final Player player){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                if (realm != null){
                    Log.d ( "ppppp", "урааааа");
                    Number currentIdSum = realm.where(Player.class).max("id");
                    int nextId;
                    if (currentIdSum==null){
                        nextId = 1;
                    }else {
                        nextId = currentIdSum.intValue() + 1;
                    }
                    player.setId(nextId);
                    Player p = realm.copyToRealm(player);
                }else {
                    Log.e ( "ppppp", "data");
                }

            }
        });
    }



    //select data from
    public List<Player> getAllRealmM(){
        List<Player> playerList = realm.where(Player.class).findAll();
        return playerList;
    }


}
