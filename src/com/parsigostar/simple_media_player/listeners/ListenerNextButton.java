package com.parsigostar.simple_media_player.listeners;

import android.app.Activity;
import android.view.View;
import com.parsigostar.simple_media_player.G;

/**
 * Created by Mohammad on 6/19/14.
 */
public class ListenerNextButton extends Activity implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        G.mediaManager.moveCurrentPosition(1);
    }
}
