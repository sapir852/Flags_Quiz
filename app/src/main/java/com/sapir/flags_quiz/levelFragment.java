//package com.sapir.flags_quiz;
//
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//public class levelFragment extends Fragment {
//    private final Data_Manager dataManager = Data_Manager.getData();
//
//    private AppCompatActivity appCompatActivity;
//    private RecyclerView recyclerView;
//    private LevelAdapter levelAdapter;
//
//    private static final String ARG_COLUMN_COUNT = "column-count";
//    private CallBack_level callBack_userProtocol;
//
//    public void setCallBackLevel(CallBack_level callBack_userProtocol) {
//        this.callBack_userProtocol = callBack_userProtocol;
//    }
//
//    CallBack_level callBackLevel = new CallBack_level(){
//
//
//            @Override
//            public void onClicked() {
//                getParentFragmentManager().beginTransaction().replace(R.id.main_frameLayout, levelFragment.this).commit();
//            }
//        };
//
//
//
//    public Fragment setActivity(AppCompatActivity appCompatActivity){
//        this.appCompatActivity=appCompatActivity;
//        return this;
//    }
//
//
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        if (getArguments() != null) {
//            //mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_level_list, container, false);
//        findViews(view);
//        return view;
//    }
//
//    private void findViews(View view) {
//        recyclerView = view.findViewById(R.id.main_LST_level);
//        levelAdapter = new LevelAdapter(appCompatActivity, dataManager.getLevel());
//        recyclerView.setLayoutManager(new GridLayoutManager(appCompatActivity, 2));
//        recyclerView.setAdapter(levelAdapter);
//    }
//
//}