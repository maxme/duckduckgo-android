package com.duckduckgo.mobile.android.dialogs.menuDialogs;

import com.duckduckgo.mobile.android.R;
import com.duckduckgo.mobile.android.activity.DuckDuckGo;
import com.duckduckgo.mobile.android.adapters.menuAdapters.HistoryStoryMenuAdapter;
import com.duckduckgo.mobile.android.objects.history.HistoryObject;
import com.duckduckgo.mobile.android.util.builders.OptionsDialogBuilder;


/*
Shows a dialog to alert the user the feedrequest failed, asking him to try again.
 */
public final class HistoryStoryMenuDialog extends OptionsDialogBuilder{
	public HistoryStoryMenuDialog(final DuckDuckGo context, HistoryObject historyObject) {
		super(context, R.string.StoryOptionsTitle);
        setContextAdapter(new HistoryStoryMenuAdapter(context, android.R.layout.select_dialog_item, android.R.id.text1, historyObject));
	}
}
