package app.com.viewpagertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.demono.adapter.InfinitePagerAdapter;

import java.util.List;

public class MyAdapter extends InfinitePagerAdapter {

    private List<String> data;
    private LayoutInflater layoutInflater;
    Context context;

    public MyAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }


    @Override
    public View getItemView(final int position, View convertView, ViewGroup container) {

        if (convertView == null) {
            //We must create a View:
            convertView = layoutInflater.inflate(R.layout.item_view, container, false);
        }
        final TextView tv = convertView.findViewById(R.id.textView);
        tv.setText(data.get(position).trim());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "CLicked on Page-->" + data.get(position).trim(), Toast.LENGTH_SHORT).show();
            }
        });
        //Here we can do changes to the convertView, such as set a text on a TextView
        //or an image on an ImageView.
        return convertView;
    }

}
