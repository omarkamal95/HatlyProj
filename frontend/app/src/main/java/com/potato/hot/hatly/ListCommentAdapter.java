package com.potato.hot.hatly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nada on 12/2/15.
 */
public class ListCommentAdapter extends ArrayAdapter<ListViewComment> {
    public ListCommentAdapter(Context context, List<ListViewComment> items) {
        super(context, R.layout.fragment_comment, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            // inflate the GridView item layout
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.fragment_comment, parent, false);

            // initialize the view holder
            viewHolder = new ViewHolder();
            viewHolder.author = (TextView) convertView.findViewById(R.id.pAuthor);
            viewHolder.vcomment = (TextView) convertView.findViewById(R.id.comment);
            convertView.setTag(viewHolder);
        } else {
            // recycle the already inflated view
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // update the item view
        ListViewComment comment = getItem(position);
        viewHolder.author.setText(comment.author);
        viewHolder.vcomment.setText(comment.comment);

        return convertView;
    }

    /**
     * The view holder design pattern prevents using findViewById()
     * repeatedly in the getView() method of the adapter.
     *
     * @see http://developer.android.com/training/improving-layouts/smooth-scrolling.html#ViewHolder
     */
    private static class ViewHolder {
        TextView author;
        TextView vcomment;
    }

}
