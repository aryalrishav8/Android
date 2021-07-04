package com.example.myapplication;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {


    private ArrayList<contact> contacts = new ArrayList<>();

    public ContactAdapter(){
        public Context context;
    }
    public ContactAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @@ -32,7 +42,21 @@ public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View holder argument
        //position => index of the item in the array
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.contactName.setText(contacts.get(0).getName());
            holder.contactName.setText(contacts.get(position).getName());
            holder.contactEmail.setText((contacts.get(position).getEmail()));

            // to set onClickListener to the card view itself
            holder.parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(context, v, contacts.get(position).getName() + " Selected", Snackbar.LENGTH_LONG).show();
                }
            });
    @NonNull
    @Override
    //Create an instance of view holder class in every item in our recycler view
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item, parent, false);
        RecyclerView.ViewHolder holder = new RecyclerView.ViewHolder(view);
        return holder;
    }

    @Override
    //View holder argument
    //position => index of the item in the array
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contactName.setText(contacts.get(0).getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    //inner class
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView contactName;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            contactName = itemView.findViewById(R.id.contactName);
        }

    }
}