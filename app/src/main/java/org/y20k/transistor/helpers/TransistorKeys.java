/**
 * TransistorKeys.java
 * Implements the keys used throughout the app
 * This class hosts all keys used to control Transistor's state
 *
 * This file is part of
 * TRANSISTOR - Radio App for Android
 *
 * Copyright (c) 2015-16 - Y20K.org
 * Licensed under the MIT-License
 * http://opensource.org/licenses/MIT
 */

package org.y20k.transistor.helpers;


/**
 * TransistorKeys class
 */
public class TransistorKeys {

    /* ACTIONS */
    public static final String ACTION_PLAY = "org.y20k.transistor.action.PLAY";
    public static final String ACTION_STOP = "org.y20k.transistor.action.STOP";
    public static final String ACTION_PLAYBACK_STARTED = "org.y20k.transistor.action.PLAYBACK_STARTED";
    public static final String ACTION_PLAYBACK_STOPPED = "org.y20k.transistor.action.PLAYBACK_STOPPED";
    public static final String ACTION_CREATE_SHORTCUT_REQUESTED = "org.y20k.transistor.action.CREATE_SHORTCUT_REQUESTED";
    public static final String ACTION_CHANGE_VIEW_SELECTION = "org.y20k.transistor.action.CHANGE_VIEW_SELECTION";
    public static final String ACTION_COLLECTION_CHANGED = "org.y20k.transistor.action.COLLECTION_CHANGED";
    public static final String ACTION_IMAGE_CHANGE_REQUESTED = "org.y20k.transistor.action.IMAGE_CHANGE_REQUESTED";
    public static final String ACTION_METADATA_CHANGED = "org.y20k.transistor.action.METADATA_CHANGED";
    public static final String ACTION_SHOW_PLAYER = "org.y20k.transistor.action.SHOW_PLAYER";
    public static final String ACTION_TIMER_RUNNING = "org.y20k.transistor.action.TIMER_RUNNING";
    public static final String ACTION_TIMER_START = "org.y20k.transistor.action.TIMER_START";
    public static final String ACTION_TIMER_STOP = "org.y20k.transistor.action.TIMER_STOP";

    /* EXTRAS */
    public static final String EXTRA_COLLECTION_CHANGE = "COLLECTION_CHANGE";
    public static final String EXTRA_INFOSHEET_TITLE = "INFOSHEET_TITLE";
    public static final String EXTRA_INFOSHEET_CONTENT = "INFOSHEET_CONTENT";
    public static final String EXTRA_METADATA = "METADATA";
    public static final String EXTRA_PLAYBACK_STATE = "PLAYBACK_STATE";
    public static final String EXTRA_STATION = "STATION";
    public static final String EXTRA_STATION_ID = "STATION_ID";
    public static final String EXTRA_STATION_NEW_NAME = "STATION_NEW_NAME";
    public static final String EXTRA_STATION_URI_CURRENT = "STATION_URI_CURRENT";
    public static final String EXTRA_STREAM_URI = "STREAM_URI";
    public static final String EXTRA_TIMER_DURATION = "TIMER_DURATION";
    public static final String EXTRA_TIMER_REMAINING = "TIMER_REMAINING";

    /* ARGS */
    public static final String ARG_STATION = "ArgStation";
    public static final String ARG_STATION_ID = "ArgStationID";
    public static final String ARG_TWO_PANE = "ArgTwoPane";
    public static final String ARG_PLAYBACK = "ArgPlayback";

    /* PREFS */
    public static final String PREF_PLAYBACK = "prefPlayback";
    public static final String PREF_STATION_ID_CURRENT = "prefStationIDCurrent";
    public static final String PREF_STATION_ID_LAST = "prefStationIDLast";
    public static final String PREF_STATION_ID_SELECTED = "prefStationIDSelected";
    public static final String PREF_STATION_METADATA = "prefStationMetadata";
    public static final String PREF_TIMER_RUNNING = "prefTimerRunning";
    public static final String PREF_TWO_PANE = "prefTwoPane";

    /* MISC */
    public static final int INFOSHEET_CONTENT_ABOUT = 1;
    public static final int INFOSHEET_CONTENT_HOWTO = 2;
    public static final int PERMISSION_REQUEST_IMAGE_PICKER_READ_EXTERNAL_STORAGE = 1;
    public static final int PERMISSION_REQUEST_STATION_FETCHER_READ_EXTERNAL_STORAGE = 2;

    public static final int PLAYER_SERVICE_NOTIFICATION_ID = 1;
    public static final int REQUEST_LOAD_IMAGE = 1;
    public static final int STATION_ADDED = 1;
    public static final int STATION_RENAMED = 2;
    public static final int STATION_DELETED = 3;
    public static final String INSTANCE_LIST_STATE = "instanceListState";
    public static final String PLAYERFRAGMENT_TAG = "PFTAG";
    public static final String SHOUTCAST_STREAM_TITLE_HEADER = "StreamTitle='";

}
