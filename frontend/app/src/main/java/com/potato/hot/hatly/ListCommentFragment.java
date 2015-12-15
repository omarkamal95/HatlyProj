package com.potato.hot.hatly;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nada on 12/2/15.
 */
public class ListCommentFragment extends ListFragment {
    private List<ListViewComment> ListOfComments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initialize the items list
        ListOfComments = new ArrayList<ListViewComment>();

        ListOfComments.add(new ListViewComment("Author of Comment","Comment Text"));


        // initialize and set the list adapter
        setListAdapter(new ListCommentAdapter(getActivity(), ListOfComments));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // remove the dividers from the ListView of the ListFragment
        getListView().setDivider(null);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // retrieve theListView item
        ListViewComment item = ListOfComments.get(position);

        // do something
        Toast.makeText(getActivity(), item.author, Toast.LENGTH_SHORT).show();
    }
}

